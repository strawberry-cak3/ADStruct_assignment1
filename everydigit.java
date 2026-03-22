import java.util.Scanner;
import java.lang.Math;
public class everydigit {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("task1");
        System.out.println("Enter number: ");

        int num = myObj.nextInt();
        digits_of_number(num);

        System.out.println(" ");
        System.out.println("task2");
        System.out.println("Enter size of array: ");

        int size_of_arr = myObj.nextInt();
        int[] numbers = new int[size_of_arr];

        raskid(numbers, 0, size_of_arr, myObj);

        int totalSum = averageNum(numbers, 0);
        System.out.println("Average is " + (double)totalSum / size_of_arr);

        System.out.println(" ");
        System.out.println("task3"); // task 3 starts
        System.out.println("Enter number to check if prime:");
        int number_to_check = myObj.nextInt();
        int dum1 = 2;
        if (isPrime(number_to_check, dum1)) {
            System.out.println(number_to_check + " prime");
        }
        else {
            System.out.println(number_to_check + " composite");
        }

        System.out.println(" ");
        System.out.println("task4");

        int factorial_find = myObj.nextInt();
        System.out.println(factorial(factorial_find));

        System.out.println(" ");
        System.out.println("task5");

        int fib_num = myObj.nextInt();
        System.out.println(fibonacci(fib_num));

        System.out.println(" ");
        System.out.println("task6");

        System.out.println("enter number: ");
        int a = myObj.nextInt();
        System.out.println("enter power: ");
        int n = myObj.nextInt();

        System.out.println(power(a, n));

        System.out.println(" ");
        System.out.println("task7");

        if (myObj.hasNextInt()) {
            int numberr = myObj.nextInt();

            reversePrint(numberr, myObj);
        }

        System.out.println(" ");
        System.out.println("task8");

        String line = myObj.nextLine();
        if (isAllDigits(line)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(" ");
        System.out.println("task9");

        String line_to_check_length = myObj.nextLine();

        System.out.println(recursiveLength(line_to_check_length));

        System.out.println(" ");
        System.out.println("task9");
        int first_num = myObj.nextInt();
        int second_num = myObj.nextInt();

        System.out.println(findGCD(first_num, second_num));
    }
    static void digits_of_number(int n) {
        if (n >= 10) {
            digits_of_number(n / 10);
        }
        System.out.println(n % 10);
    }

    static void raskid(int[] arr, int index, int size, Scanner myObj) {
        if (index == size) {
            return;
        }
        arr[index] = myObj.nextInt();
        raskid(arr, index + 1, size, myObj);
    }

    static int averageNum(int[] arr,int index) {
        if (index == arr.length) {
            return 0;
        }
        return arr[index] + averageNum(arr, index + 1);
    }

    static boolean isPrime(int num, int dummy) {
        if (num < 1) return false;
        if (num <= 3) return true;

        if (dummy > Math.sqrt(num)) return true; // нет делителей
        if (num % dummy == 0) { // проверка делителя
            return false;
        }

        return isPrime(num, dummy + 1);
    }

    static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);

    }
    static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
    public static void reversePrint(int n, Scanner scanner) {
        if (n <= 0) {
            return;
        }

        int current = scanner.nextInt();
        reversePrint(n - 1, scanner);
        System.out.print(current + " ");
    }

    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return true;
        }

        char firstChar = s.charAt(0);
        if (!Character.isDigit(firstChar)) {
            return false;
        }
        return isAllDigits(s.substring(1));
    }
    public static int recursiveLength(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        return 1 + recursiveLength(s.substring(1));
    }
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return findGCD(b, a % b);
    }
}
