package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by a261004 on 18/01/2017.
 */
@Configuration
@EnableOAuth2Client
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example")

public class Config {

    @Value("security.oauth2.client.client-id")
    private String username;

    @Value("security.oauth2.client.client-secret")
    private String password;

    @Bean
    public OAuth2RestTemplate oauth2RestTemplate(OAuth2ClientContext oauth2ClientContext,
                                                 OAuth2ProtectedResourceDetails details) {
        return new OAuth2RestTemplate(details, oauth2ClientContext);
    }


//    @Bean
//    protected OAuth2ProtectedResourceDetails resource() {
//
//        ResourceOwnerPasswordResourceDetails resource = new ResourceOwnerPasswordResourceDetails();
//
//        List scopes = new ArrayList<String>(2);
//        scopes.add("write");
//        scopes.add("read");
//        resource.setAccessTokenUri(tokenUrl);
//        resource.setClientId(@Value(""));
//        resource.setClientSecret("restapp");
//        resource.setGrantType("password");
//        resource.setScope(scopes);
//
//
//        return resource;
//    }


}
