package com.chenjm.sportplay.controller;

import com.chenjm.sportplay.Mapper.UserMapping;
import com.chenjm.sportplay.bean.MainMenu;
import com.chenjm.sportplay.bean.PageInfo;
import com.chenjm.sportplay.bean.User;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    UserMapping userMapping;

    @RequestMapping("/allUser")
    public String getAllUser(PageInfo<User> info,
                             @RequestParam(value = "query") String query){
        User user = new User();
        user.setUsername(query);
        info.setBean(user);

        Map<String ,Object> map = new HashMap<>();
        //计算总页数并赋予到page类中
        int total = userMapping.getCountByExample(info);
        info.setTotal(total);

        List<User> list = userMapping.getUserByExampleWithPage(info);

        map.put("data",list);
        map.put("numbers",total);

        return new Gson().toJson(map);
    }

    @RequestMapping("/userState")
    public String updateState(@RequestParam("id") Integer id,
                              @RequestParam("state") Boolean state){
            Integer result = userMapping.updateState(id,state);

            return result > 0 ? "success" : "error";
    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        user.setRole("普通用户");
        user.setState(false);
        int result = userMapping.addUser(user);

        return result > 0 ? "success" : "error";
    }

    @RequestMapping("/deleteUser")
    public String deleteUser(@RequestParam("id") Integer id){
        int result = userMapping.deleteUser(id);
        return result > 0 ? "success" : "error";
    }

    @RequestMapping("/getUpdate")
    public String getUpdate(@RequestParam("id") Integer id){
        User user = userMapping.getUserById(id);
        return new Gson().toJson(user);
    }

    @RequestMapping("/editUser")
    public String editUser(@RequestBody User user){
        int result = userMapping.editUser(user);
        return result > 0 ? "success" : "error";
    }

    @RequestMapping("/testGet")
    public String testGet(@RequestBody PageInfo<User> page){
        System.out.println(page);
        return "success";
    }

}
