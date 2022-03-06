package febWeek3.Assignment1;

public class Question3 {

	public static void main(String[] args) {
        int nums[]={0, 1, 2, 6, 9, 11, 15};
        int lngthOne = nums.length;
        int rslt =  findFirstMissing(nums,0, lngthOne - 1);
        System.out.println("Missing number of array is "+rslt);
       

    }
   static  int findFirstMissing(int array[], int start, int end){
        if (start > end) {
            return end + 1;
        }
        if (start != array[start]) {
            return start;
        }
        int mid = (start + end) / 2;

        if (array[mid] == mid) {
            return findFirstMissing(array, mid + 1, end);
        }
        return findFirstMissing(array, start, mid);
    }

}
