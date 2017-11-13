package ua.com.owu.service;

import lombok.Setter;
import ua.com.owu.dao.UserDAO;
import ua.com.owu.entity.User;
@Setter
public class UserService {


    private UserDAO dao;

  public   void save(String name,int age){
        User user = new User(name, age);
        dao.save(user);
    }


}
