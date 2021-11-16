package com.example.java8test.test7;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author：ly
 * @Data :20:13 2021/11/11
 **/
public class MainTest3 {

    static final String test = " Nel mezzo del cammin di nostra vita ";

    public static int countWordsIteratively(String s){
        int counter = 0;
        boolean lastSpace = true;
        for(char c : s.toCharArray()){
            if(Character.isSpaceChar(c)){
                lastSpace = true;
            }else{
                if(lastSpace){
                    counter++;
                }
                lastSpace = false;
            }
        }
        return counter;
    }

    public static int counterSum(Stream<Character> stream){
        WordCounter wordCounter = stream.reduce(new WordCounter(0, true), new BiFunction<WordCounter, Character, WordCounter>() {
            @Override
            public WordCounter apply(WordCounter wordCounter, Character character) {
                if (Character.isSpaceChar(character)) {
                    return wordCounter.lastword ? wordCounter : new WordCounter(wordCounter.counter, true);
                } else {
                    return wordCounter.lastword ? new WordCounter(wordCounter.counter + 1, false) : wordCounter;
                }
            }
        }, new BinaryOperator<WordCounter>() {
            @Override
            public WordCounter apply(WordCounter wordCounter, WordCounter wordCounter2) {
                return new WordCounter(wordCounter.counter+wordCounter2.counter,wordCounter2.lastword);
            }
        });
        return wordCounter.getCounter();
    }

    public static void main(String[] args) {
        //System.out.println(countWordsIteratively(test));

        Stream<Character> characterStream = IntStream.range(0, test.length()).mapToObj(test::charAt);

        System.out.println(counterSum(characterStream));

    }
}
