package com.foodpanda;

//import com.foodpanda.controller.Controller;

import com.foodpanda.controler.Controller;

/**
 * The main class for the FoodPanda console application.
 * This class serves as the entry point for the application.
 */
public class FoodPandaApp {
    public static void main(String[] args) {
        // Initialize the Controller
        Controller controller = new Controller();

        // Start the application
        controller.start();

    }
}
