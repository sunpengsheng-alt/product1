package com.czxy;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tbl_category")
@Data
public class Category {

    @Id
    private String cid;
    private String cname;


}
