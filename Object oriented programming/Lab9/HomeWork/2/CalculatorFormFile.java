import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CalculatorFormFile {
    public static int sumFormFile(String path) {
        try {
            File fi = new File(path);
            Scanner sc = new Scanner(fi);
            int result = 0;
            while (sc.hasNextInt()) {
                result += sc.nextInt();
            }
            sc.close();
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return 0;
    }

    public static boolean writeToFile(String path, int source) {
        try {
            FileWriter fo = new FileWriter(path);
            fo.write(String.valueOf(source));
            fo.close();
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    public static void main(String[] args) {
        int sum = sumFormFile("input.txt");
        if (writeToFile("output.txt", sum)) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }
    }
}