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

	public static BST_Node getNode(BST_Node root, int target)
	{
		if(root == null)
		{
			return null;
		}

		if(root.getData() == target)
		{
			return root;
		}
		else if(root.getData() > target && root.getLeft() != null)
		{
			return getNode(root.getLeft(), target);
		}
		else if(root.getData() < target && root.getRight() != null)
		{
			return getNode(root.getRight(), target);
		}
		else
		{
			return root;
		}
	}

	public static String nodeString(BST_Node node)
	{
		String toReturn = "";
		if(node == null)
		{
			return toReturn + "null";
		}
		
		if(node.getLeft() == null && node.getRight() == null)
		{
			toReturn = toReturn + "[";
			toReturn = toReturn + "null" + " " + node.getData() + " " + "null";
			toReturn = toReturn + "]";
			return toReturn;
		}
		else if(node.getLeft() == null)
		{
			toReturn = toReturn + "[";
			toReturn = "[null" + " " + node.getData() + " ";
			toReturn = toReturn + "[" + nodeString(node.getRight().getLeft()) + " " + node.getRight().getData() + " ";
			toReturn = toReturn + nodeString(node.getRight().getRight()) + "]";
			toReturn = toReturn + "]";
			return toReturn;
		}
		else if(node.getRight() == null)
		{
			toReturn = toReturn + "[";
			toReturn = toReturn + "[" + nodeString(node.getLeft().getLeft()) + " " + node.getLeft().getData() + " ";
			toReturn = toReturn + nodeString(node.getLeft().getRight()) + "]";
			toReturn = toReturn + " " + node.getData() + " ";
			toReturn = toReturn + "null]";
			toReturn = toReturn + "]";
			return toReturn;
		}
		else
		{
			toReturn = toReturn + "[";
			toReturn = toReturn + "[" + nodeString(node.getLeft().getLeft()) + " " + node.getLeft().data + " ";
			toReturn = toReturn + nodeString(node.getLeft().getRight()) + "]";
			toReturn = toReturn + " " + node.getData() + " ";
			toReturn = toReturn + "[" + nodeString(node.getRight().getLeft()) + " " + node.getRight().data + " ";
			toReturn = toReturn + nodeString(node.getRight().getRight()) + "]";
			toReturn = toReturn + "]";
			return toReturn;
		}
	}

	public static int getHeight(BST_Node root)
	{
		if(root == null)
		{
			return 0;
		}

		return 1 + BST_Node.max(getHeight(root.getLeft()), getHeight(root.getRight()));
	}

	public static int max(int left, int right)
	{
		if(left > right)
		{
			return left;
		}

		return right;
	}


}
