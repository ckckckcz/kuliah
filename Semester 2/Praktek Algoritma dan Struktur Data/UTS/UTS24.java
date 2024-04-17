import java.util.Arrays;
import java.util.Scanner;

public class UTS24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {35, 45, 42, 32, 26, 48, 50, 4, 30, 38, 10, 48, 40, 20, 22, 24, 14};

        while (true) {
            System.out.println("\nPilihan Metode :");
            System.out.println("1. Pencarian");
            System.out.println("2. Pengurutan");
            System.out.println("3. Keluar");
            System.out.print("Pilih Metode : ");
            int Pilihan = scanner.nextInt();

            switch (Pilihan) {
                case 1:
                    Pencarian(arr);
                    break;
                case 2:
                    Pengurutan(arr);
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("Terima kasih!");
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    public static void Pencarian(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.println("Data :");
        System.out.println(Arrays.toString(arr));
        System.out.print("\nMasukkan nilai yang ingin dicari : ");
        int nilai = scanner.nextInt();
    
        int[] arrAscending = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrAscending);
    
        int[] arrDescending = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arrDescending);
        pergantianArray(arrDescending);
    
        int indexBeforeSort = Pencarian.binarySearch2(arr, nilai);
        int indexAfterSortAscending = Pencarian.binarySearch(arrAscending, nilai, true);
        int indexAfterSortDescending = Pencarian.binarySearch(arrDescending, nilai, false);
        
        System.out.println("");
        if (indexBeforeSort != -1) {
            System.out.println("Index sebelum pengurutan: " + indexBeforeSort);
        } else {
            System.out.println("Data yang dicari tidak ada");
        }
        System.out.println("");

        if (indexAfterSortAscending != -1) {
            System.out.println("Index setelah pengurutan dengan ascending : " + indexAfterSortAscending);
            System.out.println(Arrays.toString(arrAscending));
        } else {
            System.out.println("Data yang dicari tidak ada");
        }
        System.out.println("");

        if (indexAfterSortDescending != -1) {
            System.out.println("Index setelah pengurutan dengan descending : " + indexAfterSortDescending);
            System.out.println(Arrays.toString(arrDescending));
        } else {
            System.out.println("Data yang dicari tidak ada");
        }
    }
    
    public static void pergantianArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
    
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    

    public static void Pengurutan(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPilihan Pengurutan:");
        System.out.println("1. Ascending");
        System.out.println("2. Descending");
        System.out.print("Pilih Pengurutan: ");
        int sortChoice = scanner.nextInt();

        switch (sortChoice) {
            case 1:
                int[] arrAscending = Arrays.copyOf(arr, arr.length);
                Pengurutan.selectionSortAscending(arrAscending);
                System.out.println("\nData setelah pengurutan dengan ascending :");
                System.out.println(Arrays.toString(arrAscending));
                break;
            case 2:
                int[] arrDescending = Arrays.copyOf(arr, arr.length);
                Pengurutan.selectionSortDescending(arrDescending);
                System.out.println("\nData setelah pengurutan dengan descending :");
                System.out.println(Arrays.toString(arrDescending));
                break;
            default:
                System.out.println("Pilihan tidak diketahui.");
        }
    }
}
