package com.rahul.converter

import spock.lang.Specification


class IntegerConverterSpec extends Specification {
    IntegerToRoman integerCoverter = new IntegerToRoman();
    RomanToInt romanToInt= new RomanToInt();

    def "should throw exception"() {
        given:
        def i = -1
        when:
        integerCoverter.getRoman(i)
        then:
        thrown(IllegalArgumentException)

    }
    //data driven exception
    def "get roman literals"(int a, String b){
        expect:
        integerCoverter.getRoman(a)== b ;
        where:
        a|b
        1|"I"
        10|"X"
        100|"C"

    }
    def "should return integer literals" (String a, int b){

        expect:
        romanToInt.romanToInt(a)==b
        where:
        a|b
        "I"|1
        "X"|10
        "XIV"|14
    }

}
