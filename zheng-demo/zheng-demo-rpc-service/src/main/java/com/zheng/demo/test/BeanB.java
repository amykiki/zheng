package com.zheng.demo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BeanB {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanB.class);
    public BeanB() {
        LOGGER.info("Creating B");
    }
}
