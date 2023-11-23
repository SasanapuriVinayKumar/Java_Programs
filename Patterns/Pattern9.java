package Patterns;

import java.util.Scanner;
class Pattern9 {
    public static void Triangle(int n){
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=num;k++){
                System.out.print("*");
            }
            num=num+2;
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        Triangle(n);
    }
}
