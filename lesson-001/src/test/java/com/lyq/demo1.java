package com.lyq;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Slf4j
public class demo1 {
    @Test
    public void test(){
        String beanXML = "classpath:bean.xml";

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(beanXML);
        HelloSpring helloSpring = context.getBean("helloSpring", HelloSpring.class);
        helloSpring.say();
    }
}
