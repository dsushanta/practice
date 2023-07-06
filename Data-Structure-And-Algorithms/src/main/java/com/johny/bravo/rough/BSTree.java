/**
 * 
 */
package com.johny.bravo.rough;

import com.johny.bravo.tree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.function.DoubleToLongFunction;

import com.johny.bravo.linked_list.doublyLink;
import com.johny.bravo.linked_list.doublyLinkNode;
import com.johny.bravo.sorting.Utils;

/**
 * @author Sushant
 *
 */
public class BSTree {

	public Node root;

	public BSTree() {
		this.root = null;
	}
	
	public boolean isEmpty() {
		return (root == null);
	}
	
	public void insert(Comparable data) {
		root = insert(root, data);
	}
	
	private Node insert(Node node, Comparable data) {
		if(node == null) {
			node = new Node(data);
		}
		else if(Utils.less(node.getData(), data))
			node.setRightChild(insert(node.getRightChild(), data));
		else
			node.setLeftChild(insert(node.getLeftChild(), data));
		return node;
	}
	
	public void PreOrderTraversal() {
		PreOrderTraversal(root);
	}
	private void PreOrderTraversal(Node node) {
		if(node == null)
			return;
		System.out.println(node.getData());
		PreOrderTraversal(node.getLeftChild());
		PreOrderTraversal(node.getRightChild());
	}
	
	public void InOrderTraversal() {
		InOrderTraversal(root);
	}
	private void InOrderTraversal(Node node) {
		if(node == null)
			return;
		InOrderTraversal(node.getLeftChild());
		System.out.println(node.getData());
		InOrderTraversal(node.getRightChild());
	}
	
	public void PostOrderTraversal() {
		PostOrderTraversal(root);
	}
	private void PostOrderTraversal(Node node) {
		if(node == null)
			return;
		PostOrderTraversal(node.getLeftChild());
		PostOrderTraversal(node.getRightChild());
		System.out.println(node.getData());
	}
	
	public boolean search(Comparable item) {
		return search(root, item);
	}
	private boolean search(Node node, Comparable item) {
		boolean found = false;
		if(node == null)
			;
		else if(Utils.less(item, node.getData()))
			found = search(node.getLeftChild(), item);
		else if(Utils.less(node.getData(), item))
			found = search(node.getRightChild(), item);
		else
			found = true;
		return found;
	}
	
	public int distanceFromRoot(int item) {
		return distanceFromRoot(root,item);
	}
	private int distanceFromRoot(Node node, int item) {
		int left, right;
		if(node == null)
			return -1;
		else if(item == (int)node.getData())
			return 0;
		else {
			left = distanceFromRoot(node.getLeftChild(), item);
			if(left<0) {
				right = distanceFromRoot(node.getRightChild(), item);
				if(right<0)
					return -1;
				else
					return right+1;
			}
			return left+1;
		}
	}
	
