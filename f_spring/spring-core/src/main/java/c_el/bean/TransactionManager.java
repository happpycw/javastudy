package c_el.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TransactionManager {
    
    private final JdbcProperties jdbcProperties;
    private final JdbcTemplate jdbcTemplate;
    
    public TransactionManager(
        @Qualifier("oracleProperties")
        JdbcProperties jdbcProperties,
        JdbcTemplate jdbcTemplate) {
        this.jdbcProperties = jdbcProperties;
        this.jdbcTemplate = jdbcTemplate;
    }

    public JdbcProperties getJdbcProperties() {
        return jdbcProperties;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    @Override
    public String toString() {
        return "TransactionManager{" +
                   "jdbcProperties=" + jdbcProperties +
                   ", jdbcTemplate=" + jdbcTemplate +
                   '}';
    }
}
