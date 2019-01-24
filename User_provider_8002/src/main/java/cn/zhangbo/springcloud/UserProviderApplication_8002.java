package cn.zhangbo.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 78589
 * @Title: UserProviderApplication_8001
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1911:45
 */
@SpringBootApplication
//标识是springcloud的客户端
@EnableEurekaClient
public class UserProviderApplication_8002 {

    public static void main(String[] args) {
        SpringApplication.run(UserProviderApplication_8002.class);
    }
}
