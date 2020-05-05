package za.co.discovery.assignment.radhikapather.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.io.ClassPathResource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import za.co.discovery.assignment.radhikapather.repository.PlanetNameRepository;
import za.co.discovery.assignment.radhikapather.repository.PlanetRouteRepository;
import za.co.discovery.assignment.radhikapather.services.ShortestDistancePathService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class RadhikapatherApplication {

    public static void main(String[] args) {
        SpringApplication.run(RadhikapatherApplication.class, args);
    }
    private static final Logger LOG = LoggerFactory.getLogger(RadhikapatherApplication.class);








}
