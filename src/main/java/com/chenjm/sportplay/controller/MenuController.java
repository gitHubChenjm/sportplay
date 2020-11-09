package com.chenjm.sportplay.controller;

import com.chenjm.sportplay.Mapper.MenuMapping;
import com.chenjm.sportplay.bean.MainMenu;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class MenuController {

    @Autowired
    MenuMapping menuMapping;

    @RequestMapping("/menus")
    public String getAllMenu(){
        HashMap<String, Object> data = new HashMap<>();//存放数据例如错误信息，菜单信息

        List<MainMenu> list = menuMapping.getAllMenu();
        data.put("data",list);
        data.put("status",200);

        return new Gson().toJson(data);
    }
}
