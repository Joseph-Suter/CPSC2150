package cpsc2150.MyDeque;
/**
 * @authors Gabe Collins and Joseph Suter
 *
 * @invariants 0 <= myLength <= MAX_LENGTH and MAX_LENGTH = 100
 *
 * Correspondence
 */
public class ArrayDeque implements IDeque {

    // where the data is stored. myQ[0] is the front of the deque
    private Character[] myQ;

    // tracks how many items are in the deque
    // also used to find the end of the deque
    private int myLength;
    // complete the class

    /**
     * @pre myQ must be instantiated
     *
     * @post myQ is initialized to a Character array and myLength is initialized to 0
     */
    public ArrayDeque(){
        myLength = 0;
        myQ = new Character[MAX_LENGTH];
    }

    /**
     * @param x = Character to be added to the queue
     *
     * @pre mylength < MAX_LENGTH
     *
     * @post myLength = #myLength + 1 and x = myQ[myLength]
     */

    public void enqueue(Character x){
        myQ[myLength] = x;
        myLength++;
    }

    public Character dequeue(){
        Character x = myQ[0];
        for(int i = 0; i < myLength; i++){
            myQ[i] = myQ[i+1];
            //System.out.print(myQ[i]);
        }
        myLength--;
        return x;
    }

    public void inject(Character x){
        for(int i = myLength - 1; i >= 0; i--){
            myQ[i+1] = myQ[i];
        }
        myQ[0] = x;
        myLength = myLength +1;
    }

    public Character removeLast(){
        Character temp = myQ[myLength - 1];
        myQ[myLength - 1] = null;
        myLength = myLength -1;
        return temp;
    }

    public int length(){
        return myLength;

    }

    public void clear(){
        for (int i = 0; i < myLength; i++){
            myQ[i] = null;
        }
        myLength = 0;
    }



}