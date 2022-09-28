package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateFakultaet(5));
    }
    public static int calculateFakultaet(int number) {
        if (number == 0) {
            return number;
        }
        int result = 1;
        for(int i = 1; i <=number; i++) {
            result *= i;
        }
        return result;
    }
}