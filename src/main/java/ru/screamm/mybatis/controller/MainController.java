package ru.screamm.mybatis.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.screamm.mybatis.entity.User;
import ru.screamm.mybatis.service.UserService;

import java.util.List;

/**
 * @author Raspopov Anton
 */

@RestController
@AllArgsConstructor
public class MainController {
    private UserService service;

    @GetMapping(value = "/getAll")
    public List<User> getAll() {
        return service.getAll();
    }

}
