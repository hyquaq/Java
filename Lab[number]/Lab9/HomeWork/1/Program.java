import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("1. show list");
        File f = new File("./");
        for (String l : f.list()) {
            System.out.println(l);
        }

        System.out.println("\n2. check path");
        System.out.print("enter path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        f = new File(path);
        if (f.exists()) {
            System.out.println("is exists");
        } else {
            System.out.println("no exists");
        }

        System.out.println("\n3. check directory or file");
        System.out.print("enter path: ");
        path = sc.nextLine();
        f = new File(path);
        if (f.isFile()) {
            System.out.println(path + " is file.");
        } else if (f.isDirectory()) {
            System.out.println(path + " is directory");
        } else {
            System.out.println("no file, no directory");
        }

        System.out.println("\n4. append text");
        System.out.print("enter path(input.txt): ");
        path = sc.nextLine();
        System.out.print("enter text: ");
        String content = sc.nextLine();
        f = new File(path);
        if (f.exists()) {
            try {
                FileWriter fo = new FileWriter(path);
                fo.write(content);
                fo.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

        System.out.println("\n5. longest word");
        System.out.print("enter path(input.txt): ");
        path = sc.nextLine();
        f = new File(path);
        if (f.exists()) {
            try {
                sc.close();
                sc = new Scanner(f);
                int lengthMax = 0;
                String result = "";
                while (sc.hasNextLine()) {
                    for (String s : sc.nextLine().split(" ")) {
                        if (s.length() > lengthMax) {
                            lengthMax = s.length();
                            result = s;
                        }
                    }
                }
                System.out.println(result);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

        sc.close();
    }
}
