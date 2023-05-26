package com.rahul.converter;

public class IntegerCoverter {
    private String[] unit={"","I","II","III","IV","V","VI","VII","VIII","IX"};
    private String[] tens={"", "X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
    private String[] hundreds={"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};

        public String getRoman(int i) throws IllegalAccessException {
            if(i<0){
                throw new IllegalArgumentException("it cannot be negative");
            }
            else {
                return hundreds[(i%1000)/100]+tens[(i%100)/10]+unit[i%10];
            }
        }
}
