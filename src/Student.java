import java.io.*;

public class Student implements Serializable {
    public String stuName;
    public String stuAddress;
    public int stuID;

    public static void main(String[] args) {
        Student student = new Student();
        student.stuName="Ganidu";
        student.stuAddress="Gampaha";
        student.stuID=706;

        try {
            FileOutputStream fo = new FileOutputStream("student.ser");
            //Serializing the object
            ObjectOutputStream objo = new ObjectOutputStream(fo);
            objo.writeObject(student);

            System.out.println("Student Serialized...");

            objo.close();
            fo.close();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
