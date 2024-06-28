package com.explore.di.di;

import org.springframework.stereotype.Service;

@Service
public class WhatsappService implements  SoscialAppService{
    public WhatsappService() {
        System.out.println("whatsapp service object created");
    }

    @Override
    public void getUserFeeds() {
        System.out.println("load feeds from whatsapp");
    }
}
