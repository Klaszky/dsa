public class Link<T>
{
	private T data;
	private Link<T> nextLink;

	//Constructors
	///////////////////////////////////////////

	public Link(T data, Link<T> nextLink)
	{
		this.data = data;
		this.nextLink = nextLink;
	}

	public Link(T data)
	{
		this.data = data;
		this.nextLink = null;
	}

	//Setters
	////////////////////////////////////

	//O(1)
	public void setData(T data)
	{
		this.data = data;
	}

	//O(1)
	public void setNextLink(Link<T> nextLink)
	{
		this.nextLink = nextLink;
	}

	//Getters
	////////////////////////////////////

	//O(1)
	public T getData()
	{
		return this.data;
	}

	//O(1)
	public Link<T> getNextLink()
	{
		return this.nextLink;
	}


}