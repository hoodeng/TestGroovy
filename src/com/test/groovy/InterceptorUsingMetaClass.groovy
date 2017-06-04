package com.test.groovy

import com.test.groovy.com.test.java.Pig

/**
 * Created by wudeng on 17/6/4.
 */
class Car {
    def check() {
        System.out.println("this is checking")
    }

    def start() {
        System.out.println("this is starting")
    }
}

Car.metaClass.invokeMethod { String name, args ->
    System.out.println("this is invoking $name")

    if (name != 'check') {
        System.out.println("this is filter")
        com.test.groovy.Car.metaClass.getMetaMethod('check').invoke(delegate, null)
    }

    def invokeMethod = com.test.groovy.Car.metaClass.getMetaMethod(name);
    if (invokeMethod != null) {
        invokeMethod.invoke(delegate, null)
    }
}


com.test.groovy.Car car = new com.test.groovy.Car();
car.start();


Pig.metaClass.drive = {
    System.out.println("a pig is driving")
}

Pig pig = new Pig();
pig.eat()
pig.drive();


Pig.metaClass.invokeMethod = { String name, args ->
    if (name != 'drive') {
        System.out.println("this is filter")
        Pig.metaClass.getMetaMethod('drive').invoke(delegate, null);
    }

    def invokeMethod = Pig.metaClass.getMetaMethod(name);
    if (invokeMethod != null) {
        invokeMethod.invoke(delegate, null);
    }
}

Pig pig1 = new Pig();
pig1.eat()