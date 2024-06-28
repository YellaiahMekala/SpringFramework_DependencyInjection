package com.explore.di.beans;


public class UserService {

private SoscialMediaService service;

    public void setService(SoscialMediaService service) {
        this.service = service;
    }

    public SoscialMediaService getService() {
        return service;
    }

    public UserService(SoscialMediaService service) {
        this.service = service;
    }

    public void displayFeeds(){
        /*FacebookService service=new FacebookService();
        SoscialMediaApp app=new SoscialMediaApp();
        InstagramService instagramService = new InstagramService();*/

        //soscialMediaApp.getUserFeeds();
        //run time polymorphism
       /* SoscialMediaService service=new FacebookService();
        service.getUserFeeds();;*/

        //approach3
       /*SoscialMediaService instance= SoscialMediaServiceFactory.getInstance("facebook");
       instance.getUserFeeds();;*/
        service.getUserFeeds();

    }

    public static void main(String[] args) {
        //UserService userService=new UserService();

    }
}
