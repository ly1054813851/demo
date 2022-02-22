package com.example.java8test;

import java.util.HashSet;
import java.util.Set;

/**
 * @author：ly
 * @Data :16:10 2021/12/29
 **/
public class test11 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "bbbca";
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < s1.length(); i++){
            sb.append(s1.charAt(s1.length()-i-1));
        }
        String f = sb.toString();
        int n1 = s1.length();
        int n2 = s2.length();
        int temp = 0;
        boolean p = false;
        while(temp<n2){
            if(n2-temp+1>n1){
                String b = s2.substring(temp,n1+temp);
                if(b.equals(s1)||b.equals(f)){
                    p = true;
                }
            }
            temp++;
        }
        System.out.println(p);



    }
}
