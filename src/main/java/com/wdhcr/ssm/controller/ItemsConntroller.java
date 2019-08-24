package com.wdhcr.ssm.controller;

import com.wdhcr.ssm.po.Items;
import com.wdhcr.ssm.service.ServicesImp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ItemsConntroller {
    @Resource(name = "servicesImp")
    private ServicesImp servicesImp;


    //查询所有
    @RequestMapping(value = "/show")
    public ModelAndView showAll() {
        System.out.println("asdasaf");
        List<Items> items = servicesImp.selectAll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("list", items);
        modelAndView.setViewName("index.jsp");
        return modelAndView;
    }
    //下拉列表
    @ModelAttribute("itemses")
    public List<String> select(){
        List<Items> items = servicesImp.selectAll();
        List<String> strings = new ArrayList<>();
        for (Items item : items) {
            strings.add(item.getName());
        }
        return strings;

    }

    //根据id查
    @RequestMapping(value = "/selectById")
    public ModelAndView selectItmesById(Integer id){
        Items items = servicesImp.selectItemById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemb",items);
        modelAndView.setViewName("update_list.jsp");
        return modelAndView;
    }
    //删除
    @RequestMapping(value = "/del")
    public ModelAndView deleteItem(Integer id){
        servicesImp.delItem(id);
        ModelAndView modelAndView = showAll();
        return modelAndView;
    }
    //添加
    @RequestMapping(value = "/add")
    public ModelAndView insertItem(Items items){
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@2"+items.getName());
        servicesImp.insertItems(items);
        ModelAndView modelAndView = showAll();
        return modelAndView;
    }
    //更新
    @RequestMapping(value = "/update")
    public ModelAndView updateIrems(Items items){
        servicesImp.updateItems(items);
        ModelAndView modelAndView = showAll();

        return modelAndView;
    }



}
