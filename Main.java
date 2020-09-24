import zoopackage.*;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.*;

public class Main {
    private static int numDays = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of days for the zoo to operate: ");
        numDays = sc.nextInt();
        sc.close();

        PrintStream fileName;
        try {
            fileName = new PrintStream("dayatthezoo.out");
            System.setOut(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Zoo ourZoo = new Zoo(numDays);
    }
}