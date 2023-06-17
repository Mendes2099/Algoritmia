package Ex1;

//Class
public class Ex1 {
    public static int findMinimum(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        return min;
    }
}