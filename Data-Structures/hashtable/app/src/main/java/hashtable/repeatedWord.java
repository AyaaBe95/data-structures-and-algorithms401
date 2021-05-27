package hashtable;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class repeatedWord {
    public String repeatedWord (String stringToRead) throws UnsupportedEncodingException {
        Scanner readString = new Scanner(stringToRead);
        hashtable hashtable = new hashtable();

        while (readString.hasNext()){
            String word = readString.next().toLowerCase();
            if (hashtable.contains(word)){
                return word;
            } else {
                hashtable.add(word, null);
            }
        }
        return null;
    }
}
