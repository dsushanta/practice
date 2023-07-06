package com.johny.bravo.tree;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

import com.johny.bravo.linked_list.doublyLink;
import com.johny.bravo.linked_list.doublyLinkNode;
import com.johny.bravo.sorting.Utils;

public class Binary_Search_Tree {

	//private Node root;
	public Node root;
	private Comparable[] in_order_list;
	
	public Binary_Search_Tree() {
		this.root = null;
	}
	
	public boolean isEmpty() {
		return (this.root == null);
	}
	
	public void insert_binary(Comparable item) {
		root = insert_binary(root, item);
	}
	
	private Node insert_binary(Node node, Comparable item) {
		if(node == null)
			node = new Node(item);
		else if(node.getLeftChild() == null)
			node.setLeftChild(insert_binary(node.getLeftChild(),item));
		else
			node.setRightChild(insert_binary(node.getRightChild(), item));
		
		return node;
	}
	
	public void insert(Comparable item) {
		
		root = insert(root, item);
	}
	
	private Node insert(Node node, Comparable item) {	
		if(node == null)
			node = new Node(item);
		else if(Utils.less(node.getData(), item))
			node.setRightChild(insert(node.getRightChild(), item));
		else	
			node.setLeftChild(insert(node.getLeftChild(), item));
		return node;
	}
	
//	public void levelOrderTraversal() {
//		
//		if(isEmpty())
//			return;
//		
//		Queue<Node> discovered_nodes = new LinkedList<Node>();
//		discovered_nodes.add(root);
//		
//		while(!discovered_nodes.isEmpty()) {
//			Node temp = discovered_nodes.poll();
//			System.out.println(temp.getData());
//			if(temp.getLeftChild() != null)
//				discovered_nodes.add(temp.getLeftChild());
//			if(temp.getRightChild() != null)
//				discovered_nodes.add(temp.getRightChild());
//		}
//	}
	
	public void sameCell() {
		
		if(isEmpty())
			return;
		
		Queue<Node> discovered_nodes = new LinkedList<Node>();
		discovered_nodes.add(root);
		
		while(!discovered_nodes.isEmpty()) {
			Node temp1 = discovered_nodes.poll();
			int data1 = (int)temp1.getData();
			if(!discovered_nodes.isEmpty()) {
				Node temp2 = discovered_nodes.peek();
				int data2 = (int)temp2.getData();
				
				if((distanceFromRoot(data1) == distanceFromRoot(data2))) {
					if((temp1.getRightChild() != null) && (temp2.getLeftChild() != null))
						System.out.println(temp1.getRightChild().getData()+"   "+temp2.getLeftChild().getData());
				}
			}	
			if(temp1.getLeftChild() != null)
				discovered_nodes.add(temp1.getLeftChild());
			if(temp1.getRightChild() != null)
				discovered_nodes.add(temp1.getRightChild());
		}
	}
	
	public void levelOrderTraversal() {
		if(isEmpty())
			return;
		Queue<Node> discovered_nodes = new LinkedList<Node>();
		discovered_nodes.add(root);
		
		while(!discovered_nodes.isEmpty()) {
			Node temp = discovered_nodes.poll();
			int data1 = (int)temp.getData();
			System.out.print(" "+data1);
			if(discovered_nodes.isEmpty())
				System.out.print("\n ------------------------------------------------------------ \n");
			else {
				int data2 = (int)discovered_nodes.peek().getData();
				if((distanceFromRoot(data1) != distanceFromRoot(data2)))
					System.out.print("\n ------------------------------------------------------------ \n");
			}	
			if(temp.getLeftChild() != null)
				discovered_nodes.add(temp.getLeftChild());
			if(temp.getRightChild() != null)
				discovered_nodes.add(temp.getRightChild());
		}
	}
	
	public void InOrderTraversal() {
		InOrderTraversal(root);
	}
	
	private void InOrderTraversal(Node node) {
		
		if(node == null)
			return;
		else {
			InOrderTraversal(node.getLeftChild());
			System.out.println(node.getData());
			InOrderTraversal(node.getRightChild());
		}
		
	}
	
