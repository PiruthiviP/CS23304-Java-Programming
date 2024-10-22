// 3. Write a class that implements the Iterator interface found in the java.util package. 
// The ordered data for this exercise is the thirteen cards in a suit from a deck of cards. 
// The first call to next returns 2, the subsequent call returns the next highest card, 3, 
// and so on, up to Ace.

import java.util.Iterator;

class CardIterator implements Iterator<Integer> {
    private int current = 2;
    private final int end = 14;

    public boolean hasNext() {
        return current <= end;
    }

    public Integer next() {
        return current++;
    }
}

public class pro3{
    public static void main(String[] args) {
        CardIterator cards = new CardIterator();
        while (cards.hasNext()) {
            System.out.println(cards.next());
        }
    }
}
