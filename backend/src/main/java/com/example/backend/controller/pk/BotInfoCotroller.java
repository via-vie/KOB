package com.example.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController//默认返回数据
@RequestMapping("/pk/")
public class BotInfoCotroller {

    @RequestMapping("getbotinfo/")
    public Map<String,String>getBotInfo(){
        Map<String,String> bot1= new HashMap<>();
        bot1.put("name","tiger");
        bot1.put("rating","1800");
        return bot1;//前后端分离，返回的是函数值而不是页面


    }
}
