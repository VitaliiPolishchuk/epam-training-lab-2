package the.best;

public class SentenceMaxWordOccurence extends Sentence {

    private int maxWordOccurance;

    public SentenceMaxWordOccurence(String token, int maxWordOccurance) {
        super(token);
        this.maxWordOccurance = maxWordOccurance;
    }

    @Override
    public int getMaxOccurrenceOfWord() {
        return maxWordOccurance;
    }


}