	public Comparable[] InOrderTraversalBinary(int size) {
		
		in_order_list = new Comparable[size];
		InOrderTraversalBinary(root,0);
		return in_order_list;
	}
	
	private int InOrderTraversalBinary(Node node, int i) {
		
		if(node == null)
			return i;
		else {
			i = InOrderTraversalBinary(node.getLeftChild(),i);
			in_order_list[i] = node.getData();
			i++;
			//System.out.println(node.getData());
			i = InOrderTraversalBinary(node.getRightChild(), i);
		}
		return i;
	}
	
	public void PreOrderTraversal() {
		
		PreOrderTraversal(root);
	}
	
	private void PreOrderTraversal(Node node) {
		
		if(node == null)
			return;
		else {
			System.out.println(node.getData());
			PreOrderTraversal(node.getLeftChild());
			PreOrderTraversal(node.getRightChild());
		}
	}
	
	public void PostOrderTraversal() {
		
		PostOrderTraversal(root);
	}
	
	private void PostOrderTraversal(Node node) {
		
		if(node == null)
			return;
		else {
			PostOrderTraversal(node.getLeftChild());
			PostOrderTraversal(node.getRightChild());
			System.out.println(node.getData());
		}
	}
	
	public boolean search(Comparable item) {
		
		return search(root, item);
	}
	
	private boolean search(Node node, Comparable item) {
		
		boolean found = false;
		if(node == null)
			found = false;
		else {
			if (Utils.less(node.getData(), item))
				found = search(node.getRightChild(), item);
			else if (Utils.less(item, node.getData()))
				found = search(node.getLeftChild(), item);
			else
				found = true;
		}	
		return found;
	}
	
	private Node node_ref(Node node, Comparable item) {
		Node ref = null;
		if(node == null)
			ref = null;
		else {
			if (Utils.less(node.getData(), item))
				ref = node_ref(node.getRightChild(), item);
			else if (Utils.less(item, node.getData()))
				ref = node_ref(node.getLeftChild(), item);
			else
				ref = node;
		}
		return ref;
	}
	
	public Comparable leftChild(Comparable item) {
		
		Comparable lChild = null;
		Node node = node_ref(root, item);
		if (node == null)
			lChild = null;
		else 
			if (node.getLeftChild() == null)
				lChild = null;
			else 
				lChild = node.getLeftChild().getData();
		return lChild;
	}
	
	public Comparable rightChild(Comparable item) {
		
		Comparable rChild = null;
		Node node = node_ref(root, item);
		if (node == null)
			rChild = null;
		else 
			if (node.getRightChild() == null)
				rChild = null;
			else 
				rChild = node.getRightChild().getData();
		return rChild;
	}
	
	public Comparable minNode() {
		return minNode(root);
	}
	
	private Comparable minNode(Node node) {
		Comparable minElement = null;
		if(node == null)
			minElement = null;
		else {
			if(node.getLeftChild() == null)
				minElement = node.getData();
			else
				minElement = minNode(node.getLeftChild());
		}
		return minElement;
	}
	
	public Comparable maxNode() {
		return maxNode(root);
	}
	
	private Comparable maxNode(Node node) {
		Comparable maxElement = null;
		if(node == null)
			maxElement = null;
		else {
			if(node.getRightChild() == null)
				maxElement = node.getData();
			else
				maxElement = maxNode(node.getRightChild());
		}
		return maxElement;
	}
	
	public int heightOfTree() {
		return heightOfTree(root);
	}
	
	public int heightOfTree(Node node) {
		int height = -1;
		if(node == null)
			height = -1;
		else {
			int height_left = heightOfTree(node.getLeftChild());
			int height_right = heightOfTree(node.getRightChild());
			
			if(height_left <= height_right)		
				height = height_right + 1;
			else
				height = height_left + 1;
		}
		
		return height;
	}
	
	public boolean isBST() {
		
		Comparable min = null, max = null;
		String class_of_Tree = root.getData().getClass().toString();
		
		if(class_of_Tree.equalsIgnoreCase("class java.lang.Integer")) {
			min = Integer.MIN_VALUE;
			max = Integer.MAX_VALUE;
		}
		else if(class_of_Tree.equalsIgnoreCase("class java.lang.Double")) {
			min = Double.MIN_VALUE;
			max = Double.MAX_VALUE;
		}
		else if(class_of_Tree.equalsIgnoreCase("class java.lang.String")) {
			min = "";
			max = "$$$$$$$$@@@@@@@%%%%%%*****!!!!!!#######";
		}
		return isBST(root, min, max);
	}
	
