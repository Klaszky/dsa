public class BST
{
	public static void main(String[] args)
	{
		BST tree = new BST();
		tree.insert(3546);
		tree.insert(23);
		tree.insert(656);
		tree.insert(123);
		tree.insert(52);
		tree.insert(25);
		tree.insert(3646);
		tree.insert(12);
		tree.insert(699);
		tree.insert(42);
		tree.insert(646);
		tree.insert(97);
		tree.insert(999);
		tree.insert(1);
		System.out.println(search(1, tree.root));
		System.out.println(tree.search(2563546));
		int x = gHeight(root);
	}
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

	public boolean search(int data)
	{
		if(BST_Node.getNode(this.root, data).getData() != data)
		{
			return false;
		}

		return true;
	}

	// public static BST_Node getNode(int data, BST_Node root)
	// {
	// 	if(root == null)
	// 	{
	// 		return null;
	// 	}

	// 	if(root.getData() == data)
	// 	{
	// 		return root;
	// 	}
	// 	else
	// 	{
	// 		if(data > root.getData() && root.getRight() != null)
	// 		{
	// 			return getNode(data, root.getRight());
	// 		}
	// 		else if(data < root.getData() && root.getLeft() != null)
	// 		{
	// 			return getNode(data, root.getLeft());
	// 		}
	// 		else
	// 		{
	// 			return root;
	// 		}
	// 	}

	// }


	public void insert(int data)
	{
		if(this.root == null)
		{
			this.root = new BST_Node(data);
		}
		BST_Node found = BST_Node.getNode(this.root, data);
		if(found.getData() == data)
		{
			return;
		}
		else
		{
			if(found.getData() > data)
			{
				found.setLeft(new BST_Node(data));
			}
			else
			{
				found.setRight(new BST_Node(data));
			}
		}
	}

	public String toString()
	{
		if (this.root == null)
		{
			return "(null)";
		}
		else 
		{
			return "(" + BST_Node.nodeString(this.root) + ")";
		}
	}

	public int gHeight()
	{
		return BST_Node.getHeight(this.root);
	}


}
