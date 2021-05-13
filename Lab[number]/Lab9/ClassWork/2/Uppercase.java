import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Uppercase {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<String>();

        // read data form file
        try {
            File fi = new File("input.txt");
            Scanner sc = new Scanner(fi);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lines.add(line);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // write data to file
        try {
            FileWriter fo = new FileWriter("output.txt");
            for (String line : lines) {
                fo.write(String.format("%s\n", line.toUpperCase()));
            }
            fo.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}