	private boolean isBST(Node node, Comparable min, Comparable max) {
		if(node == null)
			return true;
		if(Utils.less(min, node.getData())
			&& Utils.less(node.getData(), max)
			&& isBST(node.getLeftChild(),min, (Integer)node.getData())
			&& isBST(node.getRightChild(), (Integer)node.getData(), max))
				return true;
		else 
			return false;
	}
	
	public void delete(Comparable item) {
		root = delete(root,item);
	}
	
	private Node delete(Node node, Comparable item) {
	
		if (node == null)
			return null;
		if(Utils.less(item, node.getData()))
			node.setLeftChild(delete(node.getLeftChild(), item));
		else if(Utils.less(node.getData(), item))
			node.setRightChild(delete(node.getRightChild(), item));
		else {
			if((node.getLeftChild() == null) && (node.getRightChild() == null)) {
				node = null;
			}
			else if(node.getLeftChild() == null) {
				node = node.getRightChild();
			}
			else if(node.getRightChild() == null) {
				node = node.getLeftChild();
			}
			else {
				Comparable min = minNode(node.getRightChild());
				delete(node.getRightChild(),min);
				node.setData(min);
			}
		}
		return node;
	}
	
	public void BSTFromPostOrderList(Comparable [] pol) {
		
		root = BSTFromPostOrderList(root, pol, 0, pol.length-1);
		System.out.println("Is this a Binary Search Tree - "+isBST());
		//PreOrderTraversal();
		
	}
	
	private Node BSTFromPostOrderList(Node node, Comparable [] pol, int start, int end) {	
		if(start > end)
			return null;
		if(start == end) {
			node = new Node(pol[end]);
			return node;
		}	
		node = new Node(pol[end]);
//		if(start == end-1) {
//			if(Utils.less(pol[end-1], pol[end]))
//				node.setLeftChild(new Node(pol[end-1]));
//			else
//				node.setRightChild(new Node(pol[end-1]));
//			return node;
//		}
		int partition_index = getPartitionIndex(pol, pol[end], start, end-1);
		node.setLeftChild(BSTFromPostOrderList(node.getLeftChild(), pol, start, partition_index-1));
		node.setRightChild(BSTFromPostOrderList(node.getRightChild(), pol, partition_index, end-1));		
		return node;
	}
	private int getPartitionIndex(Comparable []pol, Comparable item, int start, int end) {
		int partition = end+1;              // This is for a scenario where there is no right sub tree
		for(int i=start; i<=end; i++)
			if(Utils.less(item, pol[i])) {
				partition = i;
				break;
			}
		return partition;
	}
	
	public void BSTInAGivenRange(int lower, int upper) {
		BSTInAGivenRange(root, lower, upper);
	}
	
	private void BSTInAGivenRange(Node node, int lower, int upper) {
		if(node == null)
			return;
		if(Utils.less(lower, node.getData()))
			BSTInAGivenRange(node.getLeftChild(), lower, upper);
		if(!(Utils.less(node.getData(), lower)) && !(Utils.less(upper, node.getData())))
			System.out.println(" "+node.getData());
		if(Utils.less(node.getData(), upper))
			BSTInAGivenRange(node.getRightChild(), lower, upper);
	}
	
	public boolean chkSingleChild(int []a) {
		int s = a.length;
		for(int i=0; i<s-1; i++) {
			int next_succ_diff = a[i] - a[i+1];
			int last_succ_diff = a[i] - a[s-1];
			if(next_succ_diff*last_succ_diff < 0)
				return false;
		}
		return true;
	}
	
	public void BSTFromInOrderList(Comparable [] in_order_list) {
		int size = in_order_list.length;
		BSTFromInOrderList(in_order_list,0,size-1);
	}
	
