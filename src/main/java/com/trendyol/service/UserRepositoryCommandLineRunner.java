package com.trendyol.service;

import com.trendyol.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserRepositoryCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    private static final Logger log = LoggerFactory.getLogger(UserRepositoryCommandLineRunner.class);

    @Override
    public  void run (String... arg0) throws Exception{
        User user = new User ("Jack", "Admin");
        userRepository.save(user);
        log.info("New User: " + user.toString());
    }
}
