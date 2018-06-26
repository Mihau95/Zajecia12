import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class PersonTest {
    public static void main(String[] args) {
        Queue<Person> people = new LinkedList<>();
        people.offer(new Person("Jan", "Woj", 23490));
        people.offer((new Person("Adam", "Grzyb", 34567)));
        people.offer(new Person("Anna", "Kozak", 45234));
        people.offer(new Person("Elzbieta", "Winna", 12345));

        Iterator<Person> iterator = people.iterator();
        while (iterator.hasNext()) {
            Person next = iterator.next();
            System.out.println("Pacjent " + next.getFirstName() + " " + next.getLastName() + " " + next.getPesel() + " " +"do gabinetu");
            System.out.println("Pacjent " + next.getFirstName() + " " + next.getLastName() + " " + next.getPesel() + " " + "obsluzony");
        }
    }
}
