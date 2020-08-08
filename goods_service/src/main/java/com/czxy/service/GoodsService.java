package com.czxy.service;


import com.czxy.Category;
import com.czxy.CategoryMapper;
import com.czxy.Goods;
import com.czxy.GoodsMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsService {

    @Resource
    private GoodsMapper goodsMapper;

    @Resource
    private CategoryMapper categoryMapper;

    public List<Category> findAllCategory() {
        return categoryMapper.selectAll();
    }

    public String checkName(String goodsName) {
        List<Goods> list = this.findAllGoods();
        System.out.println(list+"上课呢大V奇偶苏贵很多事哦");
        for (Goods c : list) {
            if (c.getGoodsName().equals(goodsName)){
                return "商品名称不可用呵呵呵";
            }
        }
        return "商品名称可用";
    }

    public void addCategory(Goods goods) {
       goodsMapper.insertSelective(goods);
    }

    public List<Goods> findAllGoods() {
        return goodsMapper.findAllGoods();
    }
}
