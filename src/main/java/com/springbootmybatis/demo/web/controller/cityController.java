package com.springbootmybatis.demo.web.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.springbootmybatis.demo.domain.City;
import com.springbootmybatis.demo.service.cityService;
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
@RequestMapping("/city")
public class cityController {

    @Autowired
    private cityService cityService;

    @RequestMapping("/")
    public String index(){return "index";}

    @ResponseBody
    @RequestMapping("/city/{id}")
    public City getOne(@PathVariable("id")int id){
        return cityService.findOne(id);
    }

    @ResponseBody
    @RequestMapping("/findall")
    public JSON findAll(){
        JSONObject result =new JSONObject();
        result.put("data",cityService.findAll());
        return result;
    }

    @ResponseBody
    @RequestMapping("/findAll")
    public JSON getAll(@PageableDefault(
            value = 10,
            size = 10,
            page = 0,
            sort = "id",
            direction = Sort.Direction.ASC
    )Pageable pageable){
        JSONObject result=new JSONObject();
        result.put("data",cityService.findAll(pageable));
        return  result;
    }
}
