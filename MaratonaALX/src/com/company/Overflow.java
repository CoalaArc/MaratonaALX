package com.company;

import java.util.Scanner;

public class Overflow
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();
        char C = input.next().charAt(0);
        int Y = input.nextInt();

        if (C == '+')
        {

           if ((X + Y) <= N) System.out.println("OK");
           else System.out.println("OVERFLOW");
        } else if (C == '*')
        {
            if ((X * Y) <= N) System.out.println("OK");
            else System.out.println("OVERFLOW");
        }
    }
}
