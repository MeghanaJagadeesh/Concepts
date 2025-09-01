package stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class IntermediateOperations {
    //Intermediate operations will take the elements from collections, Arrays and I/O channels. in there we can have a pipelined method to get the desired result
    // below are the intermediate operation methods


    // flatmap() - this will convert a list of collection into a single element
    // sort() - it will sort the collection in ascending order
    // sort(Comparator.reverseOrder()) - it will sort the collection in descending order
    // map() - map is used whenever we need to do some operation and map will take each element one by one
    // filter() - sort the list based on a condition or a predicator
    // distinct() will not accept the duplicate value

    public static void main(String[] args) {

//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer num) {
//                if (num > 2) {
//                    if (num % 2 == 0) {
//                        return true;
//                    }
//                }
//                return false;
//            }
//        };

        // the above code can be written as this using lamda expression
        Predicate<Integer> predicate =(num)-> { return num > 2 && num % 2 == 0; };

        //Predicator is also known as a condition, Predicate is a Interface it has abstract method called test()
        // whenever we have multile contion to be managed we can use of predicates
        List<Integer> nums = Arrays.asList(2, 5, 7, 9, 10, 23, 22, 65, 78);
        List<Integer> filter = nums.stream().filter(predicate).toList();
        System.out.println("filter = " + filter);

        List<Integer> list = Arrays.asList(1, 5, 2, 7, 9, 4);
        List<Integer> res = list.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * n)
                .sorted()
                .toList();

        System.out.println(res);

        // peek
        List<Integer> result = list.stream()
                .peek(n -> System.out.println("before = " + n))
                .map(n -> n * 2)
                .peek(n -> System.out.println("after = " + n))
                .toList();

        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1, 9, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8, 9)
        );
        nested.stream().flatMap(List::stream).sorted().distinct().forEach(System.out::println);


        List<Integer> list1 = list.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(list1);
//        list1.add(10); //modification is not possible with toList()

        List<Integer> list2 = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(list2);
        list2.add(10); //modification is possible in collect()
        System.out.println(list2);
    }


}
