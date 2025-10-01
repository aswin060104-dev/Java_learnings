public class learn_interface{
    public static void main(String[] args){
        Student1 s1 = new Student1();
        System.out.println(s1.getStudentName());
        System.out.println( s1.getMarks());       
    }
}

interface Student{
    String getStudentName(); // public abstract
    int getMarks();
    int totalSubjects = 5; // public static final
}

class Student1 implements Student{
    String studentName = "Aswin";
    int totalMarks = 450;

    public String getStudentName(){
        return studentName;
    }

    public int getMarks(){
        return totalMarks;
    }
}