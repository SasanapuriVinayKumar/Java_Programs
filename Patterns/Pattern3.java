package Patterns;
import java.util.Scanner;
class Pattern3{
    public static void Reverse_LeftAngle_Triangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        Reverse_LeftAngle_Triangle(n);
    }
}