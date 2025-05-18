import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();

        for (int i = 1; i <= a; i += 2) {
            System.out.print(i);
            if (i + 2 <= a) System.out.print(", ");
        }
    }
}
