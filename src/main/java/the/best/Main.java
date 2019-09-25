package the.best;

import the.best.symbols.*;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Sentence> sentences = getInput();
        List<SentenceMaxWordOccurence> sentenceMaxWordOccurences = convertToSentenceMaxWordOccurence(sentences);

        int maxWordOccurence = sentenceMaxWordOccurences
                            .stream()
                            .mapToInt(SentenceMaxWordOccurence::getMaxOccurrenceOfWord)
                            .max().getAsInt();

        int count = (int) sentenceMaxWordOccurences
                .stream()
                .filter((SentenceMaxWordOccurence sentence) -> sentence.getMaxOccurrenceOfWord() == maxWordOccurence)
                .count();
        System.out.println(count);
    }

    private static List<Sentence> getInput() {
        Scanner scanner = new Scanner(System.in);
        String pattern =  String.format("%s%s%s%s%s", new OpenBracket(),
                new Dot(),
                new ExclamationMark(),
                new QuestionMark(),
                new ClosedBracket());
        List<Sentence> res = new ArrayList<>();
        for (String sentenceStr : scanner.nextLine().split(pattern)){
            res.add(new Sentence(sentenceStr.trim()));
        }
        scanner.close();

        return res;
    }

    private static List<SentenceMaxWordOccurence> convertToSentenceMaxWordOccurence(List<Sentence> sentences){
        List<SentenceMaxWordOccurence> res = new ArrayList<>();
        for(Sentence sentence : sentences){
            res.add(new SentenceMaxWordOccurence(sentence.getToken(), sentence.getMaxOccurrenceOfWord()));
        }
        return res;
    }
}