	public void levelOrderTraversal() {
		if(isEmpty())
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node temp_node = q.poll();
			System.out.print(temp_node.getData()+" ");
			int data1 = (int)temp_node.getData();
			if(q.isEmpty())
				System.out.println("\n ---------------------------------------- \n");
			else {
				int data2 = (int)q.peek().getData();
				if(distanceFromRoot(data1) != distanceFromRoot(data2))
					System.out.println("\n ---------------------------------------- \n");
			}
			if(temp_node.getLeftChild() != null)
				q.add(temp_node.getLeftChild());
			if(temp_node.getRightChild() != null)
				q.add(temp_node.getRightChild());
		}
	}
	
	public void sameCell() {
		if(isEmpty())
			return;
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int data1 = (int)temp.getData();
			if(!q.isEmpty()) {
				Node temp1 = q.peek();
				int data2 = (int)temp1.getData();
				if((distanceFromRoot(data1) == distanceFromRoot(data2)) && temp.getRightChild() != null && temp1.getLeftChild() != null)
					System.out.println("[ "+temp.getRightChild().getData()+" - "+temp1.getLeftChild().getData()+" ]");
			}			
			if(temp.getLeftChild() != null)
				q.add(temp.getLeftChild());
			if(temp.getRightChild() != null)
				q.add(temp.getRightChild());
		}
	}
	
	public int height() {
		return height(root);
	}
	
	private int height(Node node) {
		int h;
		if(node == null)
			return -1;
		int l_h = height(node.getLeftChild());
		int r_h = height(node.getRightChild());
		if(l_h <= r_h)
			h = r_h + 1;
		else
			h = l_h + 1;
		return h;
	}
	
	public Comparable min() {
		return min(root);
	}
	
	private Comparable min(Node node) {
		Comparable min;
		if(node == null)
			return null;
		if(node.getLeftChild() == null)
			min = node.getData();
		else {
			min = min(node.getLeftChild());
		}
		return min;
	}
	
	public Comparable max() {
		return min(root);
	}
	
	private Comparable max(Node node) {
		Comparable max;
		if(node == null)
			return null;
		if(node.getRightChild() == null)
			max = node.getData();
		else {
			max = max(node.getRightChild());
		}
		return max;
	}
	
	public void levelOrderSpiral() {
		Stack<Node> s1 = new Stack<Node>();
		Stack<Node> s2 = new Stack<Node>();
		s1.push(root);
		while((!s1.isEmpty()) || (!s2.isEmpty())) {
			while(!s1.isEmpty()) {
				Node temp = s1.pop();
				System.out.print(temp.getData()+" ");
				if(temp.getRightChild() != null)
					s2.push(temp.getRightChild());
				if(temp.getLeftChild() != null)
					s2.push(temp.getLeftChild());
				System.out.println("\n --------------------------------------- \n");
			}
			while(!s2.isEmpty()) {
				Node temp = s2.pop();
				System.out.print(temp.getData()+" ");
				if(temp.getLeftChild() != null)
					s1.push(temp.getLeftChild());
				if(temp.getRightChild() != null)
					s1.push(temp.getRightChild());
				System.out.println("\n --------------------------------------- \n");
			}
		}
	}
	
	private Node node_ref(Node node, Comparable item) {
		Node node_ref;
		if(node == null)
			return null;
		if(Utils.less(item, node.getData()))
			node_ref = node_ref(node.getLeftChild(), item);
		else if(Utils.less(node.getData(), item))
			node_ref = node_ref(node.getRightChild(), item);
		else
			node_ref = node;
		return node_ref;
	}
	
	public Comparable leftChild(Comparable item) {
		Node l_child;
		Node node_ref = node_ref(root, item);
		if(node_ref == null)
			return null;
		l_child = node_ref.getLeftChild();
		if(l_child == null)
			return null;
		else
			return l_child.getData();
	}
	
	public Comparable rightChild(Comparable item) {
		Node r_child;
		Node node_ref = node_ref(root, item);
		if(node_ref == null)
			return null;
		r_child = node_ref.getRightChild();
		if(r_child == null)
			return null;
		else
			return r_child.getData();
	}
	
	public void boundary() {
		printLeftEdge(root);
		printLeaf(root);
		printRightEdge(root);
	}
	
	private void printLeftEdge(Node node) {
		if(node == null || (node.getLeftChild() == null && node.getRightChild() == null))
			return;
		System.out.print(node.getData()+" ");
		if(node.getLeftChild() == null)
			printLeftEdge(node.getRightChild());
		else {
			printLeftEdge(node.getLeftChild());
		}
	}
	
	public void printRightEdge() {
		printRightEdge(root);
	}
	
	private void printRightEdge(Node node) {
		if(node == null || (node.getLeftChild() == null && node.getRightChild() == null))
			return;
		if(node.getRightChild() == null)
			printRightEdge(node.getLeftChild());
		else {
			printRightEdge(node.getRightChild());
		}
		System.out.print(node.getData()+" ");
	}
	
	private void printLeaf(Node node) {
		if(node == null)
			return;
		if(node.getLeftChild() == null && node.getRightChild() == null)
			System.out.print(node.getData()+" ");
		else {
			printLeaf(node.getLeftChild());
			printLeaf(node.getRightChild());
		}
	}
	
	public int findLCA(int item1, int item2) {
		Node lca = findLCA(root, item1, item2);
		if(lca == null)
			return -1;
		else
			return (int)lca.getData();
	}
	
	private Node findLCA(Node node, int item1, int item2) {
		Node l, r;
		if(node == null)
			return null;
		if(item1 == (int)node.getData() || item2 == (int)node.getData())
			return node;
		l = findLCA(node.getLeftChild(), item1, item2);
		r = findLCA(node.getRightChild(), item1, item2);
		if(l != null && r != null)
			return node;
		if(l != null)
			return l;
		if(r != null)
			return r;
		return null;
	}
	
	public int distanceBetweenNodes(int item1, int item2) {
		int dist1 = distanceFromRoot(item1);
		int dist2 = distanceFromRoot(item2);
		int lca = findLCA(item1, item2);
		int lca_dist, dist = -1;
		lca_dist = distanceFromRoot(lca);
		if(dist1 == -1 || dist2 == -1 || lca_dist == -1)
			return -1;
		else
			dist = dist1 + dist2 - 2*lca_dist;
		return dist;
	}
	
	public void mirror() {
		root = mirror(root);
	}
	
	private Node mirror(Node node) {
		if(node == null)
			return null;
		if(node.getLeftChild() == null && node.getRightChild() == null)
			return node;
		Node temp = node.getLeftChild();
		node.setLeftChild(node.getRightChild());
		node.setRightChild(temp);
		temp = null;
		node.setLeftChild(mirror(node.getLeftChild()));
		node.setRightChild(node.getRightChild());
		return node;
	}
	
	public void topView() {
		doublyLinkNode topNodes = new doublyLinkNode();
		topView(root, topNodes);
		while(topNodes.getPrev() != null)
			topNodes = topNodes.getPrev();
		doublyLinkNode t = topNodes;
		while(t != null) {
			System.out.println(t.getData().getData()+" ");
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
	
	public void BSTFromPostOrderList(Comparable[] pol) {
		root = BSTFromPostOrderList(root, pol, 0, pol.length-1);
//		System.out.println("Is this a Binary Search Tree - "+isBST());
	}
	
	private Node BSTFromPostOrderList(Node node, Comparable[] pol, int start, int end) {
		if(start>end)
			return null;
		if(start == end) {
			node = new Node(pol[start]);
			return node;
		}	
		node = new Node(pol[end]);
		int partition_index = getPartitionIndex(pol, pol[end], start, end-1);
		node.setLeftChild(BSTFromPostOrderList(node.getLeftChild(), pol, start, partition_index-1));
		node.setRightChild(BSTFromPostOrderList(node.getRightChild(), pol, partition_index, end-1));
		return node;
	}
	
	private int getPartitionIndex(Comparable[] pol, Comparable item, int start, int end) {
		int p = end+1;
		for(int i=start; i<=end; i++) {
			if(Utils.less(item, pol[i])) {
				p = i;
				break;
			}
		}
		return p;
	}
	
	public void BSTFromInOrderList(Comparable[] iol) {
		BSTFromInOrderList(iol, 0, iol.length-1);
	}
	
	private void BSTFromInOrderList(Comparable[] iol, int start, int end) {
		if(start > end)
			return;
		int mid = (start + end)/2;
		insert(iol[mid]);
		BSTFromInOrderList(iol, start, mid-1);
		BSTFromInOrderList(iol, mid+1, end);
	}
	
	public void verticalOrderSumLL() {
		doublyLink sum = new doublyLink(0);
		verticalOrderSumLL(root, sum);
	}
	
	private void verticalOrderSumLL(Node node, doublyLink sum) {
		if(node == null)
			return;
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
	
	public boolean isBST() {
		
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		return isBST(root, min, max);
	}
	
	private boolean isBST(Node node, int min, int max) {
		if(node == null)
			return true;
		boolean b1 = (int)node.getData() > min;
		boolean b2 = (int)node.getData() < max;
		boolean b3 = isBST(node.getLeftChild(), min, (int)node.getData());
		boolean b4 = isBST(node.getRightChild(), (int)node.getData(), max);
		if(b1 && b2 && b3 && b4)
			return true;
		else
			return false;
	}
	
	public void rightView() {
		if(isEmpty())
			return;
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		while(!q.isEmpty()) {
			Node temp = q.poll();
			int data1 = (int)temp.getData();
			if(q.isEmpty())
				System.out.print(" "+data1);
			else {
				int data2 = (int)q.peek().getData();
				int dist1 = distanceFromRoot(data1);
				int dist2 = distanceFromRoot(data2);
				if(dist1 != dist2)
					System.out.print(" "+data1);
			}
			
			if(temp.getLeftChild() != null)
				q.add(temp.getLeftChild());
			if(temp.getRightChild() != null)
				q.add(temp.getRightChild());
		}
	}
	
	public Node ancestor(int item) {
		return ancestor(root, null, item);
	}
	
	private Node ancestor(Node node, Node t, int item) {
		if(node == null)
			return null;
		if(item == (int)node.getData())
			return t;
		Node a = ancestor(node.getLeftChild(), node, item);
		if(a != null)
			return a;
		else {
			a = ancestor(node.getRightChild(), node, item);
			return a;
		}
	}
}
