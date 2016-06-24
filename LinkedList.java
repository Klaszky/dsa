public class LinkedList<T>
{
	private Link<T> front;

	//Constructor
	///////////////////////////////////////////

	public LinkedList(Link<T> front)
	{
		this.front = front;
	}

	//Empty Constructor
	///////////////////////////////////////////

	public LinkedList()
	{
		this.front = null;
	}

	//Getter
	//////////////////////////////////////////

	//O(1)
	public Link<T> getFront()
	{
		return this.front;
	}

	//Add Methods
	//////////////////////////////////////////

	//O(1)
	public void addToFront(T data)
	{
		this.front = new Link<T>(data, this.getFront()); 
	}

	//O(n)
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

	//O(1)
	public void addToEnd(T data, Link<T> tail)
	{
		tail.setNextLink(new Link<T>(data, null));
	}


	//Delete Methods
	//////////////////////////////////////////////

	//O(1)
	public void deleteFromFront()
	{
		this.front = this.getFront().getNextLink();
	}

	//O(n)
	public void deleteTarget(T data)
	{
		if(this.front.getData().equals(data))
		{
			this.front = this.front.getNextLink();
			return;
		}
		for(Link<T> ptr = this.front; ptr != null; ptr = ptr.getNextLink())
		{
			if(ptr.getNextLink().getData().equals(data))
			{
				ptr.setNextLink(ptr.getNextLink().getNextLink());
				return;
			}
		}
	}

	//Stack and Queue methods
	////////////////////////////////////////

	//O(1)
	public T peekFront()
	{
		if(this.front != null)
			return this.front.getData();
		else
			return null;
	}

	//O(1)
	public T popFront()
	{
		if(this.front == null)
		{
			return null;
		}

		T toReturn = this.front.getData();
		this.deleteFromFront();
		return toReturn;
	}

	//O(n)
	public Link<T> findTail()
	{
		for(Link<T> ptr = this.front; ptr != null; ptr = ptr.getNextLink())
		{
			if(ptr.getNextLink() == null)
			{
				return ptr;
			}
		}

		return null;
	}

	//Others
	///////////////////////////////////////

	//O(n)
	public String toString()
	{
		String toReturn = "";
		for(Link<T> ptr = this.front; ptr != null; ptr = ptr.getNextLink())
		{
			toReturn += ptr.getData() + " ";	
		}

		return toReturn;
	}

	// O(n)
	// public String revToString(Link<T> front)
	// {
	// 	if(front == null)
	// 	{
	// 		return "";
	// 	}

	// 	return revToString(front.getNextLink()) + " " + front.getData();
	// }
}