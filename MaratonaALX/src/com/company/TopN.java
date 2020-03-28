package com.company;

import java.util.Scanner;
import static java.lang.System.*;

public class TopN {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        int N = input.nextInt();

        if (N == 1) out.println("Top 1");
        else if (N > 1 && N <= 3) out.println("Top 3");
        else if (N <= 5) out.println("Top 5");
        else if (N <= 10) out.println("Top 10");
        else if (N <= 25) out.println("Top 25");
        else if (N <= 50) out.println("Top 50");
        else if (N <= 100) out.println("Top 100");
    }
}
