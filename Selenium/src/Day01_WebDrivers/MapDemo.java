package Day01_WebDrivers;


import java.util.Scanner;

// Write your logic here



// Non editable starts here
public class MapDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MapOperations map = new HashMapImplementation();

        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            String key = scanner.next();
            int value = scanner.nextInt();
            map.insert(key, value);
        }

        String key = scanner.next();
        map.performOperations(key);

        key = scanner.next();
        map.delete(key);

        scanner.close();
    }
}
// Non editable ends here

