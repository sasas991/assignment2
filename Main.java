import java.util.ArrayList;
import java.util.Collections;

public class Main{
    public static void main(String[] args)
    {
        Employee emp1=new Employee("john", "lennon", "manager", 27045.78);
        Employee emp2=new Employee("george", "garrison", "developer", 50000.00);
        Student std1=new Student("ringo", "starr", 2.5);
        Student std2=new Student("paul", "mccartney", 3.8);
        Student std3=new Student("johnson", "james", 2.0);
        
        ArrayList<Person> people=new ArrayList<>();
        people.add(emp1);
        people.add(emp2);
        people.add(std1);
        people.add(std2);
        people.add(std3);
        Collections.sort(people);

        printData(people);
    }
    
    public static void printData(Iterable<Person> people)
    {
        for (Person person : people)
        {
            System.out.printf("%s earns %.2f tenge%n", 
                person.toString(), 
                person.getPaymentAmount());
        }
    }
}
