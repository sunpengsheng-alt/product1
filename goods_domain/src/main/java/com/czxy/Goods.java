package com.czxy;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_goods")
@Data
public class Goods {

    @Id
    private Integer goodsId;

    private String goodsName;

    private Integer goodsNumber;

    private Double goodsPrice;

    private String guaranteePeriod;



}
