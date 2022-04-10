import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number: ");
        int number = sc.nextInt();
        sc.close();
        String result = "";

        if (number % 5 == 0) result += "Fizz";

        if (number % 3 == 0) result += "Buzz";

        if (result.isBlank()) result += number;

        System.out.println(result);
    }
}
