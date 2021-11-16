package com.example.java8test.test7;

/**
 * @author：ly
 * @Data :20:29 2021/11/11
 **/
public class WordCounter {

    final int counter;
    final boolean lastword;

    public WordCounter(int counter,boolean lastword){
        this.counter = counter;
        this.lastword = lastword;
    }

    public WordCounter accumulate(Character c){
        if(Character.isSpaceChar(c)){
            return lastword ? this : new WordCounter(counter,true);
        }else{
            return lastword ? new WordCounter(counter+1,false): this;
        }

    }

    public WordCounter combin(WordCounter wordCounter){
        return new WordCounter(counter+ wordCounter.counter,wordCounter.lastword);
    }

    public int getCounter() {
        return counter;
    }

    public boolean isLastword() {
        return lastword;
    }
}
