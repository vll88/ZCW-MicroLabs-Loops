
/**
 * Created by vilenalivinsky on 5/10/17.
 */
public class Shapes {

    public String triangle() {

        String output = "";
        output += "###Example\ntriangle()\n*** Output ***";

        String counter = "";
        for (int i = 1; i <= 5; i++) {

            counter += "*";
            output += "\n" + counter;
        }

        return output;
    }


    public String tableSquare() {

        String output = "";
        output += "###Example\ntableSquare()\n*** Output ***";

        //j=row, i=col
        for (int j = 1; j <= 4; j++) {

            output +="\n";
            for (int i = 1; i <= 4; i++) {

                output += "| " + (j * i)+" ";
            }
            output += "|";
        }
        return output;
    }



}
