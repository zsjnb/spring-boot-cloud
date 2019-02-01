package cn.zhangxd.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.internal.EnableZipkinServer;

/**
 * SpringCloud Edgware之前的版本使用Zipkin 1.x，要想MQ方式收集数据需整合spring-cloud-sleuth-stream
 * 而在Edgware及更高版本中，使用Zipkin 2.x本身已支持基于MQ的数据收集方式，而spring-cloud-sleuth-stream将被废弃
 * http://www.itmuch.com/spring-cloud/edgware-new-sleuth-zipkin-mq/
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZipkinApplication.class, args);
    }

}
