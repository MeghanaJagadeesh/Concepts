package stream_api;

import java.util.Arrays;
import java.util.List;

public class Example {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 4, 6, 1);

//    find sum      TC=o(n) as redce method iterate each element SC=O(1)
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        int sum1 = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum = " + sum + "\nsum1 = " + sum1);

//     find max     TC=o(n) as redce method comapre with each element SC=O(1)
        int max = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("max = " + max);

        List<Integer> nums = Arrays.asList(3, 5, 7, 2, 8, 5, 3, 7, 8);
//       sum of squares of unique numbers
//       TC=O(n) as we are storing unique number again SC=O(n)
        int sumsquare = nums.stream().distinct().map(n -> n * n).reduce(0, Integer::sum);
        System.out.println("sum and square = " + sumsquare);

//        concate
        List<String> words = Arrays.asList("Java", "Spring", "Boot");
        String s = words.stream().reduce("", (a, b) -> a + " " + b).trim();
        System.out.println("concate = " + s);
    }

}
