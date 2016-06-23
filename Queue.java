public class Queue<T>
{
	public static void main(String[] args)
	{
		Queue<Integer> s = new Queue();
		s.push(42);
		System.out.println(s);
		s.push(53);
		System.out.println(s);
		s.push(5454);
		System.out.println(s);
		s.push(342);
		System.out.println(s);
		s.push(3542);
		System.out.println(s);
		s.push(2435);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.pop();
		System.out.println(s);




	}
	private LinkedList<T> linkedList;

	public Queue()
	{
		this.linkedList = new LinkedList();
	}

	public void push(T data)
	{
		this.linkedList.addToEnd(data);
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