package com.cconnachan.wordcounter;

public class WordCounter {

    public int count(String paragraphToCount){
        String[] arrayToCount = paragraphToCount.split(" ");
        return arrayToCount.length;
    }
}
