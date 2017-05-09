//package io.zipcoder.microlabs.mastering_loops;

import org.junit.Assert;
import org.junit.Test;
/**
 * Created by vilenalivinsky on 5/9/17.
 */
public class NumbersTest {

    @Test
    public void oneToTenTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noneToTen()\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10";

        //: When
        String actual = numbers.oneToTen();

        //: Then
        Assert.assertEquals("The two strings are equal", expected, actual);
    }

    @Test
    public void oddNumbersTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\noddNumbers()\n1\n3\n5\n7\n9\n11\n13\n15\n17\n19";

        //: When
        String actual = numbers.oddNumbers();

        //: Then
        Assert.assertEquals("The two strings are equal", expected,actual);
    }

    @Test
    public void squaresTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\nsquares()\n1\n4\n9\n16\n25\n36\n49\n64\n81\n100";

        //: When
        String actual = numbers.squares();

        //: Then
        Assert.assertEquals("The two strings are equal",expected, actual);
    }

    /*
    @Test
    public void random4Test() {
        //: Given
        Numbers numbers = new Numbers();
        String expected =
        //: When

        //: Then
    }
    */

    @Test
    public void evenTest() {
        //: Given
        Numbers numbers = new Numbers();
        String expected = "*** Output ***\neven()\n2\n4\n6\n8\n10\n12\n14\n16\n18";

        //: When
        String actual = numbers.even(20);

        //: Then
        Assert.assertEquals("The two strings are equal", expected,actual);
    }

    @Test
    public void powersTest() {
        //: Given

        //: When

        //: Then
    }

}


