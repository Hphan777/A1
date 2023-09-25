import java.io.*;
import java.util.Scanner;




public class ClimateQueries {

  public static void main(String[] args) {
    String filename = (args.length > 0) ? args[0] : "YUMA_2023.txt";
    Scanner file = null;

    String[] fields = {};
    String[] date = {};
    float[] temp = {};
    int count = 0;
    int index = 0;

    try {
      file = new Scanner(new File(filename));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }

    while (file.hasNextLine()) {
      count++;
      String line = file.nextLine();
    }

    date = new String[count];
    temp = new float[count];

    try {
      file.close();
      file = new Scanner(new File(filename));
    } catch (FileNotFoundException e) {
      System.err.println("Cannot locate file.");
      System.exit(-1);
    }

    while (file.hasNextLine()) {
      String line = file.nextLine();
      fields = line.split("\\s+");
      if (index < count) {
        date[index] = fields[1];
        temp[index] = Float.valueOf(fields[8]);

      }
      index++;

    }
    System.out.println("Annual mean temperature: " + ArrayMethods.mean2(temp) + " degrees Celsius.");
    System.out.println("Minimum average daily temperature: " + ArrayMethods.min(temp) +  " degrees Celsius.");
    System.out.println("Maximum average daily temperature: " + ArrayMethods.max(temp) + " degrees Celsius.");
    System.out.println("Mean temperature in " + date[1] + ": " + temp[9] + " degrees Celsius");
    System.out.println("Mean temperature in " + date[200] + ": " + ArrayMethods.mean2(temp) + " degrees Celsius");
  }
}
