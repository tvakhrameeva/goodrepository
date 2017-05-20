/**
 * Created by user on 5/20/17.
 */
public class Student extends Human {

    private String nameOfDepartment;

    public Student(String surname, String name, String secondName, int age, String nameOfDepartment) {
        super(surname, name, secondName, age);
        this.nameOfDepartment = nameOfDepartment;
    }

    public String getNameOfDepartment() {
        return nameOfDepartment;
    }

    public void setNameOfDepartment(String nameOfDepertment) {
        this.nameOfDepartment = nameOfDepertment;
    }

}
