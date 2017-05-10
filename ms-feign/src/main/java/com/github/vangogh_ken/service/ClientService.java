package com.github.vangogh_ken.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 使用断路器，需要在ClientService接口的注解中加上fallback的指定类就行了
 * @author pzg
 *
 */
//@FeignClient(value = "ms-eureka-client") //指定被调用的服务名称
@FeignClient(value = "ms-eureka-client", fallback = ClientServiceFallHandler.class) //指定被调用的服务名称，指定服务断掉后的处理类
public interface ClientService {
    @RequestMapping(value = "/echo",method = RequestMethod.GET)
    String echo(@RequestParam(value = "name") String name);
    
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    String test();
}