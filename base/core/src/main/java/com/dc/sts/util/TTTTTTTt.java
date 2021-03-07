package com.dc.sts.util;


import java.io.Serializable;
import java.lang.reflect.*;
import java.util.HashMap;
import java.util.Map;

/**
 * @author chenxiufeng
 * @version :TTTTTTTt.java, 2021/1/25 19:36, chenxiufeng Exp $
 */
public class TTTTTTTt {
    public static void main(String[] args) {
        Integer integer = new Integer(101944916);
        System.out.println(integer.byteValue());
        System.out.println(Integer.toBinaryString(101944922));
        Map map = new HashMap<>();
        map.put(1, "1");
        Class<?> dataCompareExecutorClass = HashMap.class;
        Class<?> clz = null;
        try {
            clz = Class.forName("com.aspire.sims.framework.iodd.audit.runFlow.impl.DataCompareExecutorImpl");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        AnnotatedType[] annotatedInterfaces = clz.getAnnotatedInterfaces();
        ClassLoader classLoader = clz.getClassLoader();
        try {
            Constructor<?> constructor = clz.getConstructor();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        Constructor<?>[] constructors = clz.getConstructors();
        for (Constructor constructor:constructors){
            System.out.println(constructor.getName());
            System.out.println(constructor.getGenericParameterTypes());
            System.out.println(constructor.getGenericParameterTypes());
        }

        Class<?>[] declaredClasses = clz.getDeclaredClasses();

        Field[] declaredFields = clz.getDeclaredFields();
        for (Field field:declaredFields){
            System.out.println(field.getName());
            System.out.println(field.toGenericString());
            System.out.println(field.toString());
        }

        Field[] fields = clz.getFields();
        System.out.println("blow is from getFields method");
        for (Field field:fields){
            System.out.println(field.getName());
            System.out.println(field.toGenericString());
            System.out.println(field.toString());
        }

        Type[] genericInterfaces = clz.getGenericInterfaces();
        for (Type type:genericInterfaces){
            System.out.println(type.getTypeName());
        }

        Class<HashMap> hashMapClass = HashMap.class;
        Type[] genericInterfaces1 = hashMapClass.getGenericInterfaces();
        for (Type type:genericInterfaces1){
            System.out.println(type.getTypeName());
            Type rawType = ((ParameterizedType) type).getRawType();
            if (rawType== Serializable.class){
                System.out.println(rawType.getTypeName());
            }
           Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();

            for (Type type1:actualTypeArguments){
                System.out.println(type1.getTypeName());
                System.out.println(type1.getClass().toGenericString());
                Class<? extends Type> aClass = type1.getClass();
                Field[] declaredFields1 = aClass.getDeclaredFields();
                for (Field f:declaredFields1){
                    System.out.println(f.toGenericString());

                }
            }

        }
        System.out.println("done===========");
    }
}
