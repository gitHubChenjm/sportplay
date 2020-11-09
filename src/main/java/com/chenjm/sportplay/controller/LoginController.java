package com.chenjm.sportplay.controller;

import com.chenjm.sportplay.Mapper.UserMapping;
import com.chenjm.sportplay.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class LoginController  {

    @Autowired
    UserMapping userMapping;

    @RequestMapping("/login")
    public String login(@RequestBody User user){
        System.out.println(user.getPassword() + ":" + user.getUsername());
        List<User> list = userMapping.getUserByExample(user);
        String msg = "error";

        if(list != null && list.size() != 0){
            return "ok";
        }

        return msg;
    }
}
