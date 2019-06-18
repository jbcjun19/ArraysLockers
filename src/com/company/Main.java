/**
 * Locker Problem (Arrays)
 *
 * Write a program to simulate the following experiment. You have 100 closed lockers. Start with the first locker and
 * for every locker open it. Now, starting with the second locker, for this locker and every second locker after that,
 * if the locker is open, close it; if it is closed, open it. Then, starting with the third locker, for this locker and
 * every third locker after that, if the locker is open, close it; if it is closed, open it. Continue with the nth
 * locker changing the “position” of every nth locker until n = 100. Print out the locker numbers that remain open.
 * What do you notice about the lockers that remain open?
 */
package com.company;

public class Main {
    public static void main(String[] args){
        boolean[] arr = new boolean[100];
        int x;
        int i;
        for (i = 0; i < arr.length; i++) {
            for (x = i; x < arr.length; x += (i+1)) {
                arr[x] = !arr[x];
            }
        }

        for (i=0;i<arr.length; i++){
            if (arr[i]){
                System.out.println("Locker " +(i+1)+ " is open.");
            }
        }
    }
}
