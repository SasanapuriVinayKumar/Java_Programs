package Patterns;

import java.util.Scanner;
class Pattern8{
    public static void RightArrow(int n){
        int star=1;
        int space=n-1;
        for (int i=1;i<=n*2-1;i++){
            for(int j=space;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=star;k++){
                System.out.print("*");
            }
                if(i<=4){
                    star++;
                    space--;
                }
                else{
                    star--;
                    space++;
                }
            System.out.println();
        }

    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number:");
        int n=sc.nextInt();
        RightArrow(n);
    }
        

}