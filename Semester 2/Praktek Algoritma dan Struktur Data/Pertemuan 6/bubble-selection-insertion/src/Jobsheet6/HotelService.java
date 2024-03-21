package Jobsheet6;
public class HotelService {
    public static void bubbleSortHargaAsc(Hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            for (int j = 0; j < hotels.length - i - 1; j++) {
                if (hotels[j].getHarga() > hotels[j + 1].getHarga()) {
                    Hotel temp = hotels[j];
                    hotels[j] = hotels[j + 1];
                    hotels[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortRatingDesc(Hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            for (int j = 0; j < hotels.length - i - 1; j++) {
                if (hotels[j].getRatingBintang() < hotels[j + 1].getRatingBintang()) {
                    Hotel temp = hotels[j];
                    hotels[j] = hotels[j + 1];
                    hotels[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSortHargaAsc(Hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < hotels.length; j++) {
                if (hotels[j].getHarga() < hotels[minIndex].getHarga()) {
                    minIndex = j;
                }
            }
            Hotel temp = hotels[minIndex];
            hotels[minIndex] = hotels[i];
            hotels[i] = temp;
        }
    }

    public static void selectionSortRatingDesc(Hotel[] hotels) {
        for (int i = 0; i < hotels.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < hotels.length; j++) {
                if (hotels[j].getRatingBintang() > hotels[maxIndex].getRatingBintang()) {
                    maxIndex = j;
                }
            }
            Hotel temp = hotels[maxIndex];
            hotels[maxIndex] = hotels[i];
            hotels[i] = temp;
        }
    }
}
