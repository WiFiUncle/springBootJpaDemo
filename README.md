

### SpringBoot + JPA
### 编辑器idea
### 先自行配置数据库application.properties

### 访问地址
http://localhost:8004/helloBoot
http://localhost:8004/toHello


### 本demo是依照segmentfault文章所实现, 详情请参考原文

地址: https://segmentfault.com/a/1190000014269284


### 补充几点

#### 1. application.properties 
我去掉了这句(报错)  spring.datasource.driver-class-name=com.mysql.jdbc.Driver

#### 2.1 系统默认8080端口，输入localhost: 8080
 

 
#### 2.2 改端口方法 在application.properties中添加   server.port=8004

#### 3. controll层return 出来的是模板名称，得和对应template文件名对应
```java
@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;

    @RequestMapping("/toHello")
    public String toHello(ModelMap modelMap){
        User user = new User();
        user.setName("wifi");
        user.setPassword("123456");
        user.setEmail("wifi_uncle@163.com");
        userRepository.save(user);
        List<User> users = userRepository.findAll();
        modelMap.put("users",users);
        return "helloBoot"; //渲染到前面模板名为helloBoot
    }

}

```
#### 4. user的数据默认存到user表中(以本项目为例)
如需自己添加到其他表名,则在user实体中添加`@Table(name = "t_demo") `


```java
@Entity
@Table(name = "t_demo") //添加这句
public class User {
    
}

```



#### idea 常用操作快捷键
##### 设置自动导包

alt+enter，或者写好代码之后ctrl+alt+l格式化代码，优化导入包 
https://www.cnblogs.com/mithrandirw/p/8819314.html

##### 快速生成getter setter

 快捷键为：alt+insert


