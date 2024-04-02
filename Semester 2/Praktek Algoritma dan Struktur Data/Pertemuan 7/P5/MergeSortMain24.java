package P5;
public class MergeSortMain24 {
    public static void main(String[] args) {
        int data[] = {10,40,30,50,70,20,100,90};
        System.out.println("Sorting menggunakan Merge Sort");
        MergeSorting24 mSort = new MergeSorting24();
        System.out.println("Data awal ");
        mSort.printArray(data);
        mSort.mergeSort(data);
        System.out.println("Setelah Diurutkan");
        mSort.printArray(data);
    }
}
