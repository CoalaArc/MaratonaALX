package com.company;

import java.util.Scanner;

public class Containers
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c;
        int x,y,z;
        int C;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        if (x>=a && y>=b && z>=c)
        {
            C = (x/a) * (y/b) * (z/c);
        } else C = 0;
        System.out.println(C);
    }
}
