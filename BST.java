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

	public static boolean search(int data, BST_Node rt)
	{
		if(rt.getData() == data)
		{
			return true;
		}
		else
		{
			if(data > rt.getData() && rt.getRight() != null)
			{
				return search(data, rt.getRight());
			}
			else if(data < rt.getData() && rt.getLeft() != null)
			{
				return search(data, rt.getLeft());
			}
		}

		return false;

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
