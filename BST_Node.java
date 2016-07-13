public class BST_Node
{
	private BST_Node left;
	private BST_Node right;
	private int data;

	public BST_Node(int data)
	{
		this.data = data;
	}

	public void setLeft(BST_Node left)
	{
		this.left = left;
	}

	public void setRight(BST_Node right)
	{
		this.right = right;
	}

	public void setData(int data)
	{
		this.data = data;
	}

	public BST_Node getLeft()
	{
		return this.left;
	}

	public BST_Node getRight()
	{
		return this.right;
	}

	public int getData()
	{
		return this.data;
	}
}
