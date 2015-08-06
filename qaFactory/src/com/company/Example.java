package com.company;

/**
 * Created by polkota on 04.08.2015.
 */
public class Example {

                public static void main(String args[ ])
            {
                int[] a = {76, 90, 4, 87, 70, 57, 48, 70, 31, 69, 18, 40, 76};
                int[] b = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
                int[] eR = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};
                int[] aR = new int [13];

                {
                    for (int i = 0; i < 13; i++) {
                        aR[i] = (a[i]+b[i]);


                        if (eR[i] != aR[i]) {
                            System.out.println("Expected: " + eR[i] + " Actual: " + aR[i] + " Test FAILED.");
                        }
                        else {
                            System.out.println("Test PASSED.");
                        }
                    }
                }}



        }


