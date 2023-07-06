package practice.amigos;

import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonValue;

public class Character implements Comparable<Character>{
    private String name;
    private int age;
    private Gender gender;

    public Character() {
    }

    public Character(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    @JsonValue
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    /**
     *  This generates id which is different for two different objects and same for two same objects
     */
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /*@Override
    public boolean equals(Object obj) {

        Character other = (Character) obj;

        if(this == other)
            return true;
        if(obj == null)
            return false;

        if(getClass() != obj.getClass())
            return false;

        if(!this.getName().equals(other.getName()))
            return false;
        if(this.getAge() != other.getAge())
            return false;
        if(!this.getGender().equals(other.getGender()))
            return false;

        return true;
    }*/

    /**
     * This checks if two objects are same or not
     */
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Character o) {
        return Integer.compare(this.getAge(), o.getAge());
    }
}
