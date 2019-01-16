package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
    private Actor actor;
    public Movie() {

    }
    Movie(Actor actor) {
        this.actor = actor;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("In application context aware");
    }

    public void setBeanName(String s) {
        System.out.println("In set bean Name");
    }


    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("In Bean Factory");
    }
}
