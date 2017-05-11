package com.github.vangogh_ken.web;

/**
 * 类似与负载均衡器
 * 对指定的被调用服务(名称一样，多个实例)的多个实例之间进行负载均衡
 * Feign自带断路器，且打开；如果使用feign不想用断路器的话，可以在配置文件中关闭它，配置如下：feign.hystrix.enabled=false
 * @author pzg
 *
 */
/**
 * Created by fangzhipeng on 2017/4/5.
 * 获取锁后需要处理的逻辑
 */
public interface AquiredLockWorker<T> {
     T invokeAfterLockAquire() throws Exception;
}