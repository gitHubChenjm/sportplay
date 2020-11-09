package com.chenjm.sportplay.Mapper;

import com.chenjm.sportplay.bean.PageInfo;
import com.chenjm.sportplay.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapping {

    public List<User> getUserByExample(User user);//模糊查询

    public List<User> getUserByExampleWithPage(PageInfo<User> info);//模糊查询，带分页

    public int getCountByExample(PageInfo<User> info);//模糊查询获取总条数

    public int updateState(Integer id,Boolean state);//用户状态开关操作

    public int addUser(User user);//添加用户

    public int deleteUser(Integer id);//删除用户

    public User getUserById(Integer id);

    public int editUser(User user);//修改用户信息
}
