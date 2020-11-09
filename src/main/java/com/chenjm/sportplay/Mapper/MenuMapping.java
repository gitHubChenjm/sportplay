package com.chenjm.sportplay.Mapper;

import com.chenjm.sportplay.bean.MainMenu;
import com.chenjm.sportplay.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuMapping {

    public List<MainMenu> getAllMenu();
}
