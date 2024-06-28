package com.explore.di.di;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class ShareChatService implements SoscialAppService{

    @Override
    public void getUserFeeds() {
        System.out.println("share chat service feeds loaded");
    }
}
