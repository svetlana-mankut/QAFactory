package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by polkota on 04.08.2015.
 */
public class Lesson6 {
    public static void main(String[] args) {

ArrayList<Integer> a = new ArrayList<Integer>();
        System.out.println(a.size());
        a.add(10);
        System.out.println(a.size());
        a.add(5);
        a.add(8);
        System.out.println(a.size());
        System.out.println(a.get(1)); //1
        System.out.println(a.get(2)); //2
        a.remove(0);
        System.out.println(a.size());

            Integer[] a1 = {1,2,10,20}; //создать массив
            a.addAll(Arrays.asList(a1)); //превратить массив в список, добавить элементы массива в список
            System.out.println(a);
    }

}