package c_el;

import a_regist.b_annotation.component.JdbcProperties;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class C_BeanRef {

    @Value("#{transactionManager.jdbcProperties}")
    private JdbcProperties oracleProperties;


}
