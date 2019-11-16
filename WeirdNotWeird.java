import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class WeirdNotWeird {

    private static final Scanner scanner = new Scanner(System.in);

    public static String answer(int n) {
        String s = "";
        if (n % 2 == 1) {
            s = "Weird";
        } else { // it's even
            if (n < 5) {
                s = "Not Weird";
            } else if (n <= 20) {
                s = "Weird";
            } else {
                s = "Not Weird";
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        String S = answer(N);
        System.out.println(S);
    }
}
