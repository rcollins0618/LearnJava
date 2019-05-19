package com.javacourse;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarServiceTest {

    @Test
    public void demonstrateLogging() {
        com.javacourse.CarService carSvc = new com.javacourse.CarService();
        carSvc.process("Audi");
        // System.out.println("Test, yo.");
    }
}