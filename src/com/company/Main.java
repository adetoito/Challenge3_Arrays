package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String temp;

        String names[] = new String[1000];
        int grades[] = new int[1000];
        int index = 0;

        do {
            System.out.println("Enter a name. Type \"-1\" to stop.");
            temp = sc.nextLine();

            if (!temp.equals("-1")) {
                names[index] = temp;
            } else {
                break;
            }
            System.out.println("Enter that person's grade.");
            grades[index] = sc.nextInt();

            System.out.println("NAME: " + names[index]);
            System.out.println("GRADE: " + grades[index] + "%");

            index++;
        } while (index < names.length);

    }
}
