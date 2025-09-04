package stream_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TerminalOperation {

//    Terminal Operations : This operations will return resul. This operation are not process further
//    basically it use as end of stream

    public static void main(String[] args) {

//      collect() - It is used to return the result rom intermediate operations
//      forEach() - To iterate the each element  void forEach(Consumer<? super T> action)
//      reduce() - this method is used to reduce the all elements of the stream into a single value, it takes binary operator as parameter
//      count()- to obtain the count of streams
//       findfirst()-to obtain the first object in optional type
//       anymatch() - return true if any one satisfy the condition
//        allmatch() - return true if all the elements in stream satisfies the condition elese return false

        List<Integer> list = Arrays.asList(1, 2, 4, 6, 9, 3, 10, 14, 11, 19);

//      reduce()
        int sum = list.stream().reduce(0, (a, b) -> a + b);
        int max = list.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.println("sum=" + sum + "\nmax=" + max);

        List<String> wds = Arrays.asList("abc", "xyz", "mno", "pqr");
        String s = wds.stream().reduce("", (a, b) -> a + " " + b);
        System.out.println("wds=" + s);

        List<List<String>> words = Arrays.asList(
                Arrays.asList("meghana", "had", "food"),
                Arrays.asList("went", "to", "college"),
                Arrays.asList("and", "return", "home")
        );
        String w = words.stream().flatMap(List::stream).reduce("", (a, b) -> a + " " + b);
        System.out.println("nested list =" + w);
        int chars = words.stream().flatMap(List::stream).map(String::length).reduce(0, Integer::sum);
        System.out.println("chars=" + chars);

//      forEach()
        list.forEach(n -> System.out.print(n + " "));
        System.out.println();

//      collect()
        List<Integer> result = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println("result = " + result);

//      count()
        System.out.println("count fo nested = "+words.stream().count());
        System.out.println(words.stream().flatMap(List::stream).count());

//       findfirst()
        System.out.println(words.stream().flatMap(List::stream).findFirst().get());

//        anymatch()
        System.out.println(list.stream().anyMatch(ele->ele>10));

//        allmatch()
        System.out.println(list.stream().allMatch(ele->ele>=1));
    }
}
