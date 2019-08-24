package com.wdhcr.ssm.service;

import com.wdhcr.ssm.po.Items;

import java.util.List;

/*
 *services层的规范接口
 *
 */
public interface Servicess {
    List<Items> selectAll();
    Items selectItemById(int id);
    void insertItems(Items items);
    void  delItem(int id);
    void updateItems(Items items);
}
