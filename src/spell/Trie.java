package spell;

public class Trie implements ITrie {
    private final Node root = new Node();
    private Node wordNode = root;
    private static int wordCount;
    private static int nodeCount;

    @Override
    public void add(String word) {
        word.toLowerCase();

    }

    @Override
    public INode find(String word) {
        return wordNode;
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
