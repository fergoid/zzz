package com.example;

import com.example.config.Config;
import com.example.service.ApplicationService;
import lombok.extern.java.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by a261004 on 18/01/2017.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Config.class)
@Log

public class ApplicationServiceTest {

    @Autowired
    private ApplicationService applicationService;

    @Test
    public void serviceTest() {
        applicationService.getApplications();
    }
}
