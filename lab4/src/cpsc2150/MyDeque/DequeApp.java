package cpsc2150.MyDeque;
import java.util.Scanner;
/**
 * @author Gabriel Collins and Joseph Suter
 */
public class DequeApp {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        IDeque q;
        int pick = 0;

    /*
    Prompt  the  user  to  pick  an  implementation  using  the  following
    message:  "Enter  1  for  array  implementation  or  2  for  List
    implementation"

    Your code needs to make sure that they only enter either 1 or 2.
    Re-print the message to prompt the user to enter it again. Once
    you have gotten an answer, use it to initialize q appropriately.
    */
        //This outputs the ask of 1 or 2 and will keep doing so till valid input
        do {
            System.out.println("Enter 1 for array implementation or 2 for List implementation");
            pick = in.nextInt();
        }while(pick != 1 && pick != 2); //< should this be &&?

        if(pick == 1){
            q = new ArrayDeque();
        }
        else{
            q = new ListDeque();
        }

        Character x = 'a';
        q.enqueue(x);
        x = 'f';
        q.enqueue(x);
        x = 't';
        q.enqueue(x);
        x = '0';
        q.enqueue(x);
        x = '$';
        q.enqueue(x);

        /*
        Add  the  code  to  print  the  deque.  After  the  code  is  finished,
        the deque should still contain all its values in order
         */

        int length = q.length();
        for(int i =0; i < length; i++){
            char k = q.dequeue();
            System.out.print(k + " ");
        }
    }
}

