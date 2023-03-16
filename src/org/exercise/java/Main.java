package org.exercise.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        ChristmasLetter letter = new ChristmasLetter("","",list);
        boolean check = false;

        System.out.println("Come ti chiami?: ");
        letter.setName(scan.next());
        System.out.println("Dove abiti?:  ");
        letter.setAddres(scan.next());

        while (!check){
            System.out.println("Quale desiderio vuoi inserire?: ");
            String wish = scan.next();
            System.out.println("Hai altri desideri?(y/n): ");
            check = scan.next().equalsIgnoreCase("n");
            list.add(wish);

        }
            try {
                letter.send();
            }catch (RuntimeException e){
                System.out.println(e.getMessage());
            }
        scan.close();
    }
}