package cn.lee.jason.client.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jason on 17/3/14.
 */
@RestController
@RequestMapping("/sample")
public class SampleController {
    @RequestMapping
    public String get() {
        return "sample";
    }
}
