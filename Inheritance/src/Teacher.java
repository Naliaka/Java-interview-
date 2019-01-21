
// parent class // super class// base class


public class Teacher {
    int numberOfStudents;
    String school;

    public Teacher (int numberOfStudents,String){
        this.numberOfStudents = numberOfStudents;
        this.school=school;
    }
    public String getRole(){
        return "This teacher teaches at " +
                this.school + "and has " +
                this.numberOfStudents + " students.";
    }


}
