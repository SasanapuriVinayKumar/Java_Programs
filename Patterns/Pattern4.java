package Patterns;

import java.util.Scanner;
class Pattern4 {
    public static void Leftangle_Number(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr the number:");
        int n=sc.nextInt();
        Leftangle_Number(n);
    }
    
}
