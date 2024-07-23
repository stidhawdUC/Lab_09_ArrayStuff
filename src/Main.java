import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        for(int x = 0; x < dataPoints.length; x++)
        {
            dataPoints[x] = rnd.nextInt(100) + 1;
        }
        for(int x = 0; x < dataPoints.length; x++)
        {
            System.out.printf("%4d |", dataPoints[x]);
            if(x % 15 == 0 && x > 0) System.out.println();
        }
        int dataSum = 0;
        int dataAve = 0;
        for(int x = 0; x < dataPoints.length; x++)
        {
            dataSum += dataPoints[x];
        }
        dataAve = dataSum / dataPoints.length;
        System.out.printf("\n\nThe sum of the random dataPoints is " + dataSum + ".\nThe average " +
                "of the random dataPoints is " + dataAve + ".");
        System.out.println();
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
        int dataMin = dataPoints[0];
        int dataMax = dataPoints[0];
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataMin > dataPoints[x]) dataMin = dataPoints[x];
            if(dataMax < dataPoints[x]) dataMax = dataPoints[x];
        }
        System.out.println("\nThe minimum value within the random dataPoints is " + dataMin + "." +
                "\nThe maximum value within the random dataPoints is " + dataMax + ".");

        int linearScanOne = 0;
        linearScanOne = SafeInput.getRangedInt(in, "Please enter an integer value to search for", 1, 100);
        boolean foundLinOne = false;
        int timesFoundLinOne = 0;
        for(int x = 0; x < dataPoints.length; x++) {
            if(linearScanOne == dataPoints[x])
            {
                foundLinOne = true;
                timesFoundLinOne ++;
                System.out.printf("\nInteger value " + linearScanOne + " found at index " + x + ".");
            }
        }
        if(!foundLinOne) {System.out.println("\nInteger value " + linearScanOne + " not found in the dataPoints!");}
        else
        {
            if(timesFoundLinOne == 1) {System.out.println("\nInteger value " + linearScanOne +
                    " found " + timesFoundLinOne + " time.");}
            else {System.out.println("\nInteger value " + linearScanOne + " found " + timesFoundLinOne +
                    " times.");}
        }
        int linearScanTwo = 0;
        linearScanTwo = SafeInput.getRangedInt(in, "Please enter an integer value to search for", 1, 100);
        boolean foundLinTwo = false;
        for(int x = 0; x < dataPoints.length; x++) {
            if(linearScanTwo == dataPoints[x])
            {
                foundLinTwo = true;
                System.out.printf("\nInteger value " + linearScanTwo + " found at index " + x + ";" +
                        " now breaking.");
                break;
            }
        }
        if(!foundLinTwo) System.out.println("\nInteger value " + linearScanTwo + " not found in the dataPoints!");



    }
    public static double getAverage(int values[])
    {
        double arraySum = 0;
        double arrayAve = 0;
        for(int y = 0; y < values.length; y++)
        {
            arraySum += values[y];
        }
        arrayAve = arraySum / values.length;
        return arrayAve;
    }
}
