package com.company;

import java.util.Scanner;

public class FrotadeTaxi
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double A = input.nextDouble();
        double G = input.nextDouble();
        double Ra = input.nextDouble();
        double Rg = input.nextDouble();


        if ((A/Ra) < (G/Rg)) System.out.println('A');
        else System.out.println('G');
    }
}