	private void BSTFromInOrderList(Comparable [] in_order_list, int start, int end) {
		if(start > end)
			return;
		int mid = (start + end)/2;
		insert(in_order_list[mid]);
		BSTFromInOrderList(in_order_list, start, mid-1);
		BSTFromInOrderList(in_order_list, mid+1, end);
	}
	
	public void BSTFromBinaryTree(Comparable[] sorted_in_order_list_binary) {
		BSTFromBinaryTree(root,sorted_in_order_list_binary,0);
	}
	
	private int BSTFromBinaryTree(Node node, Comparable[] sorted_in_order_list_binary, int i) {
		if(node == null)
			return i;
		else {
			i = BSTFromBinaryTree(node.getLeftChild(), sorted_in_order_list_binary,i);
			node.setData(sorted_in_order_list_binary[i]);
			i++;
			i = BSTFromBinaryTree(node.getRightChild(), sorted_in_order_list_binary, i);
		}
		return i;
	}
	
	public void verticalOrderSumLL() {
		
		doublyLink sum = new doublyLink(0);
		verticalOrderSumLL(root, sum);
		while(sum.getprev() != null)
			sum = sum.getprev();
		doublyLink t = sum;
		while(t != null) {
			System.out.println(t.getData());
			t = t.getnext();
		}
	}
	
	private void verticalOrderSumLL(Node node, doublyLink sum) {
		
		sum.setData(sum.getData() + (int)node.getData());
		if(node.getLeftChild() != null) {
			if(sum.getprev() == null) {
				sum.setprev(new doublyLink(0));
				sum.getprev().setnext(sum);
			}
			verticalOrderSumLL(node.getLeftChild(), sum.getprev());
		}
		if(node.getRightChild() != null) {
			if(sum.getnext() == null) {
				sum.setnext(new doublyLink(0));
				sum.getnext().setprev(sum);
			}
			verticalOrderSumLL(node.getRightChild(), sum.getnext());
		}
		
	}
	
//	private doublyLink verticalOrderSumLL(Node node, doublyLink sum) {
//		
//		sum.setData(sum.getData() + (int)node.getData());
//		if(node.getLeftChild() != null) {
//			if(sum.getprev() == null) {
//				sum.setprev(new doublyLink(0));
//				sum.getprev().setnext(sum);
//			}
//			sum = verticalOrderSumLL(node.getLeftChild(), sum.getprev());
//		}
//		if(node.getRightChild() != null) {
//			if(sum.getnext() == null) {
//				sum.setnext(new doublyLink(0));
//				sum.getnext().setprev(sum);
//			}
//			sum = verticalOrderSumLL(node.getRightChild(), sum.getnext());
//		}
//	return sum;	
//	}
	
	public void verticalOrderSumHashMap() {
		HashMap<Integer, Integer> sum = new HashMap<Integer, Integer>();
		sum.put(0, 0);
		int pos = 0;
		verticalOrderSumHashMap(root, sum, pos);
		for(Map.Entry m : sum.entrySet())
			System.out.println("\n "+m.getKey()+" : "+m.getValue());
	}
	
	private void verticalOrderSumHashMap(Node node, HashMap<Integer, Integer> sum, int pos) {
		sum.put(pos, sum.get(pos)+(int)node.getData());
		if(node.getLeftChild() != null) {
			if(!(sum.containsKey(pos-1))) {
				sum.put(pos-1, 0);
			}
			verticalOrderSumHashMap(node.getLeftChild(), sum, pos-1);
		}
		if(node.getRightChild() != null) {
			if(!(sum.containsKey(pos+1))) {
				sum.put(pos+1, 0);
			}
			verticalOrderSumHashMap(node.getRightChild(), sum, pos+1);
		}
		
	}
	
	public int distanceFromRoot(int item) {
		int dist = distanceFromRoot(root, item);
		return dist;
	}
	
	private int distanceFromRoot(Node node, int item) {
		int left, right;
		if(node == null)
			return -1;
		
		if(item == (int)node.getData()) {
			return 0;
		}
		left = distanceFromRoot(node.getLeftChild(), item);
		if(left < 0) {
			right = distanceFromRoot(node.getRightChild(), item);
			if(right < 0)
				return -1;
			else
				return right +1;
		}
		else
			return left+1;
	}
	
