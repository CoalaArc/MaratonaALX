package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Capital
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] areas = new int[4];

        for (int a=0; a < areas.length; a++)
        {
            areas[a] = input.nextInt();
        }

        Arrays.sort(areas);

        double a = areas[0];
        double b = areas[1];
        double c = areas[2];
        double d = areas[3];

        if ((a/b) == c/d || a/c == b/d)
        {
            System.out.println('S');
        } else System.out.println('N');
    }
}
