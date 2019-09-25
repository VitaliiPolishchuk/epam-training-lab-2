package the.best;

import org.junit.Before;
import org.junit.Test;
import the.best.symbols.Symbol;

import static org.junit.Assert.*;

public class WordTest {
    Word instance;

    @Before
    public void setUp() throws Exception {
        instance = new Word("Thank");
    }

    @Test
    public void shouldReturnTrueWhenLinkIsSameMethodEquals() {
        assertTrue(instance.equals(instance));
    }

    @Test
    public void shouldReturnFalseWhenInputNullMethodEquals() {
        assertFalse(instance.equals(null));
    }

    @Test
    public void shouldReturnFalseWhenInputDifferentClassMethodEquals() {
        assertFalse(instance.equals(new Symbol("1")));
    }

    @Test
    public void shouldReturnFalseWhenHashCodeDifferentMethodEquals() {
        assertFalse(instance.equals(new Word("1")));
    }

    @Test
    public void shouldReturnTrueWhenValueIsSameMethodEquals() {
        assertTrue(instance.equals(new Word("Thank")));
    }
}