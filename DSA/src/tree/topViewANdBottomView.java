package tree;

import java.util.ArrayDeque;
import java.util.Queue;

import tree.bTree.Node;

import java.util.*;

public class topViewANdBottomView {
	
	public static void topView(Node root){
		
		Queue<Pair> q = new ArrayDeque<>();
		Map<Integer,Integer> map = new TreeMap<>();
		
		q.add(new Pair(0,root));
		
		while(!q.isEmpty()) {
			
			Pair cur = q.poll();
			
			if(!map.containsKey(cur.hd));
				map.put(cur.hd, cur.node.data);
				
			if(cur.node.left!=null)
				q.add(new Pair(cur.hd - 1,cur.node.left));
			
			if(cur.node.right != null)
				q.add(new Pair(cur.hd + 1, cur.node.right));

		}
		
//		ArrayList<Integer> ans = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
//			ans.add(entry.getValue());
			System.out.print(entry.getValue()+" ");
		}
		
		
//		return ans;
	}
	
public static void bottomView(Node root){
		
		Queue<Pair> q = new ArrayDeque<>();
		Map<Integer,Integer> map = new TreeMap<>();
		
		q.add(new Pair(0,root));
		
		while(!q.isEmpty()) {
			
			Pair cur = q.poll();
			
			map.put(cur.hd, cur.node.data);
				
			if(cur.node.left!=null)
				q.add(new Pair(cur.hd - 1,cur.node.left));
			
			if(cur.node.right != null)
				q.add(new Pair(cur.hd + 1, cur.node.right));

		}
		
		ArrayList<Integer> ans = new ArrayList<>();
		
		for(Map.Entry<Integer, Integer> entry :map.entrySet()) {
//			ans.add(entry.getValue());
			System.out.print(entry.getValue()+" ");
		}
		
		
//		return ans;
	}

	public static void main(String[] args) {

		bTree tree = new bTree();
		tree.add(5);
        tree.add(6);
        tree.add(9);
        tree.add(8);
        tree.add(1);
        tree.add(3);
        tree.add(2);
        tree.add(4);
        
        System.out.print("Top View of tree is : ");
        topView(tree.root);
        
        
        System.out.println();
        
        System.out.print("Bottom View of tree is : ");
        bottomView(tree.root);
        
	}
	

	static class Pair{
		int hd;
		Node node;
		
		public Pair(int hd, Node root) {
			this.node = root;
			this.hd = hd;
		}
	}

}
