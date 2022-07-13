public class Student extends Person {

    public Student(String name, int age){

        super(name, age);
    }
    @Override
    public String getName(){        
       return super.getName() + " (Student)";

    }
    
    public String degree(){        
        return "Computer Science";

    }
}
