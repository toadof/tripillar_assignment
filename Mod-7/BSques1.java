public class BSques1{
	public static void main(String[] args) {
		int arr[]={3,5,10,15,30,78};
		int target=30;
		int l=0;
		int h=arr.length-1;
		while(l<h){
			int mid=l+(h-l)/2;
			if(arr[mid]>target){
				h=mid-1;
			}
			else if(arr[mid]==target){
				System.out.print("FOUIND AT:"+mid);
				return;
			}
			else
				l=mid+1;
		}
		System.out.print("Not found");

	}
}