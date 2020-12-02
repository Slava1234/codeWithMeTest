package com.test.reactor;

import com.test.reactor.model.User;
import com.test.reactor.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CustomCommandLineRunner implements CommandLineRunner {

    @Autowired
    private UserRepo userRepo;


    @Override
    public void run(String... args) throws Exception {




        if(userRepo.findAll().count().block() == 0) {
            for(var i = 0; i < 10; i++) {

                User user = new User();
                user.setAge(i+30);
                user.setName("Name " + i);
                userRepo.save(user);
            }
        }

    }
}
