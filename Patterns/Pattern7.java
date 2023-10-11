package Patterns;

import java.util.Scanner;
class Pattern7{
    public static void Reverse_Rightangle_Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i<=j){
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
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        Reverse_Rightangle_Triangle(n);

    }
}