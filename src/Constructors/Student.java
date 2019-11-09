package Constructors;

public class Student {
    String name;
    String lastname;
    int Grade,age;
    String schoolname;
    public String getName(){
        return name;
    }
    public String getLastname(){
        return name;
    }
    public String getSchoolname(){
        return schoolname;
    }
    public int getAge(){
        return age;
    }
    public int getGrade(){
        return Grade;
    }
    public Student(String name,String lastname,String schoolname, int grade, int age){
        this.name=name;
        this.lastname=lastname;
        this.schoolname=schoolname;
        this.Grade=grade;
        this.age=age;
    }
    public void printStudentInfo(String name, String lastname, String schoolname, int grade, int age){
        System.out.println("Student name and lastname "+this.getName()+" "+this.lastname+" Age: "+this.getAge()+" Grade: "+this.getGrade()+" int the school name "+this.getSchoolname());
    }

    public static void main(String[] args) {
        Student ahmet=new Student("omer","","KOMPO",6,14);

    }


}
