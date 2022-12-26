
/**
    3)  The daily maximum temperatures recorded for 5 cities during the first 6 days
        of January month have to be tabulated. Develop an application to read the
        data and find the city and day corresponding to highest temperature and
        lowest temperature

    Name of the program: _3Temperature.java
*/

import java.util.*;

class Info {
    void input(double[][] arr) {
        System.out.println("\nEnter max temperatures(in Celsius) during first 6 days of January month >>> ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("In City-" + (i + 1) + ": ");
            for (int j = 0; j < 6; j++)
                arr[j][i] = sc.nextDouble();
        }
        sc.close();
    }

    void highestAndLowest(double[][] arr) {
        double high = arr[0][0];
        double low = arr[0][0];

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 5; j++) {
                if (high < arr[i][j])
                    high = arr[i][j];
                if (low > arr[i][j])
                    low = arr[i][j];
            }

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 5; j++) {
                if (high == arr[i][j])
                    System.out.println("\nHighest temperature was " + high + " Celsius on day-" + (i + 1)
                            + " in the City-" + (j + 1));
                if (low == arr[i][j])
                    System.out.println(
                            "Lowest temperature was " + low + " Celsius on day-" + (i + 1) + " in the City-" + (j + 1));
            }
    }
}

public class q3 {
    public static void main(String[] args) {
        System.out.println("\n*************** WELCOME ***************");

        double[][] arr = new double[6][5];
        Info obj = new Info();
        obj.input(arr);
        obj.highestAndLowest(arr);

        System.out.println("\n*************** THANK YOU ***************");
    }
}
