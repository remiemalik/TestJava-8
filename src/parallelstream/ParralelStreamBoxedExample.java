package parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParralelStreamBoxedExample {

    public static int sequentialSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList
                .stream()
                .reduce(0, (x,y) -> x+ y);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration in Sequential stream: " + duration);
        return sum;
    }

    public static int parralelSum(List<Integer> integerList){
        long startTime = System.currentTimeMillis();
        int sum = integerList
                .stream()
                .parallel()
                .reduce(0, (x,y) -> x+ y);
        long duration = System.currentTimeMillis() - startTime;
        System.out.println("Duration in Parralel stream: " + duration);
        return sum;
    }


    public static void main(String[] args) {
        List<Integer> integerList = IntStream.rangeClosed(1, 10000)
                .boxed()
                .collect(Collectors.toList());

        System.out.println(sequentialSum(integerList));
        System.out.println(parralelSum(integerList));
    }
}
