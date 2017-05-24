import java.io.Serializable;

/**
 * Created by user on 5/12/17.
 */
public class Human implements Serializable{
    private String surname;
    private String name;
    private String secondName;
    private int age;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Human(String surname, String name, String  secondName, int age){
        this.surname=surname;
        this.name=name;
        this.secondName=secondName;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Human human = (Human) o;

        if (age != human.age) return false;
        if (surname != null ? !surname.equals(human.surname) : human.surname != null) return false;
        if (name != null ? !name.equals(human.name) : human.name != null) return false;
        return secondName != null ? secondName.equals(human.secondName) : human.secondName == null;

    }

    @Override
    public int hashCode() {
        int result = surname != null ? surname.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (secondName != null ? secondName.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
