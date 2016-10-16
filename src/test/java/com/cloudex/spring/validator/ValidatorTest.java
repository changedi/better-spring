package com.cloudex.spring.validator;

import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.PropertyValue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;

/**
 * Created by zunyuan.jy on 16/10/15.
 */
public class ValidatorTest {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-validator-beans.xml"});

        System.out.println("-------------------------------------------");

        TestPersonValidator testPersonValidator = ctx.getBean("testPersonValidator", TestPersonValidator.class);
        TestPerson testPerson = new TestPerson();
        DataBinder binder = new DataBinder(testPerson);
        binder.setValidator(new TestPersonValidator());

        PropertyValue propertyValue = new PropertyValue("name", "Jim");
        MutablePropertyValues mutablePropertyValues = new MutablePropertyValues();
        mutablePropertyValues.addPropertyValue(propertyValue);
        mutablePropertyValues.add("age", -1);
// bind to the target object
        binder.bind(mutablePropertyValues);

// validate the target object
        binder.validate();

// get BindingResult that includes any validation errors
        BindingResult results = binder.getBindingResult();
        System.out.println(results);
    }
}
