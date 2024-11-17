package com.example.hr.main.web;

import com.example.hr.model.User;
import com.example.hr.repository.UserRepository;
import com.example.hr.system.dao.CommonDAO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class MainController {

    @Autowired
    private CommonDAO commonDAO;
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "Welcome to the Home Page";
    }

    @GetMapping("/api/hello")
    public String hello() {
        return "Welcome to the Flutter & Spring Boot";
    }

    @PostMapping("/joinUser")
    public @ResponseBody Map<String, Object> joinUser(@RequestBody Map<String, Object> paramMap) {
        Map<String, Object> retmap = new HashMap<String, Object>();
        
        log.debug("paramMap :: {}", paramMap);

        User user = new User();
        user.setId(paramMap.get("id").toString());
        user.setPassword(paramMap.get("password").toString());
        user.setPhone(paramMap.get("phone").toString());

        userRepository.save(user);

        //commonDAO.insert("userMapper.insertUser", paramMap);

        retmap.put("message", "야 너 성공한거야.");
        return retmap;
    }
}
