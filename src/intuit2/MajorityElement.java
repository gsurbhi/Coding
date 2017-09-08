package intuit2;

public class MajorityElement {
	
	public static void main(String args[]){
		
		int arr[] = {2,3,1,0,1,4};
		int count=0,result=0;
		for(int i=0;i<arr.length;i++){
			if(count==0){
				result = arr[i];
				count=1;
			}
			else if(arr[i]==result){
				count++;
			}
			else{
				count --;
			}
		}
		System.out.println(result);
	}
}
