import java.util.*;
import static java.lang.System.out;

public class MyStack{

    public static void main(String...a){
        Stack<String> stack = new Stack<>();
        stack.push("1");    stack.push("2");    stack.push("3");
        
        out.println("\ntoString, does not follow LIFO: " + stack.toString());
        
        out.println("\n\nUsing for loop, does not follow LIFO:");
        for(String value: stack){
            out.print(value + " ");
        }

        out.println("\n\nUsing Iterate, does not follow LIFO:");
        Iterator itr = stack.iterator();
        while(itr.hasNext()){
            out.print(itr.next() + " ");
        }

        out.println("\n\nUsing forEach, does not follow LIFO:");
        stack.forEach(s -> out.print(s + " "));

        out.println("\n\nUsing while and pop(), does follow LIFO:");
        while(!stack.empty()){
            out.print(stack.pop() + " ");
        }
    }
}