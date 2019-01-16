package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie1.getActor());
        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie2 = (Movie) applicationContext2.getBean("movie1");
        System.out.println(movie2.getActor());
        System.out.println(movie1==movie2);
    }
}