package com.javavcourse;

import com.javacourse.CarService;

public class CarSelector {

    public static void main(String[] args) {
        com.javacourse.CarService carSvc = new CarService();
        carSvc.process("Audi, bro");
    }
}
