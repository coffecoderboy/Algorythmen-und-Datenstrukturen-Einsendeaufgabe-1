public class WordList {
    private String[] germanWords;
    private String[] englishWords;
    private String[] frenchWords;

    public WordList(String[] germanWords, String[] englishWords, String[] frenchWords) {
        this.germanWords = germanWords;
        this.englishWords = englishWords;
        this.frenchWords = frenchWords;
    }

    // Methoden für binäre Suche, Sortierung usw.
    public int binarySearch(String[] words, String target) {
    int low = 0;
    int high = words.length - 1;
    while (low <= high) {
        int mid = low + (high - low) / 2;
        int result = target.compareTo(words[mid]);
        if (result == 0)
            return mid;
        if (result > 0)
            low = mid + 1;
        else
            high = mid - 1;
    }
    return -1;
}
}

