
class Student {
    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
        System.out.println("Default constructo");
    }


    Student(String n, int a) {
        name = n;
        age = a;
        System.out.println("Parameterize constructor");
    }

   
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


public class prog11 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
        Student s2 = new Student("Gautam", 21);
        s2.display();
    }
}