	public int findLCA(int item1, int item2) {
		Node lca = findLCA(root, item1, item2);
		if(lca == null)
			return -1;
		else {
			int lca_data = (int)lca.getData();
			return lca_data;
		}
	}
	
	private Node findLCA(Node node, int item1, int item2) {
	/*	if (node == null)
            return null;
  
        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.data > n1 && node.data > n2)
            return lca(node.left, n1, n2);
  
        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.data < n1 && node.data < n2) 
            return lca(node.right, n1, n2);
  
        return node;*/
		
		Node left, right;
		if(node == null)
			return null;	
		if((item1 == (int)node.getData()) || (item2 == (int)node.getData()))
			return node;
		left = findLCA(node.getLeftChild(), item1, item2);
		right = findLCA(node.getRightChild(), item1, item2);
		if(left != null && right != null)
			return node;
		if(left != null)
			return left;
		if(right != null)
			return right;
		else 
			return null;
	}
	
	public int distanceBetwNodes(int item1, int item2) {
		int depth1, depth2, depth_lca, dbn;
		depth1 = distanceFromRoot(item1);
		depth2 = distanceFromRoot(item2);
		Node lca_node = findLCA(root, item1, item2);
		depth_lca = distanceFromRoot((int)lca_node.getData());
		if(depth1 == -1 || depth2 == -1 || depth_lca == -1)
			return -1;
		dbn = depth1 + depth2 - 2*depth_lca;
		return dbn;
	}
	
	public Node ancestor(int item) {
		return ancestor(root, null,item);
	}
	
	private Node ancestor(Node node, Node t, int item) {
		Node a;
		if(node == null)
			return null;
		if(item == (int)node.getData()) {
			return t;
		}	
		a = ancestor(node.getLeftChild(), node, item);
		if(a != null)
			return a;
		a = ancestor(node.getRightChild(), node,item);
		return a;
	}
	
	public int[] rightView() {
		int max_level = heightOfTree()+1;
		int[] rightmost = new int[max_level];
		rightmost = rightView(root, rightmost);
		return rightmost;
	}
	
	private int[] rightView(Node node, int[] rightmost) {
		int level =0;
		if(isEmpty())
			return null;
		Queue<Node> discovered_nodes = new LinkedList<Node>();
		discovered_nodes.add(root);
		
		while(!discovered_nodes.isEmpty()) {
			Node temp = discovered_nodes.poll();
			int data1 = (int)temp.getData();
			
				
			if(discovered_nodes.isEmpty() && temp != root && temp.getLeftChild() == null && temp.getRightChild() == null) {
				rightmost[level++] = data1;
				return rightmost;
			}
			if(discovered_nodes.isEmpty() && temp != root && (temp.getLeftChild() != null || temp.getRightChild() != null))
				rightmost[level++] = data1;
			else if(discovered_nodes.isEmpty() && temp == root)
				rightmost[level++] = data1;
			else {
				int data2 = (int)discovered_nodes.peek().getData();
				if((distanceFromRoot(data1) != distanceFromRoot(data2)))
					rightmost[level++] = data1;
			}	
			if(temp.getLeftChild() != null)
				discovered_nodes.add(temp.getLeftChild());
			if(temp.getRightChild() != null)
				discovered_nodes.add(temp.getRightChild());
		}
		return rightmost;
	}
	
	public void topView() {		
		doublyLinkNode topNodes = new doublyLinkNode();
		topView(root, topNodes);
		while(topNodes.getPrev() != null)
			topNodes = topNodes.getPrev();
		doublyLinkNode t = topNodes;
		while(t != null) {
			System.out.print(t.getData().getData()+" ");
			t = t.getNext();
		}
	}
	
	private void topView(Node node, doublyLinkNode topNodes) {
		if(topNodes.getData() == null)
			topNodes.setData(node);
		else {
			int d1 = distanceFromRoot((int)node.getData());
			int d2 = distanceFromRoot((int)topNodes.getData().getData());
			if(d1<d2)
				topNodes.setData(node);
		}	
		if(node.getLeftChild() != null) {
			if(topNodes.getPrev() == null) {
				topNodes.setPrev(new doublyLinkNode());
				topNodes.getPrev().setNext(topNodes);
			}
			topView(node.getLeftChild(), topNodes.getPrev());
		}
		if(node.getRightChild() != null) {
			if(topNodes.getNext() == null) {
				topNodes.setNext(new doublyLinkNode());
				topNodes.getNext().setPrev(topNodes);
			}
			topView(node.getRightChild(), topNodes.getNext());
		}
		
	}
	
