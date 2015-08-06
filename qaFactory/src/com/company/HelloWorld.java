package com.company;

/**
 * Created by polkota on 16.07.2015.
 */
public class HelloWorld {
    public static void main(String[] args) {

// Hello class15

        int a = 20; int b = a + 5;
        String s = "Test String";
        System.out.println(a);
// 20
        System.out.println(a + b);
// 45
        System.out.println(s + a);
// Test String20
        System.out.println(a + s);
// 20Test String
        System.out.println(a == b);
// false
        System.out.println(a < b);
// true
        System.out.println(true && false); // && means AND
// false
        System.out.println(a == 20.0);
// true
        System.out.println(true || false); // || means OR
// true
        int c = b + a;
        a = 0;
        System.out.println(c == (b + a));
// false
        s = "0";

// false
        System.out.println(s == "0");
// true
        int[] i = {1, 2, 3, 4, 5, 5, 5, 1};
        System.out.println(i[1] - i[4]);
// -4
        i[4] = i[6];
        System.out.println(i[4]);
// 5
        i[0] = i[1] * i[2];
        System.out.println(i[0]);
// 6
        System.out.println(s + s + s + s + s);
// 00000



            int xy=0;
            if (a<10 && b==20 && true);
            while (xy<10);{
                xy+=5; //xy=xy+5
                System.out.println("xy=" + xy);
            }
        }
    }



