package com.wdhcr.ssm.service;

import com.wdhcr.ssm.mapper.ItemsMapper;
import com.wdhcr.ssm.po.Items;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/*
* service层的实现类
* */
@Service(value = "servicesImp")
public class ServicesImp implements Servicess {

    //调用mapper的数据库操作对象
    @Resource(name = "itemsMapper")
//    @Autowired
    private ItemsMapper itemsMapper;
    //查询所有
    @Override
    public List<Items> selectAll() {
        return  itemsMapper.selectAll();
    }

    @Override
    public Items selectItemById(int id) {
        Items items = itemsMapper.selectItemById(id);
        return items;
    }

    @Override
    public void insertItems(Items items) {
        itemsMapper.insertItems(items);

    }

    @Override
    public void delItem(int id) {
        itemsMapper.delItem(id);
    }

    @Override
    public void updateItems(Items items) {
        itemsMapper.updateItems(items);
    }

    public static void main(String[] args) {
        ServicesImp servicesImp = new ServicesImp();
        servicesImp.delItem(23);
    }

}
