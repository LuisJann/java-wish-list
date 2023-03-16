package org.exercise.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        boolean check = false;

        while (!check){
            System.out.println("Quale desiderio vuoi inserire?: ");
            String wish = scan.next();
            System.out.println("Hai altri desideri?(y/n): ");
            check = scan.next().equalsIgnoreCase("n");
            list.add(wish);
        }

        System.out.println(list);

    }
}