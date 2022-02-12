package cpsc2150.MyDeque;
/**
 * * @author Gabriel Collins and Joseph Suter
 *
 * A deque containing characters.
 * A deque is a data structure a double-ended queue that allows you
 * to insert and remove from both ends.
 * This deque is bounded by MAX_LENGTH
 *
 * Initialization ensures:
 *      Ensures construction of an empty deque
 *
 * Constraints: 0 < |deque| <= MAX_LENGTH
 */
public interface IDeque {
    public static final int MAX_LENGTH = 100;

    /**
     * @param x = Character to be added to the
     * @pre |deque| < MAX_LENGTH
     * @post deque = #deque o 'x'
     */
    // Adds x to the end of the deque
    public void enqueue(Character x);

    /**
     * @pre |deque| > 0
     * @post #deque = dequeue() o deque
     */
    // removes and returns the character at the front of the deque
    public Character dequeue();

    /**
     * @param x = Character to be added
     * @pre |deque| < MAX_LENGTH
     * @post deque = x o #deque
     */
    // Adds x to the front of the deque
    public void inject(Character x);

    /**
     * @pre |deque| > 0
     * @post #deque = deque o dequeue()
     */
    //removes and returns the character at the end of the deque
    public Character removeLast();

    /**
     * @return |self|
     * @post length() = |self| and self = #self
     */
    //returns the number of characters in the deque
    public int length();

    /**
     * @post |self| = 0
     */
    //clears the entire deque
    public void clear();
}

