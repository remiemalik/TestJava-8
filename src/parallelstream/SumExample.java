package parallelstream;

import java.util.stream.IntStream;

public class SumExample {

    public static void main(String[] args) {
        Sum sum = new Sum();

        IntStream.rangeClosed(1, 1000)
                .parallel()
                .forEach(sum::sum);

        System.out.println(sum.getTotal());
    }
}

class Sum{
    int total;

    public synchronized  void sum(int input){
        total += input;
    }
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
