package org.example.utils;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-demo")
public interface ProviderFeign {

    @RequestMapping("echo22")
    public String echo22();

    @RequestMapping("echo/{string}")
    public String echo(@PathVariable String string);
}
