package com.zheng.demo.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanA {
    private static final Logger LOGGER = LoggerFactory.getLogger(BeanA.class);
    private BeanB beanB;
    private BeanC beanC;

    public BeanA() {
        LOGGER.info("Creating A");
    }

    @Autowired
    public void setBeanB(BeanB beanB) {
        this.beanB = beanB;
        LOGGER.info("Inserting B!");
    }
    @Autowired
    public void setBeanC(BeanC beanC) {
        this.beanC = beanC;
        LOGGER.info("Inserting C!");
    }

    public BeanB getBeanB() {
        return beanB;
    }

    public BeanC getBeanC() {
        return beanC;
    }
}
