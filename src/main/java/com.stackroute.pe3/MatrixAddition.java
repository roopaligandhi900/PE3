/*program to compute the addition of two matrix, Read the number of rows and columns
        as input, also the values of each matrixpackage com.stackroute.pe3; */

package com.stackroute.pe3;

public class MatrixAddition {

    public int[][] add(int[][] in1,int[][] in2){

        int[][] out = null;

//        System.out.println(in1.length+" "+in1[1].length);

        if(in1 != null && in2 != null) {
            out = new int[in1.length][in1[0].length];

            for (int i = 0; i < in1.length; i++) {
                for (int j = 0; j < in1[i].length; j++) {
                    out[i][j] = in1[i][j] + in2[i][j];
                }
            }
            return out;
        }

        return null;
    }

}