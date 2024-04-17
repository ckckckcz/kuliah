public class Pencarian {
    public static int binarySearch2(int[] arr, int nilai) {
        int left = 0;
        int right = arr.length - 1;
    
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == nilai) {
                return mid;
            } else {
                if (arr[left] == nilai) {
                    return left;
                }
                if (arr[right] == nilai) {
                    return right;
                }
                left++;
                right--;
            }
        }
        return -1;
    }
    
    
    // Fungsi Pencarian Setelah sudah menjalankan pengurutan ascending dan descending
    public static int binarySearch(int[] arr, int nilai, boolean ascending) {
        int left = 0;
        int right = arr.length - 1;
    
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == nilai) {
                return mid;
            } else if (ascending ? (arr[mid] < nilai) : (arr[mid] > nilai)) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
    
        return -1;
    }
}
