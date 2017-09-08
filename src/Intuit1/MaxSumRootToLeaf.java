package Intuit1;

public class MaxSumRootToLeaf {

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
		System.out.println(maximumSum(root));
	}

	private static int maximumSum(TreeNode root) {
		if(root==null){
			return 0;
		}
		int leftSum = maximumSum(root.left);
		
		int rightSum = maximumSum(root.right);
		return (leftSum > rightSum ? leftSum: rightSum)+ root.data;
	}
}
