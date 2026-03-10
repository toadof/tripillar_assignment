public class ques3{
	public static void main(String[] args) {
		int a[]={5,6,1,2,3};
		int target=6;
		int n=a.length;
		int start=0;
		for(int i=1;i<n;i++){
			if(a[i]<a[start])
				start=i;
		}
		for(int i=0;i<n;i++){
			if(target==a[i%5])
				System.out.print("Found at:"+i%5);
		}
	}
}