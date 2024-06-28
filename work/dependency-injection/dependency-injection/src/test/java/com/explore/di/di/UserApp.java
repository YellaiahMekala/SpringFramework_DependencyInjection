package com.explore.di.di;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class UserApp {
    public UserApp() {
        System.out.println("user app object created ");
    }
}
