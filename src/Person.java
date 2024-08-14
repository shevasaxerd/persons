import java.util.ArrayList;

class Person{
    private String name;
    private int age;
    private String sex;
    private int height;
    private Nation personNation;
    private Person marriage;
    ArrayList<Person> children = new ArrayList<>();
    enum Nation{
        Russian,
        Belorussian,
        Indian
    }

    Person(){
        name = "Andrey";
        age = 54;
        sex = "female";
        height = 138;
        personNation = Nation.Indian;
    };
    Person(String n, int a, String s, int h, Nation nation){
        name = n;
        age = a;
        sex = s;
        height = h;
        personNation = nation;
    }

    public Person(Person person, String name){
        this.name = name;
        this.age = person.age;
        this.sex = person.sex;
        this.height = person.height;
        this.personNation = person.personNation;
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

    public void getYonger(){
        if (age >= 1) {
        age = age - 1;
        }
        else age = 0;
    }
    public void getOlder (){
        age = age + 1;
    }

    public void bornChild (String n, String s, int h){
            Person child = new Person(n, 0, s, h, this.personNation);
            this.children.addFirst(child);
    }

    public void getMarried(Person person){
        this.marriage = person;
        person.marriage = this; }


    public String toString(){
        if (marriage != null) {
        return "Person: "
                + "Name - " + name + " ||| "
                + "Age - " + age + " ||| "
                + "Sex - " + sex + " ||| "
                + "Height - " + height + " ||| "
                + "Nation - " + personNation + " ||| "
                + "Married with - " + marriage.name + " ||| "
                        + "Children's - " + children + ";";
    }
    else {
            return "Person: "
                    + "Name - " + name + " ||| "
                    + "Age - " + age + " ||| "
                    + "Sex - " + sex + " ||| "
                    + "Height - " + height + " ||| "
                    + "Nation - " + personNation + " ||| "
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
