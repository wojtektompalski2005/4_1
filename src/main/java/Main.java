import java.io.IOException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      Scanner scanner = new Scanner(System.in);

      while (true) {
        System.out.println("\nWybierz opcję:");
        System.out.println("1 - Dodaj nowego studenta");
        System.out.println("2 - Wypisz wszystkich studentów");
        System.out.println("0 - Wyjdź");

        int option = scanner.nextInt();
        scanner.nextLine(); // czyszczenie bufora po liczbie

        switch (option) {
          case 1:
            System.out.println("Podaj imię:");
            String name = scanner.nextLine();
            System.out.println("Podaj wiek:");
            int age = scanner.nextInt();
            System.out.println("Podaj numer indeksu:");
            int indexNumber = scanner.nextInt();
            scanner.nextLine();

            s.addStudent(new Student(name, age, indexNumber));
            break;
          case 2:
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
            break;
          case 0:
            System.out.println("Koniec programu.");
            return;
          default:
            System.out.println("Nieznana opcja.");
        }
      }
    } catch (IOException e) {

    }
  }
}