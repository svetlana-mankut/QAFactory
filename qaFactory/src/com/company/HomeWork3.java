package com.company;

/**
 * Created by polkota on 03.08.2015.
 */

    public class HomeWork3 {

        public static void main(String args[ ])

        {

            int a = 10;

            int b = 20;

            if (a < b) {

                System.out.println("a less then b");

            }

            if (a > b) {

                System.out.println("a more then b");

            } else if (a == b) {

                System.out.println("a equals b");

            } else {

                System.out.println("conditions not met");

            }

            int a1 = 20;

            int b1 = a1 + 5;

            String s = "Test String";




            if ("20" != s) {

                System.out.println("a not eqal s");

            }

// a not eqal s

            if (s == "20") { System.out.println("equals"); }

            else {

                System.out.println("not equals");

            }

// not equals

            if (a1 > a1) {

                System.out.println("a1 greater a1");

            } else if (a1 < a1) {

                System.out.println("a1 less a1");

            } else {

                System.out.println("other");

            }

// other

            if (false) {

                System.out.println("hi there");

            }

//

            while (a1 > 0) {

                System.out.println("Recycle " + b1);

                a1 = a1 - 10;

            }

// Recycle 25 // Recycle 25

            for (int h = 5; h < 8; h+=2) {

                System.out.print("With power comes responsibility.");

            }

// With power comes responsibility.With power comes responsibility.

            System.out.println();

            for (int u = 2000; u > 918; u = 918) {

                System.out.println("continue");

            }

//continue

            String t="Hello Class";

            System.out.println(t);

            String ts = ", and Student!";

            System.out.println(t + ts);

            for (int x=8; x < 11; x++) {

                System.out.println(x);

            }{

// 8

// 9

// 10

            String []g={"How", "are", "you"};

            for (int i = 0; i < 3; i++) {

                System.out.println(g[i]);

            }

// How

// are

// you

            int[] m = {10, 20, 25, 30};

            int i = 0;

            int r = 25;

            while (i < 4) {

                if (m[i] == r) {

                    break;

                }

                System.out.println(m[i]);

                i++;

            }

// 10

// 20

            int [] n={10,20,25,30};

            int j=0;

            int d=10;

            while (j<4){

                if (n[j]==d){

                    j++;

                    continue;

                }

                System.out.println(n[j]);

                j++;

// 20

// 25

// 30

            }

        }

        }}


