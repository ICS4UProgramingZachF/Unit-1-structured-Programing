package com.company;

import com.sun.xml.internal.ws.commons.xmlutil.Converter;

import java.util.Scanner;
import java.io.Console;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double logLenght1 = 1;
        double logLenght2 = 0.5;
        double logLenght3 = 0.25;
        double logMax = 1100;
        double logAnwser = 0;
        double logWaight1 = 20;
        double logWaight2 = 10;
        double logWaight3 = 5;

        String inputLenghtQuistion = "Select the lenght of the logs you want to have.";
        System.out.println(inputLenghtQuistion);

        String inputLenghtQuistion2 = "there are 3 difrent option that our trcuks suport.";
        System.out.println(inputLenghtQuistion2);

        String inputLgenghtNumber = "1m, 0.5m and 0.25m";
        System.out.println(inputLgenghtNumber);

        String inputLenghtfinal = "Enter the one that best suits your need";

        System.out.println(inputLenghtfinal);

        Scanner reader = new Scanner(System.in);
        System.out.println("↓ Enter the log length as a number ↓ ");
        double logLenght = reader.nextDouble();
        reader.close();

        if (logLenght == logLenght1) {
            logAnwser = logMax / logWaight1;
            String Anwser1 = String.valueOf(logAnwser);
            System.out.println(Anwser1 + " longs in one trcuk");
        }
        if (logLenght == logLenght2){
            logAnwser = logMax / logWaight2;
        String Anwser2 = String.valueOf(logAnwser);
        System.out.println(Anwser2 + " longs in one trcuk");
        }
            if (logLenght == logLenght3) {
                logAnwser = logMax / logWaight3;
                String Anwser3 = String.valueOf(logAnwser);
                System.out.println(Anwser3 + " longs in one trcuk");
            }
    }
}
