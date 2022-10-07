package com.demo.反射.untitled.src.test.java;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class Test {

    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        InputStream in = Test.class.getClassLoader().getResourceAsStream("info.properties");
        properties.load(in);
        String className=properties.getProperty("className");
        String methodName=properties.getProperty("methodName");
        Class clazz=Class.forName(className);
        Object o = clazz.newInstance();
        Method m = clazz.getMethod(methodName);
        m.invoke(o);
    }

}
