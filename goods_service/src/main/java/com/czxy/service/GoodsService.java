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
        System.out.println("孙鹏生");
        List<Goods> list = this.findAllGoods();
        for (Goods c : list) {
            if (c.getGoodsName().equals(goodsName)){
                return "商品名称不可用";
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

    public void findTest(){
        System.out.println("测试git");
    }
}
