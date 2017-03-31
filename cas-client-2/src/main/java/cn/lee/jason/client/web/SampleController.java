package cn.lee.jason.client.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jason on 17/3/14.
 */
@Controller
@RequestMapping(value = "sample")
public class SampleController {

    @RequestMapping(value = "get", method = RequestMethod.GET)
    public String get() {
        return "sample";
    }

    @RequestMapping(value = "fail", method = RequestMethod.GET)
    public String fail() {
        return "fail";
    }
}
