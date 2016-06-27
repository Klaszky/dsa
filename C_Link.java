public class C_Link<T>
{
	private T data;
	private Link<T> nextLink;

	//Constructors
	///////////////////////////////////////////

	public C_Link(T data, Link<T> nextLink)
	{
		this.data = data;
		this.nextLink = nextLink();
	}

	//Setters
	////////////////////////////////////

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