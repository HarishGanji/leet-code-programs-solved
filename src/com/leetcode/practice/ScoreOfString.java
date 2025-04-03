package com.leetcode.practice;
import java.util.*;

public class ScoreOfString {
    Scanner sc = new Scanner(System.in);
    public int scoreOfString(String s) {
        int solution = 0;
        for(int i = 0; i<s.length()-1;i++){
            for(int j = i; j<=i;j++){
                solution = solution + Math.abs(s.charAt(j) - s.charAt(j+1));
            }
        }
        return solution;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close(); 
        ScoreOfString sol = new ScoreOfString();
        int result = sol.scoreOfString(input);
        System.out.println(result);
    }
}