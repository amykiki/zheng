package com.zheng.demo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanC {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanC.class);
    public BeanC() {
        LOGGER.info("Creating C");
    }
}
