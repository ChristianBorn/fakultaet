package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateFakultaet(5));
    }
    public static int calculateFakultaet(int number) {
        /*if (number == 0) {
            return 1;
        }
        int result = 1;
        for(int i = 1; i <=number; i++) {
            result *= i;
        }
        return result;*/
        if (number == 0) {
            return 1;
        }
        int i = 1;
        int result = 1;
        while(i <= number) {
            result *= i;
            i++;
        }
        return result;
    }
}