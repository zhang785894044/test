package cn.zhangbo.springcloud.controller;

import cn.zhangbo.springcloud.domain.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 78589
 * @Title: UserController
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1911:49
 */
@RestController
@RequestMapping("/provider")
public class UserController {

    @RequestMapping("/user/{id}")
    public User getUser(@PathVariable("id") Long id){

        return new User(id,"zb");
    }

}
