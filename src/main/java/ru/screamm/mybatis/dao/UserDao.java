package ru.screamm.mybatis.dao;

import org.apache.ibatis.annotations.Mapper;
import ru.screamm.mybatis.entity.User;

import java.util.List;

/**
 * @author Raspopov Anton
 */

@Mapper
public interface UserDao {

    List<User> getAllUsers();

}
