package cn.zhangbo.springcloud.client;

import cn.zhangbo.springcloud.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author 78589
 * @Title: UserClient
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1917:12
 */
//调用服务的名称
@FeignClient(value = "USER-PROVIDER")
@RequestMapping("/provider")
public interface UserClient {

    @RequestMapping("/user/{id}")
    User getUser(@PathVariable("id") Long id);
}
