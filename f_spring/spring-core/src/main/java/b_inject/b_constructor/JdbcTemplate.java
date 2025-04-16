package b_inject.b_constructor;

import org.springframework.stereotype.Component;

@Component
public class JdbcTemplate {
    
    private final TransactionManager transactionManager;
    
    public JdbcTemplate(TransactionManager transactionManager) {
        this.transactionManager = transactionManager;
    }
    
    @Override
    public String toString() {
        return "JdbcTemplate{" +
                   "transactionManager=" + transactionManager +
                   '}';
    }
}
