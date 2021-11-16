package com.example.java8test.test7;

import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author：ly
 * @Data :08:54 2021/11/10
 **/
public class MainTest {
    public static long sequentialSum(long l){
        return Stream.iterate(1L,i -> i +1)
                .limit(l)
                .reduce(0L,Long::sum);
    }

    public static long measureSumPerf(Function<Long, Long> adder ,long n){
        long fastest = Long.MAX_VALUE;
        for(int i = 0; i < 10; i++){
            long start = System.nanoTime();
            long sum = adder.apply(n);
            long duration = (System.nanoTime()-start)/1_000_000;
            System.out.println("Result:"+sum);
            if(duration < fastest){
                fastest = duration;
            }
        }
        return fastest;
    }
    public static void main(String[] args) {

        System.out.println("Sequential sum done in :"+measureSumPerf(
                MainTest::sequentialSum,1_000_000)+"msecs");

        System.out.println(measureSumPerf(new Function<Long, Long>() {
            @Override
            public Long apply(Long aLong) {
                return Stream.iterate(1L,i -> i +1)
                        .limit(aLong)
                        .reduce(0L,Long::sum);
            }
        },1_000_000));
    }
}
