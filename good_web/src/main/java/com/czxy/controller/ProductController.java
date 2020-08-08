package com.czxy.controller;


import com.czxy.Category;
import com.czxy.Goods;
import com.czxy.service.GoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/goods")
public class ProductController {

    @Resource
    private GoodsService goodsService;

    @GetMapping("/findAllCategory")
    public @ResponseBody List<Category> findAllCategory(){
       List<Category> list = goodsService.findAllCategory();
       return list;
    }

    @GetMapping("/checkName/{goodsName}")
    public @ResponseBody String checkName(@PathVariable("goodsName") String goodsName){
        System.out.println(goodsName);
        String str = goodsService.checkName(goodsName);
        return str;
    }

    @PostMapping("/addCategory")
    public String addCategory(Goods goods){
        goodsService.addCategory(goods);
        return "redirect:/goods/list.jsp";
    }

    @GetMapping("/findAllGoods")
    public  @ResponseBody List<Goods> findAllGoods(){
       List<Goods> list = goodsService.findAllGoods();
       return list;
    }
}
