package the.best;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SentenceTest {
    @Test
    public void shouldReturn2MethodGetMaxOccurrenceOfWord() {
        Sentence specialInstance = new Sentence("a a b b");
        assertEquals(2, specialInstance.getMaxOccurrenceOfWord());

        specialInstance = new Sentence("a a b c");
        assertEquals(2, specialInstance.getMaxOccurrenceOfWord());

        specialInstance = new Sentence("c b b c");
        assertEquals(2, specialInstance.getMaxOccurrenceOfWord());

        specialInstance = new Sentence("b a b c");
        assertEquals(2, specialInstance.getMaxOccurrenceOfWord());

        specialInstance = new Sentence("a a");
        assertEquals(2, specialInstance.getMaxOccurrenceOfWord());
    }

    @Test
    public void shouldReturn0MethodGetMaxOccurrenceOfWord(){
        Sentence specialInstance = new Sentence("");
        assertEquals(0, specialInstance.getMaxOccurrenceOfWord());
    }
}