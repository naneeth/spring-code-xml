package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {


//        BeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource("beans.xml"));
//        Movie movie = (Movie) beanFactory.getBean("movie");
//        System.out.println(movie.getActor());
//
//        BeanDefinitionRegistry beanDefinitionRegistry = new DefaultListableBeanFactory();
//        BeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanDefinitionRegistry);
//        beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("beans.xml"));
//        Movie movie1 = (Movie) ((DefaultListableBeanFactory) beanDefinitionRegistry).getBean("movie");
//        System.out.println(movie1.getActor());

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        Movie movie1 = (Movie) applicationContext.getBean("movie1");
        System.out.println(movie1.getActor());
//        ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("beans.xml");
//        Movie movie2 = (Movie) applicationContext2.getBean("movie2");
        System.out.println(movie1.getActor());

    }
}