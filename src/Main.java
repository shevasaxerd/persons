//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Person oleg = new Person();
        oleg.setName("Oleg");
        oleg.setAge(23);
        oleg.setSex("male");
        oleg.setHeight(190);
        oleg.setNation(Person.Nation.Russian);
        System.out.println (oleg);
        Person andrey = new Person();
        System.out.println (andrey);
        Person roma = new Person("Roman", 23, "male", 184, Person.Nation.Belorussian);
        System.out.println (roma);
        Person vanya = new Person (roma, "Vanya");
        System.out.println (vanya);
        Person vova = new Person (andrey, "Andrey");
        System.out.println (vova);
        oleg.getOlder();
        oleg.getOlder();
        oleg.getOlder();
        System.out.println (oleg);
        Person zakhar = new Person("Zakhar", 2, "male", 194, Person.Nation.Indian);
        System.out.println(zakhar);
        zakhar.getYonger();
        zakhar.getYonger();
        zakhar.getYonger();
        zakhar.getYonger();
        zakhar.getYonger();
        System.out.println(zakhar);

        System.out.println("Andrey equals Vova? ----- " + andrey.equals(vova));
        System.out.println("Hash of Andrey: " + andrey.hashCode());
        System.out.println("Hash of Vova: " + vova.hashCode());
        System.out.println("Roman equals Vanya? ----- " + roma.equals(vanya));
        System.out.println("Hash of Roman: " + roma.hashCode());
        System.out.println("Hash of Vanya: " + vanya.hashCode());

        andrey.getMarried(zakhar);
        System.out.println(andrey);
        System.out.println(zakhar);
        oleg.bornChild("Masha", "female", 32);
        System.out.println(oleg);
        System.out.println(oleg.children);
        oleg.bornChild("Nastya", "female", 41);
        System.out.println(oleg);
        System.out.println(oleg.children);


    }
}
