package com.leetcode.practice;

public class DefangingIpAddress {
    public String defangIPaddr(String address) {
        String a = "";
        for(int i = 0; i < address.length(); i++){
         if(address.charAt(i) == '.'){
             a += "[.]";
         }else{
             a += address.charAt(i);
         }
        }
        return a;
     }
    public static void main(String args[]) {
    	DefangingIpAddress dp = new DefangingIpAddress();
    	String s = "1.1.1.1";
    	String result = dp.defangIPaddr(s);
    	System.out.println(result);
    	
    }
 }