package com.explore.di.beans;

public class SoscialMediaServiceFactory {

    public static SoscialMediaService getInstance(String soscialMediaType){
        if (soscialMediaType.equals("facebook")){
            return  new FacebookService();
        }
        if (soscialMediaType.equals("instagram")){
            return  new InstagramService();
        }
        return null;
    }

}
