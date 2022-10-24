package com.edw.controller;

import org.infinispan.spring.remote.provider.SpringRemoteCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <pre>
 *     com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 24 Okt 2022 18:41
 */
@RestController
public class IndexController {

    @Autowired
    SpringRemoteCacheManager cacheManager;

    @GetMapping(path = "/")
    public HashMap index() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        return new HashMap(){{
            put("hello", auth.getName());
        }};
    }
}
