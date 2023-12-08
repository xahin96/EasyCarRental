import java.text.DecimalFormat;

/*
Author: Shahriar Rahman
Date: 03-December-2023
*/
public class HelperMethodsString {

    /*
    Author: Shahriar Rahman
    Date: 03-December-2023
    */
    static String formatDoubleToString(double value) {
        // Use DecimalFormat to format the double as a string
        DecimalFormat decimal_Frmt = new DecimalFormat("#.##");
        return decimal_Frmt.format(value);
    }
}
