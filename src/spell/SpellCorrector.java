package spell;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

// Create all ED=1 words and check if any of them are valid suggestions (in dictionary)
//        ArrayList<String> editDistanceOne = editDistanceWords(inputWord);
//        List<String> validSuggestions = filterTypos(editDistanceOne);

public class SpellCorrector implements ISpellCorrector {

    private Trie trie = new Trie();

    @Override
    public void useDictionary(String dictionaryFileName) throws IOException {
        try {
            //System.out.println(dictionaryFileName);
            File file = new File(dictionaryFileName);

            Scanner dict = new Scanner(file);

            while (dict.hasNextLine()) {
                String line = dict.nextLine();
                System.out.println(line);
            }
            dict.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public String suggestSimilarWord(String inputWord) {
        return null;
    }
}
