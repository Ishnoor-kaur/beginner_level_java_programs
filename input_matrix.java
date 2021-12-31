package com.mycompany.noor;
import java.util.Scanner;
public class matrix 
{
    int mat[][],m,n,i,j;
 void input()
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("enter rows and columns");
     m=sc.nextInt();
     n=sc.nextInt();
     mat=new int[m][n];
     System.out.println("enter elements"+(m+n));
     for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
             mat[i][j]=sc.nextInt();
     }
 }
 void display()
 {
     for(i=0;i<m;i++)
     {
         for(j=0;j<n;j++)
            System.out.print(mat[i][j]+" ");
         System.out.println();
     }
 }
 public static void main(String args[])
  {
   matrix obj=new matrix();
    obj.input();
    obj.display();
  }
}