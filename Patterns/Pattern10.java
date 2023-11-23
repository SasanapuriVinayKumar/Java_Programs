package Patterns;

import java.util.Scanner;

class Pattern10
{
    public static void reverseTriangle(int n)
    {
        int num=n*2;
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i;k++)
            {
                // System.out.print("1");
                System.out.print(" ");
            }
            for(int j=num-1;j>=i;j--)
            {
                System.out.print("*");
            }
            num=num-1;
            System.out.println();
        }
    }

    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        reverseTriangle(n);


    }
}