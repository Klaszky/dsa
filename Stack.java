public class Stack<T>
{
	private LinkedList<T> linkedList;

	//Constructor
	///////////////////////////////////////////
	public Stack()
	{
		this.linkedList = new LinkedList<T>();
	}

	//O(1)
	public void push(T data)
	{
		this.linkedList.addToFront(data);
	}

	//O(1)
	public T pop()
	{
		return this.linkedList.popFront();
	}

	//O(1)
	public T peek()
	{
		return this.linkedList.peekFront();
	}

	//O(1)
	public String toString()
	{
		return this.peek() + "";
	}

	//O(1)
	public boolean isEmpty()
	{
		if(this.linkedList.getFront() == null)
		{
			return true;
		}

		return false;
	}
}
