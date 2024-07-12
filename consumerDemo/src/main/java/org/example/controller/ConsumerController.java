package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.example.utils.ProviderFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class ConsumerController {

    @Autowired
    private ProviderFeign providerFeign;

    @GetMapping("hi22")
    public String hi22() {
        log.info("第二个消费者consumer22");
        return this.providerFeign.echo22();
    }

    @GetMapping("hi")
    public String hi() {
        log.info("第二个消费者consumer");
        return this.providerFeign.echo("qqq");
    }
}
