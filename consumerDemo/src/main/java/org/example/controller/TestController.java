package org.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/test")
    public String test(String name){
        // 1. 获取provider-demo的实例
        ServiceInstance instance = null;
        List<ServiceInstance> instances = discoveryClient.getInstances("provider-demo");
        if (instances.size() > 0){
            instance = instances.get(0);
        }
        if (null == instance){
            throw new IllegalStateException("获取不到实例");
        }
        // 2. 调用接口
        String requestUrl = instance.getUri() + "/echo/" + name;
        String response = restTemplate.getForObject(requestUrl, String.class);
        return "consumer:" + response;
    }

}

