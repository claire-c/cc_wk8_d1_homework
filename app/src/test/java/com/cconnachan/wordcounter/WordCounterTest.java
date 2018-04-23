package com.cconnachan.wordcounter;

import org.junit.Before;
import org.junit.Test;
import com.cconnachan.wordcounter.WordCounter;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {

    private WordCounter wordCounter;

    @Before
    public void setup(){
        wordCounter = new WordCounter();
    }

    @Test
    public void canCountWords(){
        String string = "hello there how are you";
        assertEquals("5", wordCounter.count(string));
    }





}
