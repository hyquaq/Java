public class Student {
    private String name, address, sex;
    private double score;

    public Student() {
        this.name = "";
        this.address = "";
        this.sex = "";
        this.score = 0;
    }

    public Student(String name, String address, String sex, double score) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.score = score;
    }

    class StudentOperator {
        public void print() {
            System.out.println("Student[" + name + ", " + address + ", " + sex + ", " + score + "]");
        }

        public String type() {
            if (score > 8) {
                return "A";
            }
            if (score >= 5) {
                return "B";
            }
            return "C";
        }
    }

    public static void main(String[] args) {
        Student student = new Student("huy", "ninh thuan", "male", 10.0);
        // StudentOperator so = student.new StudentOperator();
        // so.print();
        // System.out.println(so.type());

        (student.new StudentOperator()).print();
        String rank = (student.new StudentOperator()).type();
        System.out.println(rank);
    }
}