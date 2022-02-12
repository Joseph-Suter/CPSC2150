
package cpsc2150.MyDeque;
/**
 * @author Gabriel Collins and Joseph Suter
 */
import java.util.*;
public class ListDeque implements IDeque {
    // this time store the deque in a list
    // myQ.get(0) is the front of the deque
    private List<Character> myQ;

    // complete the class
    public ListDeque(){
        myQ = new ArrayList<Character>();
    }

    public void enqueue(Character x){
        myQ.add(x);

    }

    public Character dequeue(){
        Character frntChar = myQ.get(0);
        myQ.remove(0);
        return frntChar;
    }

    public void inject(Character x){
        myQ.add(0,x);
    }
    public Character removeLast(){
        Character lastChar = myQ.get(myQ.size() - 1);
        myQ.remove(myQ.size() -1);
        return lastChar;
    }

    public int length(){
        return myQ.size();
    }

    public void clear(){
        for (int i = 0; i < myQ.size(); i++){
            myQ.remove(i);
            i--;
        }
    }



}