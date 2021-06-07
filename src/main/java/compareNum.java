/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao zhu
 */

import java.util.Scanner;
public class compareNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] index = {"first","second","third"};
        int[] num = new int[3];
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Enter the "+ index[i] +"number:");
            num[i] = scan.nextInt();
        }
        int max_num = num[0];
        for(int i = 0; i < 3; i++)
        {
            if(max_num < num[i])
            {
                max_num = num[i];
            }
        }
        System.out.println("The largest number is "+ max_num);
    }
}
