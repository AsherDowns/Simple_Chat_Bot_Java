import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int step = scanner.nextInt();
        int count = 0;
        if (start <= end) {
            count = end / step - (start - 1) / step;
        }
        System.out.println(count);
    }
}