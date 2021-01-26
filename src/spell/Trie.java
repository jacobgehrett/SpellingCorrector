package spell;

import java.util.Locale;

public class Trie implements ITrie {
    private final INode root = new Node();
    private int wordCount = 0;
    private int nodeCount = 1;

    @Override
    public void add(String word) {
        INode wordNode = root;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); ++i) {
            int index = (word.charAt(i) - 'a');
            if (wordNode.getChildren()[index] == null) {
                wordNode.getChildren()[index] = new Node();
                ++nodeCount;
            }
            wordNode = wordNode.getChildren()[index];
        }
        wordNode.incrementValue();
        if (wordNode.getValue() == 1) {
            ++wordCount;
        }
    }

    @Override
    public INode find(String word) {
        int index = 0;

        INode wordNode = root;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); ++i) {
            index = (word.charAt(i) - 'a');
            if (wordNode.getChildren()[index] == null) {
                return null;
            }
            wordNode = wordNode.getChildren()[index];
        }
        if (wordNode.getValue() > 0) {
            return wordNode;
        }
        return null;
    }

    @Override
    public int getWordCount() {
        return wordCount;
    }

    @Override
    public int getNodeCount() {
        return nodeCount;
    }
}
