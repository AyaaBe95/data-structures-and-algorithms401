package hashtable;

import org.junit.Test;
import static org.junit.Assert.*;


import java.io.UnsupportedEncodingException;

public class RepeatedWordTest {
    @Test
    public void repeatedWord() throws UnsupportedEncodingException {
        repeatedWord testRepeatedWord = new repeatedWord();
        String testString = "It was the best of times, it was the worst of times, it was the age of wisdom, it " +
                "was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was " +
                "the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter " +
                "of despair, we had everything before us, we had nothing before us, we were all going direct to " +
                "Heaven, we were all going direct the other way – in short, the period was so far like the present " +
                "period, that some of its noisiest authorities insisted on its being received, for good or for evil, " +
                "in the superlative degree of comparison only...";
        assertEquals("First word to repeat should be it",
                "it",
                testRepeatedWord.repeatedWord(testString)
        );
    }

    @Test
    public void repeatedWord2() throws UnsupportedEncodingException {
        repeatedWord testRepeatedWord = new repeatedWord();
        String testString = "Once upon a time, there was a brave princess who...";
        assertEquals("First word to repeat should be a",
                "a",
                testRepeatedWord.repeatedWord(testString)
        );
    }

    @Test
    public void repeatedWord3() throws UnsupportedEncodingException {
        repeatedWord testRepeatedWord = new repeatedWord();
        String testString = "It was a queer, sultry summer , the summer they electrocuted the Rosenbergs, and I " +
                "didn’t know what I was doing in New York...";
        assertEquals("First word to repeat should be summer",
                "summer",
                testRepeatedWord.repeatedWord(testString)
        );
    }

    @Test
    public void repeatedWord4() throws UnsupportedEncodingException {
        repeatedWord testRepeatedWord = new repeatedWord();
        String testString = "test3";
        assertEquals("test",
                null,
                testRepeatedWord.repeatedWord(testString)
        );
    }
}
