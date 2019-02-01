package cn.zhangxd.svca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

/**
 * 启用服务注册发现注解@EnableDiscoveryClient<br>
 * 从SpringCloud的Edgware版本开始注解@EnableDiscoveryClient或@EnableEurekaClient可省略，只需加上相关依赖和配置，即可将微服务注册到服务注册中心。<br>
 * 注解@EnableDiscoveryClient和@EnableEurekaClient共同点是都能够让注册中心能够发现服务，不同点是@EnableEurekaClient只适用于Eureka作为注册中心，而@EnableDiscoveryClient可以是其他注册中心。
 * 
 * 启用feign客户端注解@EnableFeignClients<br>
 * 启用断路器注解@EnableCircuitBreaker<br>
 * 
 * 如果hystrix在classpath中，并且feign.hystrix.enabled=true的话，那么feign将用断路器包装所有的方法。<br>
 * 注意：在SpringCloud的Dalston之前的版本中，如果classpath中有hystrix，那么Feign默认回为所有的方法加上断路器，而在Dalston版本中是可选的。
 * hystrix支持回调，当断路器打开的时候回调默认的代码。为了回调指定的方法，可以在@FeignClient中设置fallback属性，它的值是类的名字。
 * 如果需要获得回调触发的原因，可以使用@FeignClient的fallbackFactory属性。
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
@EnableCircuitBreaker
@EnableOAuth2Client
public class ServiceAApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceAApplication.class, args);
    }

}
