package com.leetcode.practice;

public class MaxWords {
    public int mostWordsFound(String[] sentences) {
        int[] size = new int[sentences.length];
        int max = 0;
        for(int i = 0; i<sentences.length;i++){
            String[] word = new String[0];
            for(int j = 0; j < sentences[i].length();j++){
                word = sentences[i].split("\\s");
            }
           size[i] = word.length;
        }
        for(int k = 0; k<size.length;k++){
            if(size[k] > max){
                max = size[k];
            }
        }
        return max;
    }
    public static void main(String[] args) {
    	MaxWords mw = new MaxWords();
    	String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
    	int result = mw.mostWordsFound(sentences);
    	System.out.println(result);
    }

   
}

