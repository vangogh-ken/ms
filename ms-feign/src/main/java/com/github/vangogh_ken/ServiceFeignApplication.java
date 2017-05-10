package com.github.vangogh_ken;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.ComponentScan;

/**
 * 类似与负载均衡器
 * 对指定的被调用服务(名称一样，多个实例)的多个实例之间进行负载均衡
 * Feign自带断路器，且打开；如果使用feign不想用断路器的话，可以在配置文件中关闭它，配置如下：feign.hystrix.enabled=false
 * @author pzg
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@ComponentScan
//@EnableHystrixDashboard //打开断路器dashboard, feign中尚未生效
public class ServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceFeignApplication.class, args);
    }
}