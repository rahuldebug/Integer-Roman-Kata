package com.rahul.converter

import spock.lang.Specification


class IntegerConverterSpec extends Specification {
    IntegerCoverter integerCoverter = new IntegerCoverter();

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

}
