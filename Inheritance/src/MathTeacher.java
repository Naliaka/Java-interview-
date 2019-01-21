// child class // subclass // derived class

public class MathTeacher extends Teacher{
    int favouriteNumber;

    public MathTeacher(int numberOfStudents,
                       String school,int favouriteNumber){
        //calling the constructor of the super class
        //--> setting up the super class
       super(numberOfStudents,school);
       this.favoriteNumber = favoriteNumber;
    }
}
