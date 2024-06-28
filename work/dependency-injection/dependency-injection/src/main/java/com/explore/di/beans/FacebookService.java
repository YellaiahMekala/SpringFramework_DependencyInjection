package com.explore.di.beans;

public class FacebookService implements  SoscialMediaService {
    @Override
    public void getUserFeeds() {
        System.out.println("fetching user feeds from facebook");
    }
}
