import org.w3c.dom.Text;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main (String [] args){

        String[] wordsFromText = Text.Text.split("\\s+");
        Set<String> uniqueWordsFromText = new HashSet<>();
        for (String word:wordsFromText){
            uniqueWordsFromText.add(word.toLowerCase());
        }
        int uniqueWordCount = uniqueWordsFromText.size();
        System.out.println("the count of unique words is: " + uniqueWordCount);

        for (String word:uniqueWordsFromText){
            System.out.print(word + " ");
        }


        }



    }