	public void levelOrderSpiral() {
		Stack<Node> s1 = new Stack<Node> ();
		Stack<Node> s2 = new Stack<Node> ();
		
		s1.push(root);
		
		if((! s1.isEmpty()) || (! s2.isEmpty())) {
			
			while(! s1.isEmpty()) {
				Node temp = s1.pop();
				System.out.println(temp.getData()+" ");
				if(temp.getRightChild() != null)
					s2.push(temp.getRightChild());
				if(temp.getLeftChild() != null)
					s2.push(temp.getRightChild());
			}
			while(! s2.isEmpty()) {
				Node temp = s2.pop();
				System.out.println(temp.getData()+" ");
				if(temp.getLeftChild() != null)
					s1.push(temp.getLeftChild());
				if(temp.getRightChild() != null)
					s1.push(temp.getRightChild());
			}
		}
		
	}
	
	public int[] rightView2() {
		Stack<Node> s1 = new Stack<Node> ();
		Stack<Node> s2 = new Stack<Node> ();
		int[] right_view = new int[heightOfTree()+1];
		int level = 0;
		
		s1.push(root);
		
		while((! s1.isEmpty()) || (! s2.isEmpty())) {
			
			while(! s1.isEmpty()) {
				Node temp = s1.pop();
				if(s1.isEmpty())
					right_view[level++] = (int)temp.getData();
				//System.out.println(temp.getData()+" ");
				if(temp.getRightChild() != null)
					s2.push(temp.getRightChild());
				if(temp.getLeftChild() != null)
					s2.push(temp.getLeftChild());
			}
			while(! s2.isEmpty()) {
				Node temp = s2.pop();
				if(s2.isEmpty())
					right_view[level++] = (int)temp.getData();
				//System.out.println(temp.getData()+" ");
				if(temp.getRightChild() != null)
					s1.push(temp.getRightChild());
				if(temp.getLeftChild() != null)
					s1.push(temp.getLeftChild());
			}
		}
		return right_view;
	}
	
	public void mirror() {
		root = mirror(root);
	}
	
	private Node mirror(Node node) {
		if(node == null)
			return null;
		if(node.getLeftChild() == null && node.getRightChild() == null)
			return node;
		Node t = node.getLeftChild();
		node.setLeftChild(node.getRightChild());
		node.setRightChild(t);
		t = null;
		node.setLeftChild(mirror(node.getLeftChild()));
		node.setRightChild(mirror(node.getRightChild()));
		return node;
	}
	
	public void boundary() {
		//System.out.println(" "+root.getData()+" ");
		printLeftEdge(root);
		printLeaf(root);
		printRightEdge(root);
		//System.out.println(" "+root.getData()+" ");
	}
	
	private void printLeftEdge(Node node) {
		if((node == null) || (node.getLeftChild() == null && node.getRightChild() == null))
			return;
		System.out.print(" "+node.getData()+" ");
		if(node.getLeftChild() == null)
			printLeftEdge(node.getRightChild());
		else
			printLeftEdge(node.getLeftChild());
	}
	
	public void printRightEdge() {
		printRightEdge(root);
	}
	
	private void printRightEdge(Node node) {
		if((node == null) || (node.getLeftChild() == null && node.getRightChild() == null))
			return;
		if(node.getRightChild() == null)
			printRightEdge(node.getLeftChild());
		else
			printRightEdge(node.getRightChild());
		System.out.print(" "+node.getData()+" ");
	}
	
	private void printLeaf(Node node) {
		if(node == null)
			return;
		if(node.getLeftChild() == null && node.getRightChild() == null)
			System.out.print(" "+node.getData()+" ");
		else {
			printLeaf(node.getLeftChild());
			printLeaf(node.getRightChild());
		}
	}
}
