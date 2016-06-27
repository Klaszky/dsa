public class C_LinkedList<T>
{

	public static void main(String[] args)
	{
		C_LinkedList<Integer> cl = new C_LinkedList<>();
		cl.addToTail(1);
		cl.addToFront(42);
		cl.addToFront(534);
		cl.addToFront(356);
		cl.addToFront(234);
		cl.addToFront(2);
		cl.addToFront(54334);
		cl.addToTail(45);
		cl.addToTail(23);
		cl.trav();
	}
	private Link<T> tail ;

	//Constructor
	///////////////////////////////////////////

	public C_LinkedList(Link<T> tail)
	{
		this.tail = tail;
	}

	//Empty Constructor
	///////////////////////////////////////////

	public C_LinkedList()
	{
		this.tail = null;
	}

	public void addToFront(T data)
	{
		if(this.tail == null)
		{
			tail = new Link(data, null);
			tail.setNextLink(tail);
		}
		else
		{
			tail.setNextLink(new Link(data, tail.getNextLink()));
		}
	}

	public void addToTail(T data)
	{
		if(this.tail == null)
		{
			tail = new Link(data, null);
			tail.setNextLink(tail);
		}
		else
		{
			tail.setNextLink(new Link(data, tail.getNextLink()));
			tail = tail.getNextLink();
		}
	}

	public void trav()
	{
		if(tail == null)
		{
			return;
		}

		Link<T> front = this.tail.getNextLink();
		String toReturn = "";
		if(front == tail)
		{
			System.out.println(front.getData());
			return;
		}
		while(front != tail)
		{	
			System.out.println(front.getData());
			front = front.getNextLink();
		}

		System.out.println(front.getData());
		return;
	}


}