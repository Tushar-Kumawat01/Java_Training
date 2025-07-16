package assignments.tollboothassignment;


public class TollBoothTest {

    public static void main(String[] args) {
        // instance of the tollbooth
        ITollBooth booth = new AlleghenyTollBooth();

        // instances of trucks
        ITruck ford = new FordTruck(5, 12500);
        ITruck nissan = new NissanTruck(2, 5000);
        ITruck daewoo = new DaewooTruck(6, 17000);

        // truck arrivals and toll calculation
        booth.calculateToll(ford);
        booth.calculateToll(nissan);
        booth.calculateToll(daewoo);

        // collecting the receipts and resetting the booth
        booth.collectReceipts();
    }
}

