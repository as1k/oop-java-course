package task3;

public class Person {
    private Gender gender;

    public Gender getGender(){
        return gender;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public Person(Gender gender){
        this.gender = gender;
    }
    public Person(){
    }
    public String toString(){
        return gender.toString();
    }
}