package Intuit1;

public class GivenSumRootToLeaf {

	public static void main(String args[]){
		
		TreeNode root= new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.right.left=new TreeNode(5);
		root.right.left.left=new TreeNode(7);
		root.right.left.right=new TreeNode(9);
		root.right.right=new TreeNode(6);
		root.right.right.right=new TreeNode(5);
		root.left.left=new TreeNode(8);
		root.left.right=new TreeNode(4);
		root.left.right.left=new TreeNode(10);
		int sum=14;
		System.out.println(maximumSum(root,sum));
	}

	private static boolean maximumSum(TreeNode root,int sum) {
		if(sum==0){
			return true;
		}
		if(root==null){
			return false;
		}
		boolean left = maximumSum(root.left,sum-root.data);
		
		boolean right = maximumSum(root.right,sum-root.data);
		
		if(left|| right){
			System.out.print(root.data+" ");
		}
		
		return left || right;
	}
}
