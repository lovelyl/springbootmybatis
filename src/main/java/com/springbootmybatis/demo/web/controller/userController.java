package com.springbootmybatis.demo.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.springbootmybatis.demo.domain.User;
import com.springbootmybatis.demo.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Create liyuanlin
 * @date 2016/8/16
 */

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private userService userService;

    @RequestMapping("/")
    public String index(){return "user/index";}

    @ResponseBody
    @RequestMapping("/user/{id}")
    public User getOne(@PathVariable("id")int id){
        return userService.findOne(id);
    }

    @ResponseBody
    @RequestMapping("/findall")
    public JSON findAll(){
        JSONObject result =new JSONObject();
        result.put("data",userService.findAll());
        return result;
    }

    @ResponseBody
    @RequestMapping("/findAll")
    public JSON getAll(
            @PageableDefault(
                    value = 10,
                    page = 0,
                    size = 10,
                    sort = "id",
                direction = Sort.Direction.ASC)Pageable pageable){

        JSONObject result=new JSONObject();
        result.put("data",userService.findAll(pageable));
        return result;
    }


}
