package cn.zhangbo.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author 78589
 * @Title: CfgBean
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1914:00
 */
@Configuration  // 相当于配置了一个<beans></beans>
public class CfgBean {

    @Bean   // 相当于配置了一个 <bean class="org.springframework.web.client.RestTemplate"></bean>
    public RestTemplate getRestCemplate(){

        return new RestTemplate();
    }
}
