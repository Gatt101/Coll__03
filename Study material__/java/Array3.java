import java.util.*;

public class Array3 {
    public static void main(String args[]) {
        
        Person[] people = new Person[5];

        people[0] = new Person("12434434343", "GPWQR32355", 55, "Tom", 10000);
        people[1] = new Person("987654343434", "Z13214FDD", 50, "Jerry", 110000);
        people[2] = new Person("434443111434", "M443323FSFS", 18, "Oggy", 500);
        people[3] = new Person("78901234566", "431434131FF", 80, "Jack", 42200);
        people[4] = new Person("234567890123", "FGHJJ4414", 30, "Mr.Bean", 330000);
     
        System.out.println("Person Details 1 :");
        people[0].display();
        System.out.println("Person Details 2 : ");
        people[1].display();
        System.out.println("Person Details 3 : ");
        people[2].display();
        System.out.println("Person Details 4 : ");
        people[3].display();
        System.out.println("Person Details 5 : ");
        people[4].display();
    }
}

class Person {
    String aadharCard;
    String panCard;
    int age;
    String name;
    double salary;

    Person(String aadhar, String pan, int personAge, String personName, double personSalary) {
        aadharCard = aadhar;
        panCard = pan;
        age = personAge;
        name = personName;
        salary = personSalary;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Aadhar Card: " + aadharCard);
        System.out.println("PAN Card: " + panCard);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}
