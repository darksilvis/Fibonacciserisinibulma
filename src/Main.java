import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç elemanlı Fibonacci serisi istiyorsunuz? :  ");
        int n = scanner.nextInt();

        ArrayList<Integer> fibSeries = fibonacci(n);

        for (int num : fibSeries) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> fibonacci(int n) {
        ArrayList<Integer> fibSeries = new ArrayList<>();
        if (n >= 1) fibSeries.add(1);
        if (n >= 2) fibSeries.add(1);

        for (int i = 2; i < n; i++) {
            int nextNum = fibSeries.get(i-1) + fibSeries.get(i-2);
            fibSeries.add(nextNum);
        }

        return fibSeries;
    }
}
