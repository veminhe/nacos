package org.example.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class EchoController {


    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        log.info("第二个生产者produce");
        return string;
    }

    @GetMapping(value = "/echo22")
    public String echo22() {
        log.info("第二个生产者produce22");
        return "abc";
    }
}
