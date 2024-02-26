import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

public class Student implements Serializable {
    public String stuName;
    public String stuAddress;
    public int stuID;

    public static void main(String[] args) {
        Student student = new Student();
        student.stuName="Rashini";
        student.stuAddress="Gampaha";
        student.stuID=706;

        try {
            FileOutputStream fo = new FileOutputStream("student.ser");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
