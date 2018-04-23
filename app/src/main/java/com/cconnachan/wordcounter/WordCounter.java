package com.cconnachan.wordcounter;

public class WordCounter {

    public String count(String paragraphToCount){
        String[] arrayToCount = paragraphToCount.split(" ");
        int num = arrayToCount.length;
        return Integer.toString(num);
    }
}
