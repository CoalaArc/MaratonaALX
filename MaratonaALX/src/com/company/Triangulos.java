package com.company;

import java.util.Scanner;

public class Triangulos
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a, b, c, M;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        M = (((a+b + Math.abs(a-b))/2) + c + Math.abs(((a+b + Math.abs(a-b))/2) - c))/2;

        if (M == b)
        {
            a = a+b;
            b = a-b;
            a = a-b;
        } else if (M == c)
        {
            a = a+c;
            c = a-c;
            a = a-c;
        }

        if (a >= (b+c)) System.out.println('n');
        else if (Math.pow(a,2) == (Math.pow(b,2) + Math.pow(c,2))) System.out.println('r');
        else if (Math.pow(a,2) > (Math.pow(b,2) + Math.pow(c,2))) System.out.println('o');
        else if (Math.pow(a,2) < (Math.pow(b,2) + Math.pow(c,2))) System.out.println('a');
    }
}
