package com.leetcode.practice;

public class HallowPattern {
    public static void main(String[] args) {
        int n = 10;
        for(int i = 0; i<n;i++){
            if( i ==0 || i == n-1){
                for(int j = 0; j<n;j++){
                    System.out.print("* ");
                }
            }else{
                for(int l = 0; l<n;l++){
                    if(l == 0 || l == n-1){
                        System.out.print("* ");
                    }else{
                        System.out.print("0 ");
                    }
                }
            }
            
            System.out.println();
        }
    }
}