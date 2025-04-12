package com.leetcode.practice;

public class Butterfly {
 public static void main(String[] args) {
     int row = 4;
     for(int i = 0; i< row; i++){
         for(int j = 0; j<i+1; j++){
             System.out.print("* ");
         }
         
         //spaces
         for(int k = 0; k<(row-i-1) * 2; k++){
             System.out.print("  ");
         }
         
         for(int l = 0; l <i+1; l++){
             System.out.print("* ");
         }
         
         System.out.println();
     }
     for(int i = 0; i < row - 1; i++){
         for( int j = 0; j < row - i - 1; j++){
             System.out.print("* ");
         }
         
         //spaces
         for(int k = 0; k<(i+1) * 2;k++){
             System.out.print("  ");
         }
         
         for(int l = 0; l<row-i-1; l++){
             System.out.print("* ");
         }
         System.out.println();
     }
 }
}