package com.rahul.converter;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public int romanToInt(String s) {
        Map<Character,Integer> romanToInteger= new HashMap();
        romanToInteger.put('I',1);
        romanToInteger.put('V',5);
        romanToInteger.put('X',10);
        romanToInteger.put('L',50);
        romanToInteger.put('C',100);
        romanToInteger.put('D',500);
        romanToInteger.put('M',1000);
        if (s==null || s.length()==0)return 0;
        if(s.length()==1) {
            //String I = s.ch
            int val= romanToInteger.get(s.charAt(0));
            return val;
        }
        int result=0;
        result+= romanToInteger.get(s.charAt(0));
        for (int i=1;i<s.length();i++){
            int prev=romanToInteger.get(s.charAt(i-1));
            int curr=romanToInteger.get(s.charAt(i));
            result+=curr;
            if(prev<curr){
                result=result-2*prev;
            }

        }
        return result;
    }
}
