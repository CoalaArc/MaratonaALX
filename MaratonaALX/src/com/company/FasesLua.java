package com.company;

import java.util.Scanner;

public class FasesLua
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int D1 = input.nextInt();
        int D2 = input.nextInt();

        if (D1 >= 0 && D2 <= 2) System.out.println("nova");
        else if (D1 < D2 && D2 <= 96) System.out.println("crescente");
        else if (D1 >= D2 && D2 <= 96) System.out.println("minguante");
        else System.out.println("cheia");
    }
}
