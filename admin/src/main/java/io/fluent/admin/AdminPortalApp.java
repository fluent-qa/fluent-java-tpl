package io.fluent.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.scheduling.annotation.EnableAsync;
import xyz.erupt.core.annotation.EruptScan;

@SpringBootApplication
@EnableAsync
@EruptScan(value = {"io.fluent"})
@EntityScan(value = {"io.fluent"})
public class AdminPortalApp {
    public static void main(String[] args) {
        SpringApplication.run(AdminPortalApp.class);
    }
}

