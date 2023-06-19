package array;

public class SingleDimentionalArrayOperations {
    public void reverseIntegerArray(int[] input) {
        reverseIntegerArray(input, 0, input.length - 1);
    }

    public void reverseIntegerArray(int[] input, int start, int end) {
        if (start >= end)
            return;
        int temp = input[start];
        input[start] = input[end];
        input[end] = temp;
        reverseIntegerArray(input, start + 1, end - 1);
    }

    public void arrayRotation() {
        
    }
}
