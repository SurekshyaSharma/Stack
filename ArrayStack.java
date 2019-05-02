package Foundation;
import java.util.*;

public class ArrayStack<T> implements ISEIS602Stack<T>
{
	private final int DEFAULT_CAPACITY=1;
	private T[] stack;
	public int position=0;
	private int growth;
	int j;
	
	public ArrayStack()
	{
		//count=0;
		stack =(T[]) (new Object[DEFAULT_CAPACITY]);
	}

	public void push(T element)
	{
		if(position== stack.length) 
		{
			expandCapacity();
		}
		
		stack[position]= element;
		position = position + 1; 
		//System.out.println((position-1)+":"+stack[position-1]);
		
	}
	
	private void expandCapacity()
	{
		int N= stack.length;
		//T[] stack1= new T[2*N];
		T[] stack1 =(T[]) (new Object [N*2]);
		for(int i=0; i<=N-1; i++)
		{
			stack1[i]=stack[i];
		}
		stack = stack1;
		growth++;
		//T[] larger =(T[]) (new Object [stack.length *2]);
		//for (int index=0; index< stack.length;index++)
			//larger[index]= stack[index];
		//stack= larger;
	}
	
	public T pop() throws EmptyStackException
	{
		if(position==0) {
			throw new EmptyStackException();
		}
		T x = stack[position-1];
		stack[position-1] = null;
		position--;
		return x;
		//int x=obj;
		//stack[obj]=null;
		//return x;
	}
	
	public T peek() throws EmptyStackException
	{
		if(position==0) {
			throw new EmptyStackException();
		}
		return stack[position-1];
	}
	
	public boolean isEmpty()
	{
		return (position == 0);
	}
	
	public int size()
	{
		return (position);
	}
	 
	public String toString()
	{
		 String result="<top of stack>\n";
		 for (j=position-1; j>=0; j--)
		 {
			 result += stack[j] + " | ";
		 }
		 return result + "\n<bottom of stack>";
	 }
	
	public int getGrowth()
	{
		return growth;
	}
}
