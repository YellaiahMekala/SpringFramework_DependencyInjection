package com.explore.sbScheduler.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

@Service
//@EnableScheduling
public class JobService {

    @Autowired
    private  NotificationService notificationService;

}
