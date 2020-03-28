package com.company;

import java.util.Scanner;

public class SomaFracao
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c,d;
        double Dividendo,Divisor, resto, e,f;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        e = a*d + b*c;
        f = b*d;

        Dividendo = e;
        Divisor = f;


        while (f != 0)
        {
            resto = e%f;
            e = f;
            f = resto;
        }

        Dividendo /= e;
        Divisor /= e;

        System.out.printf("%.0f %.0f\n", Dividendo, Divisor);
    }
}
