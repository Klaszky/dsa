public class Link<T>
{
	private T data;
	private Link<T> nextLink;

	public Link(T data, Link<T> nextLink)
	{
		this.data = data;
		this.nextLink = nextLink;
	}

	//Setters
	////////////////////////////////////

	public void setData(T data)
	{
		this.data = data;
	}

	public void setNextLink(Link<T> nextLink)
	{
		this.nextLink = nextLink;
	}

	//Getters
	////////////////////////////////////

	public T getData()
	{
		return this.data;
	}

	public Link<T> getNextLink()
	{
		return this.nextLink;
	}


}