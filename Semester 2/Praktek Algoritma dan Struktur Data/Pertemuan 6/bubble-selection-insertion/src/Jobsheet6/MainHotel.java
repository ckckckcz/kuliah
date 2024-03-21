package Jobsheet6;

public class MainHotel {
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Hotel A", "City A", 120000, (byte) 4);
        Hotel hotel2 = new Hotel("Hotel B", "City B", 230000, (byte) 5);
        Hotel hotel3 = new Hotel("Hotel C", "City C", 400000, (byte) 3);
        Hotel hotel4 = new Hotel("Hotel D", "City D", 150000, (byte) 2);
        Hotel hotel5 = new Hotel("Hotel E", "City E", 300000, (byte) 1);

        Hotel[] hotels = { hotel1, hotel2, hotel3, hotel4, hotel5 };

        System.out.println("Data Hotel");
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
        System.out.println("");
        System.out.println("Sorting menggunakan bubble sort");
        HotelService.bubbleSortHargaAsc(hotels);
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
        System.out.println("");
        System.out.println("Sorting menggunakan selection sort");
        HotelService.selectionSortHargaAsc(hotels);
        for (Hotel hotel : hotels) {
            System.out.println(hotel);
        }
    }
}