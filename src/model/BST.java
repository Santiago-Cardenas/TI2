package model;

public class BST<E> implements Tree<E> {

	private Node<E> root;
	
	
	
	//BUILDER
	public BST()
	{
		root = null;
	}
	
	
	//------------------METHODS-------------------
	
	public boolean isEmpty()
	{
	   boolean empty = false;
	   if(root == null)
	   {
		   empty = true;
	   }
	   return empty;
			    
	}
	
	
	@Override
	public void add(E element) 
	{
		Node<E> toAdd = new Node<E>(element);
		
		if(isEmpty())
		{
			root = toAdd;
		}
		else
		{
			Node<E> temp = new Node<E>();
			boolean added = false;
			while(!added)
			{
				if( toAdd.compareTo( temp) == 1)
				{
					if(temp.getRight() == null)
					{
						temp.setRight(toAdd);
						toAdd.setUp(temp);
						added = true;
					}
					else
					{
						temp = temp.getRight();
					}
				}
				else if( toAdd.compareTo(temp) == 0 ||toAdd.compareTo( temp) == -1 )
				{
					if( temp.getLeft() == null)
					{
						temp.setLeft(toAdd);
						toAdd.setUp(temp);
						added = true;
					}
					else
					{
						temp = temp.getLeft();
					}
				}
				
			}
			
			
		}
		
		
	}

	@Override
	public void delete(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void search(E element) {
		// TODO Auto-generated method stub
		
	}
}
