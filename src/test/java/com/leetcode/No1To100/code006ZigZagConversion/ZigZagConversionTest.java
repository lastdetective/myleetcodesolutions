package com.leetcode.No1To100.code006ZigZagConversion;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

/**
 * ZigZagConversion Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Ê®¶þÔÂ 17, 2018</pre>
 */
public class ZigZagConversionTest {
    private ZigZagConversion zigZagConversion =
            new ZigZagConversion();

    @BeforeEach
    public void before() throws Exception {
    }

    @BeforeEach
    public void after() throws Exception {
    }

    /**
     * Method: convert(String s, int rowNum)
     */
    @Test
    public void testConvert() throws Exception {

//TODO: Test goes here...
        String s = "PAYPALISHIRING";
        System.out.println(s);
        System.out.println(zigZagConversion.convert(s,3));
        System.out.println("PAHNAPLSIIGYIR");
    }


} 
