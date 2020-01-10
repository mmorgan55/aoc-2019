import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URL;
import java.util.Scanner;

public class DayOne {

  public static void main(String[] args) throws FileNotFoundException {

    URL path = DayOne.class.getResource("day-1-input.txt");
    File file = new File(path.getFile());
    Scanner input = new Scanner(file);

    int total = 0;

    while (input.hasNextLine()) {
      total += calculateFuel(input.nextInt());
    }
    System.out.println(total);
  }

  private static int calculateFuel(int mass) {
    int total = 0;
    while ((mass / 3 - 2) > 0) {
      total += mass / 3 - 2;
      mass = mass / 3 - 2;
    }
    return total;
  }
}
