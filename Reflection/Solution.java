import java.lang.reflect.*;
import java.util.*;
// import java.lang.reflect.Method;
// import java.lang.reflect.Field;
// import java.lang.reflect.Constructor;

class Student {
    private int id;
    private String name;

    Student() {
        id = 0;
        name = "";
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private double score() {
        return -1;
    }

}

public class Solution {
    public static void main(String[] args) {
        Class st = Student.class;

        Method[] methods = st.getDeclaredMethods();

        System.out.println(st.getName());
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        }

    }
}