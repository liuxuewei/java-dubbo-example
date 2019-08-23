# springdubbo01

#### 介绍
springboot整合dubbo，基于注解的方式。引入的dubbo为io.dubbo.springboot，记录一下。
<dependency>
	<groupId>io.dubbo.springboot</groupId>
	<artifactId>spring-boot-starter-dubbo</artifactId>
	<version>1.0.0</version>
</dependency>

引入的jar为：
![输入图片说明](https://images.gitee.com/uploads/images/2019/0823/162440_df5e6d56_1795696.png "屏幕截图.png")
这个版本log4j是必须的！！！

他编译整合的jar,所以不需要再引入：
![输入图片说明](https://images.gitee.com/uploads/images/2019/0823/162956_33b5242b_1795696.png "屏幕截图.png")

配置如下：
![输入图片说明](https://images.gitee.com/uploads/images/2019/0823/110156_f3d1c7ad_1795696.png "屏幕截图.png")
需要注意的点是，配置的dubbo之前需要加上spring。