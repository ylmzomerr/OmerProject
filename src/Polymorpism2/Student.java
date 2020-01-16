package Polymorpism2;

public class Student extends Person {


    private int studentNumber;

    public Student( String name , int studentNumber) {
        super( name );
        setStudentNumber( studentNumber );
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    public void info(){
        super.info();
        System.out.println(" Student number "+getStudentNumber());
    }

    public boolean equalsNumnber(Student otherStudent){
        return this.getStudentNumber()==otherStudent.getStudentNumber() && super.hasSameName( otherStudent );
    }
}
