import java.util.Scanner;

public class Example2422 {
    public static void main(String[] argv) {
        int n, f;
        System.out.println("Enter a number:");
//Reading the value. Factorial
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        n = inputValue.nextInt();
        f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println(f);
    }
}
