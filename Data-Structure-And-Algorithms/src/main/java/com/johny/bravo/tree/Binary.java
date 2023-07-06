package com.johny.bravo.tree;

import java.util.ArrayList;
import java.util.List;

public class Binary {

	private Node root;
	private List<Comparable> Inorder = new ArrayList<Comparable> ();
	
	public void insert(Comparable item)
    {
        root = insert(root, item);
    }
    
    private Node insert(Node node, Comparable data)
    {
        if (node == null)
            node = new Node(data);
        else
        {
            if (node.getLeftChild() == null)
                node.setLeftChild(insert(node.getLeftChild(), data));
            else
                node.setRightChild(insert(node.getRightChild(), data));             
        }
        return node; 
	}
    
    public List<Comparable> InOrderTraversal() {
		
		InOrderTraversal(root);
		return Inorder;
	}
	
	private void InOrderTraversal(Node node) {
		
		if(node == null)
			return;
		else {
			InOrderTraversal(node.getLeftChild());
			System.out.println(node.getData());
			Inorder.add(node.getData());
			InOrderTraversal(node.getRightChild());
		}
	}
}
