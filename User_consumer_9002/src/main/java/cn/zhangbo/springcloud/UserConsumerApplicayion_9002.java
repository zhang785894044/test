package cn.zhangbo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 78589
 * @Title: UserConsumerApplicayion_9002
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1915:26
 */
@SpringBootApplication
@EnableEurekaClient
public class UserConsumerApplicayion_9002 {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplicayion_9002.class);
    }
}
