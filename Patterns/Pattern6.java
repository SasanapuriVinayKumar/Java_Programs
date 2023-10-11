package Patterns;

import java.util.Scanner;
class Pattern6{
    public static void Rightangle_Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=1;j--){
                if(i>=j){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();        
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        Rightangle_Triangle(n);
    }
}