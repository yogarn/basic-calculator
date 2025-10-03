import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner input = new Scanner(System.in);
        int nilai1 = input.nextInt();
        int nilai2 = input.nextInt();
        String operator = input.next();

        double hasil = 0.0;

        if (operator.equals("+")) {
            hasil = nilai1 + nilai2;
        }

        System.out.println(hasil);
        input.close();
    }
}
