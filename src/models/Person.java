package models;

import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private String sex;
    private int height;
    private Nation personNation;
    private Person marriage;
    private ArrayList<Person> children = new ArrayList<>();



    public Person(){
        children = new ArrayList<>();
    };
   public Person(String nameOfPerson, int ageOfPerson, String sexOfPerson, int heightOfPerson, Nation nationOfPerson, Person marriageOfPerson, ArrayList<Person> childrenOfPerson){
        name = nameOfPerson;
        age = ageOfPerson;
        sex = sexOfPerson;
        height = heightOfPerson;
        personNation = nationOfPerson;
        marriage = marriageOfPerson;
        children = childrenOfPerson;
    }

    public Person(Person person){
        this.name = person.name;
        this.age = person.age;
        this.sex = person.sex;
        this.height = person.height;
        this.personNation = person.personNation;
        this.marriage = person.marriage;
        this.children = person.children;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSex(){
        return sex;
    }
    public void setSex(String sex){
        this.sex = sex;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public Nation getNation(){
        return personNation;
    }
    public void setNation(Nation personNation){
        this.personNation = personNation;
    }
    public Person getMarriage() {return marriage;}
    public void setMarriage(Person marriage) {this.marriage = marriage;}
    public ArrayList<Person> getChildren() {
        return children;
    }
    public void setChildren(ArrayList<Person> children) {
        this.children = children;
    }

    public void getYonger(){
        if (age >= 1) {
        age = age - 1;
        }
        else age = 0;
    }
    public void getOlder (){
        age = age + 1;
    }

    public void bornChild (String nameOfChild, String sexOfChild, int heightOfChild){
            Person child = new Person(nameOfChild, 0, sexOfChild, heightOfChild, this.personNation, null, null );
            this.children.addFirst(child);
    }

    public void getMarried(Person person){
        this.marriage = person;
        person.marriage = this; }


    public String toString(){
        if (marriage != null) {
        return "classes.Person: "
                + "Name - " + name + " ||| "
                + "Age - " + age + " ||| "
                + "Sex - " + sex + " ||| "
                + "Height - " + height + " ||| "
                + "classes.Nation - " + personNation + " ||| "
                + "Married with - " + marriage.name + " ||| "
                        + "Children's - " + children + ";";
    }
    else {
            return "classes.Person: "
                    + "Name - " + name + " ||| "
                    + "Age - " + age + " ||| "
                    + "Sex - " + sex + " ||| "
                    + "Height - " + height + " ||| "
                    + "classes.Nation - " + personNation + " ||| "
                    + "Not married ||| "
                    + "Children's - " + children + ";";
        }
    }
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person person = (Person) obj;
        if (age != person.age) return false;
        if (height != person.height) return false;
        if (name == null) {
            if (person.name != null)
                return false;
        } else if (!name.equals(person.name))
            return false;
        if (sex == null) {
            if (person.sex != null)
                return false;
        } else if (!sex.equals(person.sex))
            return false;
        if (personNation == null) {
            if (person.personNation != null)
                return false;
        } else if (!personNation.equals(person.personNation))
            return false;
        if (marriage == null) {
            if (person.marriage != null)
                return false;
        } else if (!marriage.equals(person.marriage))
            return false;


        return true;
    }
    public int hashCode(){
        int result = 1;
        int x = 31;
        result = x * result + age;
        result = x * result + ((name == null) ? 0 : name.hashCode());
        result = x * result + ((sex == null) ? 0 : sex.hashCode());
        result = x * result + height;
        result = x * result + ((personNation == null) ? 0 : personNation.hashCode());
        result = x * result + ((marriage == null) ? 0 : marriage.hashCode());
        return result;
    }


}
