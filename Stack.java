public class Stack<T>
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack();
		s.push(42);
		System.out.println(s);
		s.push(53);
		System.out.println(s);
		s.pop();
		System.out.println(s);

	}
	private LinkedList<T> linkedList;

	public Stack()
	{
		this.linkedList = new LinkedList<T>();
	}

	public void push(T data)
	{
		this.linkedList.addToFront(data);
	}

	public T pop()
	{
		return this.linkedList.popFront();
	}

	public T peek()
	{
		return this.linkedList.peekFront();
	}

	public String toString()
	{
		return this.peek() + "";
	}
}
