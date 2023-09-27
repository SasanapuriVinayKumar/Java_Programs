package Patterns;

import java.util.Scanner;
class Pattern5{
    public static void Arrow(int n){
        int star=1;
        for(int i=1;i<=n*2-1;i++){
            for(int j=1;j<=star;j++){
                System.out.print("*");
            }
            if (i<=4){
                star++;
            }
            else{
                star--;
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number:");
        int n=sc.nextInt();
        Arrow(n);
    }
}