public class BST
{
	private BST_Node root;

	public BST()
	{
		this.root = null;
	}

	public BST(int data)
	{
		this.root = new BST_Node(data);
	}

	public void setRoot(BST_Node node)
	{
		this.root = node;
	}

	public BST_Node getRoot()
	{
		return root;
	}

	public static boolean search(int data, BST_Node root)
	{
		if(root.getData() == data)
		{
			return true;
		}
		else
		{
			if(data > root.getData() && root.getRight() != null)
			{
				return search(data, root.getRight());
			}
			else if(data < root.getData() && root.getLeft() != null)
			{
				return search(data, root.getLeft());
			}
		}

		return false;

	}

	public static BST_Node getNode(int data, BST_Node root)
	{
		if(root == null)
		{
			return null;
		}

		if(root.getData() == data)
		{
			return root;
		}
		else
		{
			if(data > root.getData() && root.getRight() != null)
			{
				return getNode(data, root.getRight());
			}
			else if(data < root.getData() && root.getLeft() != null)
			{
				return getNode(data, root.getLeft());
			}
			else
			{
				return root;
			}
		}

	}


	public static insert(int data, BST_Node root)
	{
		
	}

	public static void main(String[] args)
	{
		BST root = new BST(200);
		System.out.println(search(200, root.root));
	}
}
