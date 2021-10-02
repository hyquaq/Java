public class Student{

    private int id;
    private String firstName, lastName;

    public Student(){
        this.id = 0;
        this.firstName = "";
        this.lastName = "";
    }

    public Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getId(){
        return this.id;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    public void setId(int id){
        this.id = id;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    @Override
    public String toString(){
        return "Student[id = "+ this.id + ",firstName = " + this.firstName + ", lastName= " + this.lastName + "]";
    }
}