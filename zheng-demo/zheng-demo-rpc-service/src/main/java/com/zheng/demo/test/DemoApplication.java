package com.zheng.demo.test;

import com.zheng.common.util.SpringContextUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(DemoApplication.class);
    public static void main(String[] args) {
        LOGGER.info(">>>>> zheng-upms-demo-test 正在启动 <<<<<");
        new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext-demo.xml");
        LOGGER.info(">>>>> zheng-upms-demo-test 启动完成 <<<<<");

        BeanA beanA = SpringContextUtil.getBean(BeanA.class);
        if (beanA.getBeanB() == null) {
            LOGGER.info("BeanA's BeanB is NULL");
        }else {
            LOGGER.info("BeanA's BeanB IS Injected!");
        }
    }
}
