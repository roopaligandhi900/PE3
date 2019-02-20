/* Create a class called StudentMarks, which prompts user for the number of students, reads it
from the keyboard, and saves it in an int variable called numOfStudents. It then prompts user for the
grades of each of the students and saves them in an int array called stuGrades. Your program shall
check that the grade is between 0 and 100 else has to trow an error message. */



package com.stackroute.pe3;

import java.util.Scanner;

public class StudentData extends Exception {

    public static void main(String[] args) throws Exception{

        int num;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students :: ");
        num = input.nextInt();

        int[] data = new int[num];

        System.out.println("Enter the marks :: ");

        for(int i=0; i<num; i++){
            data[i] = input.nextInt();
        }

        try {
            for (int i = 0; i < num; i++) {
                if (data[i] < 0 || data[i] > 100)
                    throw new Exception("Invalid Marks");
            }
        }
        catch (Exception x){
            System.out.println(x);
        }
        finally{
            System.out.println("Finally arrived");
        }

    }

}