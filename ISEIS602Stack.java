package Foundation;
import java.util.*;

public interface ISEIS602Stack<T>
{
	
		   //  Adds the specified element to the top of the stack.
		   public void push (T element);

		   //  Removes and returns the top element from the stack.
		   public T pop() throws EmptyStackException;

		   //  Returns a reference to the top element of this stack
		   //  without removing it.
		   public T peek() throws EmptyStackException;

		   //  Returns true if the stack contains no elements and false
		   //  otherwise.
		   public boolean isEmpty();

		   //  Returns the number of elements in the stack.
		   public int size();

		}


