//Constructor Example.
class Student {
    String name;
    int age;
    int id;

    //Parameterized Constructor.
    Student (String name , int age){
        this.name=name;
        this.age=age;
    }

    //Copy Constructor. Added extra parameter.
    Student(Student other , int id){
        this.name=other.name;
        this.age=other.age;
        this.id=id;
    }

    //Display Method
    void display (){
        System.out.println(name+" "+age+" "+id);
    }
}

//Main Function
public class Main
{
    public static void main(String[] args) {
     Student s1 = new Student("Iftakhar", 23);
        Student s2 = new Student(s1,242);
        s1.display();
        s2.display();
    }
}
