package cn.zhangbo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 78589
 * @Title: UserConsumerApplication_9003
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1917:07
 */
@SpringBootApplication
@EnableEurekaClient
//扫描
@EnableFeignClients(basePackages = "cn.zhangbo.springcloud")
public class UserConsumerApplication_9003 {



    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication_9003.class);

    }
}
