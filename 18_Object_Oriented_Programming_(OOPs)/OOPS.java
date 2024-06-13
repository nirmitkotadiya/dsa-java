
class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    int getTip() {
        return this.tip;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

class Student {
    String name;
    int roll;
    String password;
    int marks[] = new int[3];

    Student() {
        System.out.println("student Constructor is called");

    }

    // shallow copy constructor
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // deep copy constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }

}

// class BankAcoount {
// public String username;
// private String password;

// public void setPassword(String pwd) {
// password = pwd;
// }
// }

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats anything");
    }

    void breathe() {
        System.out.println("brreathes");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
// Derived class
// class Fish extends Animal {
// int fins;

// void swim() {
// System.out.println("swim in water");
// }
// }

class Mammals extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammals {
    String breed;
}

class Fish extends Animal {
    void swim() {
        System.out.println("swim");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Pen p1 = new Pen(); // created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());

        // BankAcoount myAcc = new BankAcoount();
        // myAcc.username = "nirmitkotadiya";
        // myAcc.setPassword("abcd");

        // Student s1 = new Student();
        // Student s2 = new Student("Nirmit");
        // System.out.println(s2.name);
        // Student s3 = new Student(45);
        // System.out.println(s3.roll);

        // Student s1 = new Student();
        // s1.name = "Nirmit";
        // s1.roll = 456;
        // s1.password = "abcd";

        // s1.marks[0] = 100;
        // s1.marks[1] = 90;
        // s1.marks[2] = 80;

        // Student s2 = new Student(s1);
        // s2.password = "xyz";
        // s1.marks[2] = 100;
        // for (int i = 0; i < 3; i++) {
        // System.out.println(s2.marks[i]);
        // }

        // Destructor

        // Inheritance
        // Single Inheritance
        // Fish shark = new Fish();
        // shark.eat();
        // shark.breathe();
        // shark.swim();

        // Multi Level Inheritance
        // Dog d = new Dog();
        // d.eat();
        // d.legs = 4;
        // System.out.println(d.legs);

        // Hierarchical Inheritance

        // Hybrid Inheritance

        // Polymorphism
        // Method Overloading
        // Calculator calc = new Calculator();
        // System.out.println(calc.sum(1, 2));
        // System.out.println(calc.sum(1.5f, 2.5f));
        // System.out.println(calc.sum(1, 2, 3));

        // Method Overriding
        Deer d = new Deer();
        d.eat();
    }
}