package com.czxy;

import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface GoodsMapper extends Mapper<Goods> {
    @Select("select * from tbl_goods")
    @Results({
            @Result(property = "goodsId",column = "goods_id"),
            @Result(property = "goodsName",column = "goods_name"),
            @Result(property = "goodsNumber",column = "goods_number"),
            @Result(property = "goodsPrice",column = "goods_price"),
            @Result(property = "guaranteePeriod",column = "guarantee_period"),
            @Result(property = "cid",column = "cid"),
            @Result(property = "category",column = "cid",one = @One(select = "com.czxy.CategoryMapper.selectByPrimaryKey"))
    })
    List<Goods> findAllGoods();

}
