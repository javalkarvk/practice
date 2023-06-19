package array;

import java.util.Arrays;

public class ArrayExecute {
    
    SingleDimentionalArrayOperations sdao = new SingleDimentionalArrayOperations();

    public void executeOneDArray() {
        System.out.println("1-D Array...");
        int[] inputArray = new int[] { 0, 8, 4, 9, 6 };
        sdao.reverseIntegerArray(inputArray);
        // Arrays.stream(inputArray).sorted().forEach(i->System.out.print(i+"\t"));
        Arrays.stream(inputArray).dropWhile(i->i%2==0).forEach(System.out::println);
    }
}
