package com.explore.di.beans;

public class InstagramService implements SoscialMediaService{
    @Override
    public void getUserFeeds() {
        System.out.println("loading user feeds from instagram");
    }
}
