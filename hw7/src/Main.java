import java.util.Scanner;

public class Main {
    public static <T> void printArray(T[] inputArray) {
        for (T element : inputArray) {
            System.out.println(element);
        }
    }

    public static <T> String intToString(T n) {
        String s = String.valueOf(n);
        return s;
    }


    public static void main(String[] args) {
        Integer arr[] = {1,2,3};
        String arr2[] = {"Hello","World"};
        printArray(arr);
        printArray(arr2);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=100 && n>=-100) {
            String s = intToString(n);
            System.out.println("Good job");
        }
        else{
            System.out.println("Wrong Answer");
        }
    }

}