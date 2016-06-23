public class LinkedList<T>
{
	public static void main(String[] args)
	{
		LinkedList<Integer> ll = new LinkedList<>();

		ll.addToFront(23);
		ll.addToFront(55);
		ll.addToEnd(42);
		ll.deleteFromFront();

		System.out.println(ll);
	}
	private Link<T> front;

	public LinkedList(Link<T> front)
	{
		this.front = front;
	}

	public LinkedList()
	{
		this.front = null;
	}


	//Setter
	///////////////////////////////////

	// public void setFront(Link<T> front)
	// {
	// 	this.front = front;
	// }

	//Getter
	///////////////////////////////////

	public Link<T> getFront()
	{
		return this.front;
	}

	//Other methods
	///////////////////////////////////

	public void addToFront(T data)
	{
		this.front = new Link<T>(data, this.getFront()); 
	}

	public void addToEnd(T data)
	{
		if(this.front == null)
		{
			this.front = new Link<T>(data, null);
		}
		else
		{
			for(Link<T> ptr = this.front; ptr != null; ptr = ptr.getNextLink())
			{
				if(ptr.getNextLink() == null)
				{
					ptr.setNextLink(new Link<T>(data, null));
					return;
				}
			}
		}
	}

	public void deleteFromFront()
	{
		this.front = this.getFront().getNextLink();
	}

	public T peekFront()
	{
		if(this.front != null)
			return this.front.getData();
		else
			return null;
	}

	public T popFront()
	{
		T toReturn = this.front.getData();
		this.deleteFromFront();
		return toReturn;
	}

	public String toString()
	{
		String toReturn = "";
		for(Link<T> ptr = this.front; ptr != null; ptr = ptr.getNextLink())
		{
			toReturn += ptr.getData() + " ";	
		}

		return toReturn;
	}
}