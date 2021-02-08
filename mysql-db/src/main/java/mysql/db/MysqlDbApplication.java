package mysql.db;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@SpringBootApplication
@EnableTransactionManagement
@EnableDiscoveryClient
@EnableScheduling
public class MysqlDbApplication {
    public static void main(String[] args) {
        SpringApplication.run(MysqlDbApplication.class, args);
    }


}
