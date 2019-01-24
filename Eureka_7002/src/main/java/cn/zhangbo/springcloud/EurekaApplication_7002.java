package cn.zhangbo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author 78589
 * @Title: EurekaApplication_7001
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1911:08
 */
//springboot的注解
@SpringBootApplication
//标识是一个eureka的服务端，让eureka的服务可用
@EnableEurekaServer
public class EurekaApplication_7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication_7002.class);
    }
}
