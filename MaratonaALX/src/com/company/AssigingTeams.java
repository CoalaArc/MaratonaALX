package com.company;

import java.util.Scanner;

public class AssigingTeams
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int a,b,c,d, Mabc, M;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        d = input.nextInt();

        Mabc = (((a+b + Math.abs(a-b))/2) + c + Math.abs(((a+b + Math.abs(a-b))/2) - c))/2;
        M = (Mabc+d + Math.abs(Mabc-d))/2;
        //Aqui eu tenho certeza que o M é maior numero entre os 4

        if (M != d)
        {
            if (M == a)
            {
                d = d+a;
                a = d-a;
                d = Math.abs(d-a);
            } else if (M == b)
            {
                d = d+b;
                b = d-b;
                d = Math.abs(d-a);
            } else if (M == c)
            {
                d = d+c;
                c = d-c;
                d = Math.abs(d-a);
            }
        }
        //Aqui eu tenho certeza que o maior número está na variável 'd'

        M = (((a+b + Math.abs(a-b))/2) + c + Math.abs(((a+b + Math.abs(a-b))/2) - c))/2;
        if (M == a)
        {
            if (b>=c)
            {
                a = a+c;
                c = a-c;
                a = Math.abs(a-c);
            }
            else
            {
                a = a+b;
                b = a-b;
                a = Math.abs(a-b);
            }
        } else if (M == b)
        {
            if (a>c)
            {
                a = a+c;
                c = a-c;
                a = Math.abs(a-c);
            }
        } else if (M == c)
        {
            if (a>b)
            {
                a = a+b;
                b = a-b;
                a = Math.abs(a-b);
            }
        }
        //Aqui eu tenho certeza que o maior está na variável 'd' e o menor na variável 'a'

        System.out.println(Math.abs((a+d) - (b+c)));
    }
}
