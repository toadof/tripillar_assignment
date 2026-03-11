
public class ques4{
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
           int n = arr.length;
           int target=9;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(i+" "+j);
                }
            }
        }

    }
}