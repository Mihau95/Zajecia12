import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class NUmbers {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("RandomNumbers");
        Scanner scanner = new Scanner(file);
        TreeSet <Integer> numbers = new TreeSet<>();

        int x = 0;
        while (scanner.hasNextInt()){
            int element = scanner.nextInt();
            numbers.add(element);
            x++;
        }
        System.out.println("Liczba plikow: " + x);
        System.out.println("Unikalne liczby: " + numbers.size());
        System.out.println("Najmniejsza: " + numbers.first());
        System.out.println("Najwieksza: " + numbers.last());

    }
}
