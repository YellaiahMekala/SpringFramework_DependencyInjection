package com.explore.di.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class WhatsappService {
    public WhatsappService() {
        System.out.println("whatsapp service object created");
    }
}
