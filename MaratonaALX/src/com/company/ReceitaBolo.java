package com.company;

import java.util.Scanner;

public class ReceitaBolo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c, M;

        a = input.nextInt()/2;
        b = input.nextInt()/3;
        c = input.nextInt()/5;

        M = (((a+b + Math.abs(a-b))/2) + c + Math.abs(((a+b + Math.abs(a-b))/2) - c))/2;

        if (M == a)
        {
            if (b>=c) System.out.println(c);
            else System.out.println(b);
        } else if (M == b)
        {
            if (a>=c) System.out.println(c);
            else System.out.println(a);
        } else if (M == c)
        {
            if (a>=b) System.out.println(b);
            else System.out.println(a);
        }
    }
}
