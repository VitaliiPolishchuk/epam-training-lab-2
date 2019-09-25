package the.best;

import java.util.Objects;

public class Word {
    private String token;

    public Word(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass() || o.hashCode() != hashCode()) return false;
        Word word = (Word) o;
        return Objects.equals(token, word.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token);
    }

    @Override
    public String toString() {
        return token;
    }
}
