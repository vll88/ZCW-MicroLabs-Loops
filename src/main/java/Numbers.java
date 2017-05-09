//package io.zipcoder.microlabs.mastering_loops;

import java.util.ArrayList;

/**
 * Created by vilenalivinsky on 5/9/17.
 */
public class Numbers {

    public String oneToTen() {

        String output ="";
        output +="*** Output ***\noneToTen()\n";

        for (int i=1; i<=10;i++){

            if(i!=10){
            output += i+"\n";}
            else{
                output+=i;
            }
        }
        return output;
    }


    public String oddNumbers() {
        String output = "";
        output += "*** Output ***\noddNumbers()\n";

        for (int i = 1; i <= 19; i++) {
            if (i != 19 && i % 2 != 0) {
                output += i + "\n";
            }
            else if(i%2!=0){
                output += i;
            }
        }
        return output;
    }


    public String squares() {
        String output = "";
        output += "*** Output ***\nsquares()\n";

        for (int i = 1; i <= 10; i++) {

            if (i != 10) {
                output += (i * i) + "\n";
            } else {
                output += i * i;
            }
        }
        return output;
    }

/*
    public String random4() {
        return "";
    }
*/
    public String even(int integer) {

        String output = "";
        output += "*** Output ***\neven()";

        for (int i = 1; i < integer; i++) {

            if (i % 2 == 0 && i!=(integer)) {
                output += "\n"+i;
            }
            //else if(i%2 == 0) {
            //    output += i;
           //     }
            }

        return output;
        }





    public String powers(int n) {
        return "";
    }

}
