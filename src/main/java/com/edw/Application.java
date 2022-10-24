package com.edw;

import org.infinispan.spring.remote.session.configuration.EnableInfinispanRemoteHttpSession;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * <pre>
 *     com.edw.Application
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 24 Okt 2022 18:09
 */
@SpringBootApplication
@EnableCaching
@EnableInfinispanRemoteHttpSession(cacheName = "app-session")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
