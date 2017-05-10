import org.junit.Assert;
import org.junit.Test;
/**
 * Created by vilenalivinsky on 5/10/17.
 */

public class ShapesTest {

    @Test

    public void triangleShapes(){

        //Given
        Shapes t1 = new Shapes();
        String expected = "###Example\ntriangle()\n*** Output ***\n*\n**\n***\n****\n*****";

        //When
        String actual = t1.triangle();

        //Then
        Assert.assertEquals("The two strings are equal",expected,actual);
    }

    @Test

    public void squaretableShapes(){

        //Given
        Shapes table = new Shapes();
        String expected = "###Example\ntableSquare()\n*** Output ***\n| 1 | 2 | 3 | 4 |\n| 2 | 4 | 6 | 8 |\n" +
                "| 3 | 6 | 9 | 12 |\n| 4 | 8 | 12 | 16 |";

        //When
        String actual = table.tableSquare();

        //Then
        Assert.assertEquals("The two strings are equal",expected,actual);
    }



}
