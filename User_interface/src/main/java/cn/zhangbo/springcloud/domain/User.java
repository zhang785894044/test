package cn.zhangbo.springcloud.domain;

/**
 * @author 78589
 * @Title: User
 * @ProjectName springcloud_parent
 * @Description: TODO
 * @date 2019/1/1911:31
 */
public class User {

    private Long id;

    private  String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
