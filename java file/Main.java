import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first date (dd/mm/yyyy): ");
        String firstDateString = scanner.nextLine();
        System.out.print("Enter the second date (dd/mm/yyyy): ");
        String secondDateString = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate firstDate = LocalDate.parse(firstDateString, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateString, formatter);

  
        long daysDifference = ChronoUnit.DAYS.between(firstDate, secondDate);
        if (daysDifference < 0) {
            System.out.println("Invalid input: second date is before the first date");
        } else {
            System.out.println("Difference between dates: " + daysDifference);
        }

        // close scanner object
        scanner.close();
    }
}
