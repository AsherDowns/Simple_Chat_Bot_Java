import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        while (start <= end) {
            sum += start++;
        }
        System.out.println(sum);
    }
}