package com.example.service;

import com.example.domain.Application;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by a261004 on 18/01/2017.
 */
@Service
@Log
public class ApplicationService {

    @Autowired
    private OAuth2RestTemplate oauth2RestTemplate;

    @Value("application.query.url")
    private String applicationUrl;

    public void getApplications() {

        Application[] apps = oauth2RestTemplate.getForObject(applicationUrl, Application[].class);

            for (Application app : apps) {
                log.info(app.toString());
            }
    }
}
