import java.util.*;
import static java.lang.System.out;

public class MyArrayDeque{

    public static void main(String...a){
        Deque<String> deque = new ArrayDeque<>();
        deque.push("1");
        deque.push("2");
        deque.push("3");

        out.println("Output: " + deque.toString());

        out.println("POP: " + deque.pop());

        out.println("isEmpty: " + deque.isEmpty());

        out.println("Size: " + deque.size());

        out.println("Peek: " + deque.peek());

        out.println("Output: " + deque.toString());

        out.println("Using for\n");
        for(String val: deque){
            out.print(val + " ");
        }
        out.println("\nUsing forEach\n");
        deque.forEach(s-> out.print(s + " "));

        out.println("\nUsing iterator\n");
        Iterator iterator = deque.iterator();
        while(iterator.hasNext()){
            out.print(iterator.next() + " ");
        }

        // Actual Implementation Should be:
        out.println("\n Using while and iEmpty()\n");
        while(!deque.isEmpty()){
            out.print(deque.pop() + " ");
        }

        out.println("/nOutput: " + deque.toString());
    }

}