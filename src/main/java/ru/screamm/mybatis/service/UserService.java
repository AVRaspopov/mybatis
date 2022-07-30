package ru.screamm.mybatis.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.screamm.mybatis.dao.UserDao;
import ru.screamm.mybatis.entity.User;

import java.util.List;

/**
 * @author Raspopov Anton
 */

@Service
@AllArgsConstructor
public class UserService {
    private UserDao userDao;

    public List<User> getAll() {
      return userDao.getAllUsers();
    }

}
