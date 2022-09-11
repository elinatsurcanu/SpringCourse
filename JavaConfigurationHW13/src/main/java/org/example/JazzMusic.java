package org.example;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JazzMusic implements  Music{
    @PostConstruct
    public void doMiInit () {
        System.out.println("Doing my initizaliztion");
    }

    @PreDestroy
    public void  doMyDestroy() {
        System.out.println("Doing my destruction");
    }
    @Override
    public String getSong() {
        return "Jaazzzzzz";
    }
}
