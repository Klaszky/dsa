public class Queue<T>
{
	private LinkedList<T> linkedList;
	private Link<T> tail;

	//Constructor
	///////////////////////////////////////////
	public Queue()
	{
		this.linkedList = new LinkedList();
	}

	//O(1)
	public void push(T data)
	{
		if(this.linkedList.getFront() == null)
		{
			this.linkedList.addToEnd(data);
			this.tail = this.linkedList.findTail();
			return;
		}

		this.linkedList.addToEnd(data, tail);
		this.tail = tail.getNextLink();
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
	public boolean isEmpty()
	{
		if(this.linkedList.getFront() == null)
		{
			return true;
		}

		return false;
	}

	//O(1)
	public String toString()
	{
		return this.peek() + "";
	}
}