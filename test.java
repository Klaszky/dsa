//test.java
public class test{
	public static void main(String[] args)
	{
		Link<String> front = new Link<>("Hello", null);
		System.out.println(front.getData());

		LinkedList<String> ll = new LinkedList<>(front);

		System.out.println(ll.getFront().getData());
	}
}