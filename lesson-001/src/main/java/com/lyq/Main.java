package com.lyq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        String beanXML = "classpath:bean.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXML);
        HelloSpring helloSpring = context.getBean("helloSpring", HelloSpring.class);
        helloSpring.say();
    }
}