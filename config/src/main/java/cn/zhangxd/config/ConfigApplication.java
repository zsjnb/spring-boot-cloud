package cn.zhangxd.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 配置中心ConfigServer负责将git/svn中存储的配置文件发布成REST接口，客户端可以从服务端REST接口获取配置。
 * 添加EnableConfigServer注解激活配置中心服务。配置中心可以单独做服务，也可以嵌入到其它服务中，推荐用单独做服务方式使用配置中心。
 * 添加EnableDiscoveryClient注解激活对配置中心的注册发现支持，将ConfigServer当做一个服务注册到eureka中，client端到eureka中获取服务，以支持配置中心集群高可用。
 */
@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }

}
