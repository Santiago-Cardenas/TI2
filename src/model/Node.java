package model;

public class Node<E> implements Comparable<Node <E>>{

    private E item;
    private Node<E> left;
    private Node<E> right;
    private Node<E> up;
    
    public Node(E element) {
        this.item = element;
        this.left = null;
        this.right = null;
        this.up = null;
        
    }

    
    public Node() {
        this.item = null;
        this.left = null;
        this.right = null;
        this.up = null;;
    }
    
    public void setItem(E item) {
        this.item = item;
    }

    public E getItem() {
        return item;
    }


   

    public Node<E> getLeft() {
		return left;
	}


	public void setLeft(Node<E> left) {
		this.left = left;
	}


	public Node<E> getRight() {
		return right;
	}


	public void setRight(Node<E> right) {
		this.right = right;
	}


	public Node<E> getUp() {
		return up;
	}


	public void setUp(Node<E> up) {
		this.up = up;
	}


	@SuppressWarnings("unchecked")
	public int compareTo(Node<E> temp) {
        return ((Comparable<E>) getItem()).compareTo((E) temp);
    }

    @Override
    public String toString() {
    	
        return getItem().toString();
    }




}