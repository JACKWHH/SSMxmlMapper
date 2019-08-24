package com.wdhcr.ssm.mapper;


import com.wdhcr.ssm.po.Items;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository(value = "itemsMapper")
public interface ItemsMapper {
//    //查询所有
//    @Select("select * from itemss")
    List<Items> selectAll();
//    //根据id查询
//    @Select("select * from itemss where id = #{id}")
    Items selectItemById(int id);
//    //添加方法
//    @Insert("insert into itemss(name,price,detail)values(#{name},#{price},#{detail})")
    void insertItems(Items items);
//    //删除方法
//    @Delete("delete from itemss where id =#{id}")
    void  delItem(int id);
//    //更新数据
//    @Update("update itemss set name= #{name},price =#{price},detail=#{detail} where id=#{id} ")
    void updateItems(Items items);

}
