import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tester {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        House house = new House();
        String[] arrayStrings = new String[3];

        System.out.println("Write the resident names separeted by a comma. ");
        String prov=reader.readLine();
        String [] myArray = prov.split(",", 3);
        house.setResidentNames(myArray);




        String print = String.format("%s,%s,%s", house.getResidentNames(0), house.getResidentNames(1), house.getResidentNames(2));
        System.out.print(print);

    }
}
