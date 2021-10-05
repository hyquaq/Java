import java.io.*;
import java.util.Scanner;

public class CompareTwoFile {
    public static void main(String[] args) {
        File fi1 = new File("output");
        File fi2 = new File("output06");

        System.out.println(fi1.exists());
        if (fi1.exists() && fi2.exists()) {
            try {
                Scanner sc1 = new Scanner(fi1);
                Scanner sc2 = new Scanner(fi2);
                int number = 0;
                while (sc2.hasNextLine()) {
                    String linef1 = sc1.nextLine();
                    String linef2 = sc2.nextLine();
                    FileWriter fw = new FileWriter("outLine");
                    number++;
                    fw.write("hi\n");
                    if (linef1.equals(linef2) == false) {
                        System.out.println(number);
                        if (number >= 1000) {
                            break;
                        }
                        // System.out.println(linef1);
                        // System.out.println(linef2);
                        // fw.write(number + "\n");
                    }
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}