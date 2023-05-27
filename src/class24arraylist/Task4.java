package class24arraylist;

import java.util.ArrayList;

public class Task4 {
    /*
    Creates an arrayList of even numbers from 1 to 500. Remove any number that is divisible by
    5 from the arrayList.
     */
    public static void main(String[] args) {
        ArrayList<Integer> intList=new ArrayList<>();

        for (int i = 2; i < 500 ; i+=2) {
           intList.add(i); }

        intList.removeIf(num -> num%5==0);
        System.out.println(intList);

        }
    }

