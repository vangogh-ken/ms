package com.github.vangogh_ken.web;

import javax.annotation.PostConstruct;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.springframework.stereotype.Component;

/**
 * Created by fangzhipeng on 2017/4/5.
 * 获取RedissonClient连接类
 */
@Component
public class RedissonConnector {
    RedissonClient redisson;
    
    @PostConstruct
    public void init(){
        redisson = Redisson.create();
    }

    public RedissonClient getClient(){
        return redisson;
    }

}