package brzyk.tom.be.multipaneapp;

/**
 * Created by TomB on 27/02/2015.
 */
public class Person {
    private int age;
    private String person;

    public Person(int age, String person){
        this.age = age;
        this.person = person;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }
    public String toString(){
        return person;
    }
}
