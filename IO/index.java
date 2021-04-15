import java.io.*;
import java.util.*;

public class index {
    public static void main(String[] args) {
        File fi = new File("input");
        String s = "";
        System.out.println(fi.exists());
        try {
            if (fi.canRead() && fi.exists()) {
                Scanner scan = new Scanner(fi);
                s = scan.nextLine();
                scan.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            FileWriter fo = new FileWriter("output");

            s = s.trim();
            if (s.length() == 0) {
                System.out.println("0");
            } else {
                String[] lines = s.split("\\W+");
                // System.out.println(lines.length);
                fo.write(lines.length + "\n");
                for (String line : lines) {
                    // System.out.println(line);
                    fo.write(line + "\n");
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}