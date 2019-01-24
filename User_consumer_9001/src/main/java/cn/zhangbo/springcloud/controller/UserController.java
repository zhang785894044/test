package cn.zhangbo.springcloud.controller;

import cn.zhangbo.springcloud.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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
    public static final String URL_PREFIX = "http://localhost:8001/";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id")Long id){

        //远程服务的调用 http
        String url = URL_PREFIX+"/provider/user/"+id;
        return restTemplate.getForObject(url, User.class);
    }
}
