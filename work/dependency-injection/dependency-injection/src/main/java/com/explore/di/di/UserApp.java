package com.explore.di.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserApp {

    //setter based injection
   /* @Qualifier("shareChatService")
    @Autowired
    private SoscialAppService soscialAppService;*/

    //constructor based injection

    private  SoscialAppService soscialAppService;

    public UserApp() {
    }

    //    @Autowired
    public UserApp(@Qualifier("whatsappService") SoscialAppService soscialAppService) {
        this.soscialAppService = soscialAppService;
    }

    /*public UserApp() {
        System.out.println("user app object created ");
    }*/

    public void loadUserFeeds() {
        soscialAppService.getUserFeeds();
    }
}
