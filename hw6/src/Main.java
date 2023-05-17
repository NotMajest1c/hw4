import java.io.FileNotFoundException;
public class Main {
    public static void main(String[] args) {
        try {
            throw new FileNotFoundException("File not found");
        } catch (FileNotFoundException e) {
            System.out.println("Caught checked exception:" + e.getMessage());
        }

        int[] nums = {1, 2};
        try {
            System.out.println(nums[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught unchecked exception:" + e.getMessage());
        }

        try {
            throw new CustomException("Custom exception occurred");
        } catch (CustomException e) {
            System.out.println("Caught custom exception:" + e.getMessage());
        }

    }
}
