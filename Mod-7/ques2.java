public class ques2{
	public static void main(String[] args) {
		int[] arr = {1, 3, 5, 5, 5, 5, 67, 123, 125};
        int target = 5;
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low+(high-low)/2;
            if (arr[mid] == target) {
                result = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("last ccurrence: " +result);
	}
}