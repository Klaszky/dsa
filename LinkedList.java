public class LinkedList<T>
{
	private Link<T> front;

	public LinkedList(Link<T> front)
	{
		this.front = front;
	}


	//Setter
	///////////////////////////////////

	public void setFront(Link<T> front)
	{
		this.front = front;
	}

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

	public void deleteFromFront()
	{
		this.front = this.getFront().getNextLink();
	}
}