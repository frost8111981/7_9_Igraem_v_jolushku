package com.frost;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            int input = Integer.parseInt(reader.readLine());
            list.add(input);
        }
        for (int i = 0; i < 20; i++) {
            if (list.get(i) % 3 == 0) {
                list1.add(list.get(i));
            }
            if (list.get(i) % 2 == 0) {
                list2.add(list.get(i));
            }
            if (list.get(i) % 2 != 0 && list.get(i) % 3 != 0) {
                list3.add(list.get(i));
            }
        }


        printList(list1);
        System.out.println();
        printList(list2);
        System.out.println();
        printList(list3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
