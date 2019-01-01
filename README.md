在bean中有几个实体类<br>
在application.yml对实体类的属性进行了赋值<br>
在test测试类Demo....Tests进行了实体类输出<br>
在bean中使用@ConfigurationProperties @Validated<br>
使用JSR303数据校验<br>
使用JSR303自定义注解<br>
在bean中使用@Value<br>
<hr>
<br>
学习两个注解: @PropertySource , @ImportResource <br>
配置文件的优先级和指定方式<br>
@PropertySource:通过@PropertySource注解将properties配置文件中的值存储到Spring的 Environment中，Environment接口提供方法去读取配置文件中的值，参数是properties文件中定义的key值。<br>
官方更推荐@ConfigurationProperties(prefix = "person")这样的配置加载 <br>
TODO 平板视频



