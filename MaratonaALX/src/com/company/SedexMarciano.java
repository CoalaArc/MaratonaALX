package com.company;

import java.util.Scanner;

public class SedexMarciano
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int L,A,C,raio;

        L = input.nextInt();
        A = input.nextInt();
        C = input.nextInt();
        raio = input.nextInt();

        if (Math.sqrt(Math.pow(L,2) + Math.pow(A,2) + Math.pow(C,2)) <= (raio*2)) System.out.println('S');
        else System.out.println('N');

    }
}
