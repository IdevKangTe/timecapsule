package com.web.timecapsule.apicontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController("TestController")
public class TestController {

    @GetMapping("api/hello")
    public String Hello(){
        return "안녕하세요. 현재 서버시간은 "+new Date() +"입니다. \n";
    }
}
