package com.grepp.servlet.infra.db;

import com.grepp.servlet.infra.exception.DataAccessException;
import com.grepp.servlet.infra.exception.JdbcInitializeException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcTemplate {
    
    private static JdbcTemplate instance;
    private String url;
    private String user;
    private String password;
    
    private JdbcTemplate(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new JdbcInitializeException(e.getMessage(), e);
        }
    }
    
    public static JdbcTemplate getInstance() {
        if (instance == null) {
            throw new JdbcInitializeException("JdbcTemplate not initialized, please call init()");
        }
        return instance;
    }
    
    public static JdbcTemplate init(String url, String user, String password) {
        if (instance == null) {
            instance = new JdbcTemplate(url, user, password);
        }
        
        return instance;
    }
    
    public Connection getConnection() {
        Connection conn = null;
        
        try {
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false);
            return conn;
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        }
    }
    
    public void commit(Connection conn) {
        try {
            conn.commit();
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        }
    }
    
    public void rollback(Connection conn) {
        try {
            conn.rollback();
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        }
    }
    
    public void close(Connection conn) {
        try {
            if (conn == null || conn.isClosed()) {
                return;
            }
            conn.close();
        } catch (SQLException e) {
            throw new DataAccessException(e.getMessage(), e);
        }
    }
    
    
}
