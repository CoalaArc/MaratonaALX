package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Carnaval
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double[] notas = new double[5];
        for (int n = 0; n < notas.length; n++)
        {
            notas[n] = input.nextDouble();
        }

        Arrays.sort(notas);

        System.out.printf("%.1f\n", notas[1]+notas[2]+notas[3]);
    }
}