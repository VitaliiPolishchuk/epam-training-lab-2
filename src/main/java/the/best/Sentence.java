package the.best;

import the.best.symbols.BackSlash;
import the.best.symbols.Plus;
import the.best.symbols.SmallS;

import java.util.HashMap;
import java.util.HashSet;

public class Sentence {
    private String token;

    public Sentence(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public int getMaxOccurrenceOfWord(){

        if(token.equals("")) {
            return 0;
        }

        String regex = String.format("%s%s%s", new BackSlash(), new SmallS(), new Plus());
        String[] wordsStr = token.split(regex);
        HashMap<Word, Integer> count = new HashMap<>();
        for(String wordStr : wordsStr){
            Word word = new Word(wordStr.toLowerCase());
            count.put(word, count.getOrDefault(word, 0) + 1);
        }
        int res = 0;
        for(Word key : count.keySet()){
            res = Math.max(res, count.get(key));
        }

        return res;
    }

    @Override
    public String toString() {
        return token;
    }
}
