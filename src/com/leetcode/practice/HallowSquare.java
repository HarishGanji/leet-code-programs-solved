package com.leetcode.practice;

public class HallowSquare {
 public static void main(String[] args) {
     int m = 4;
     int n= 6;
     
     for(int i = 0; i< m;i++){
         
         if(i == 0 || i == m-1){
             for(int j = 0; j <n;j++){
                 System.out.print("* ");
             }
         }else{
             for(int k = 0; k<n;k++){
                 if(k == 0 || k == n-1){
                     System.out.print("* ");
                 }else{
                     System.out.print("  ");
                 }
             }
         }
         
      
         System.out.println();
     }
 }
}