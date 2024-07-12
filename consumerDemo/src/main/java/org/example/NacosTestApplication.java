package org.example;


import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceAutoConfigure;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author heming
 * @since 2023/6/25 19:06
 */
@MapperScan(basePackages = {"org.example.mapper"})
@SpringBootApplication(scanBasePackages = {
        "org.example"},
        exclude = {DruidDataSourceAutoConfigure.class})
@EnableDiscoveryClient
@EnableFeignClients
public class NacosTestApplication {

    public static void main(String[] args) {
        System.setProperty("nacos.logging.default.config.enabled", "false");
        SpringApplication.run(NacosTestApplication.class, args);
    }

}
