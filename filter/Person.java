package filter;

import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private Gender gender;
    private MaritalStatus maritalStatus;

    public Person(String name, Gender gender, MaritalStatus maritalStatus) {
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
    
    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            return this.name.equals(person.getName());
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public String toString() {
        return String.format("Person {name: %s, gender: %s, maritalStatus: %s}\n", name, gender, maritalStatus);
    }
    
    
}
