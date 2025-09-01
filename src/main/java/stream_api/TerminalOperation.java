package stream_api;

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

        List<Integer> list= Arrays.asList(1,2,4,6,9,3,10,14,11,19);

//      reduce()
        int sum=list.stream().reduce(0, (a,b)->a+b);
        System.out.println(sum);

//      forEach()
        list.forEach(n->System.out.print(n+" "));
        System.out.println();


//      collect()
        List<Integer> result=list.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println("result = "+result);
    }
}
