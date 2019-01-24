package cn.zhangbo.springcloud.controller;

import cn.zhangbo.springcloud.client.UserClient;
import cn.zhangbo.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 78589
 * @Title: UserController
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1913:44
 */
@RestController
@RequestMapping("/consumer")
public class UserController {

    //定义一个常量的路径
//    public static final String URL_PREFIX = "http://localhost:8001/";
    public static final String URL_PREFIX = "http://USER-PROVIDER";     //通过服务名从注册中心获取服务列表，负载均衡调用

    @Autowired
    private UserClient userClient;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id")Long id){
        System.out.println("------------------------"+userClient);

        return userClient.getUser(id);
    }
}
