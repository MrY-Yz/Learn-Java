import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(toString(arr));
        System.out.println(toString(arrayCopy(arr)));
        System.out.println("最大值是：" + max(arr));
        System.out.println("平均值是：" + avg(arr));
        System.out.println("4在数组中的位置是:" + search(arr,4));
        System.out.println("二分查找4的位置:" + binarySearch(arr,4));

        int[] a = {1,5,3,7};
        bubbleSort(a);
        System.out.println(Arrays.toString(a));

        transform(arr);
        System.out.println(Arrays.toString(arr));
    }

     public static String toString(int[] arr){ //数组转字符串
         String str = "[";
         for (int i = 0; i < arr.length; i++){
              str += arr[i];
              if (i < arr.length - 1){
                  str += ", ";
              }
         }
         str += "]";
         return str;
     }

    public static int[] arrayCopy(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0;i < arr.length; i++){
            ret[i] = arr[i];
        }
        return ret;
    }

    public static int max(int[] arr){
        int max = arr[0];
        int tmp = 0;
        for (int i = 1;i < arr.length;i++){
            if( max < arr[i] ){
                tmp = max;
                max = arr[i];
            }
        }
        return max;
    }

    public static double avg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length;i++){
            sum += arr[i];
        }
        return (double)sum / arr.length;
    }

    public static int search(int[] arr,int toFind){
        for(int i = 0;i < arr.length; i++){
            if(arr[i] == toFind){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
                right = mid - 1;
            } else if (toFind > arr[mid]) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void bubbleSort(int[] arr){
        for(int bound = 0;bound < arr.length;bound++){
            for(int cur = arr.length - 1;cur > bound ;cur--){
                if(arr[cur] < arr[cur - 1]){
                    int tmp = arr[cur];
                    arr[cur] = arr[cur - 1];
                    arr[cur - 1] = tmp;
                }
            }
        }
    }

    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            // 该循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
            // 该循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}
