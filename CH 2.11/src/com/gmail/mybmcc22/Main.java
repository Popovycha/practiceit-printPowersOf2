package com.gmail.mybmcc22;

/**
 * Write a method called printPowersOf2 that accepts a maximum number
 * as an argument and prints each power of 2 from 20 (1) up to that maximum power,
 * inclusive.
 * For example, consider the following calls:
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        printPowersOf2(3);
        printPowersOf2(10);
    }
    static void printPowersOf2(int num){
        for (int i = 0; i <= num; i++){
            System.out.print(((int) Math.pow(2, i )) + " ");
        }
        System.out.println();
    }
}
