package com.company;

import java.util.Scanner;

public class TiraTeima
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int X = input.nextInt();
        int Y = input.nextInt();

        if (X >= 0 && X <= 432 && Y >= 0 && Y <= 468) System.out.println("dentro");
        else System.out.println("fora");
    }
}
