/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example;

import java.lang.reflect.Proxy;

import org.example.classes.Man;
import org.example.classes.Person;
import org.example.classes.PersonInvocationHandler;

public class App {
  public static void main(String[] args) {
    Man mohan = new Man("Mohan", "30", "Delhi", "India");
    ClassLoader mohanClassLoader = mohan.getClass().getClassLoader();
    Person proxyMohan = (Person) Proxy.newProxyInstance(mohanClassLoader, new Class[] { Person.class },
        new PersonInvocationHandler(mohan));
    proxyMohan.introduce(mohan.getName());
  }
}
