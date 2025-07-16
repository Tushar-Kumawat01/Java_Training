 package assignments.tollboothassignment;

/**
 * AlleghenyTollBooth.java
 * An implementation of the TollBooth interface. This class manages the
 * financial and traffic data for a specific tollbooth.
 */
public class AlleghenyTollBooth implements ITollBooth {

	private int totalReceipts;
	private int truckCount;

	// Constructor initializes the totals to zero.

	public AlleghenyTollBooth() {
		this.totalReceipts = 0;
		this.truckCount = 0;
	}

	/**
	 * Calculates the toll for an arriving truck and updates the booth's totals.
	 * Toll is $5 per axle + $10 per half-ton (500 kg).
	 * iTruck The truck for which to calculate the toll.
	 */
	@Override
	public void calculateToll(ITruck iTruck) {
		int axles = iTruck.getAxles();
		int weight = iTruck.getWeight();

		int tollDue = (axles * 5) + ((weight / 500) * 10);

		totalReceipts += tollDue;
		truckCount++;

		System.out.println("Arrival of " + iTruck.getMake() + " Truck");
		System.out.println("Truck arrival - Axles: " + axles + " Total weight: " + weight + " Toll due: $" + tollDue);
		System.out.println(); 
	}

	// Displays the current totals without resetting them.
	@Override
	public void displayData() {
		System.out.println("Totals since last collection - Receipts: $" + totalReceipts + " Trucks: " + truckCount);
		System.out.println(); 
	}

	//Displays the totals and then resets them to zero.
	@Override
	public void collectReceipts() {
		System.out.println("*** Collecting receipts ***");
		displayData();

		// Resetting the totals
		System.out.println("******** Reset Reciepts**********");
		this.totalReceipts = 0;
		this.truckCount = 0;
		displayData(); // Display the reset totals
	}
}

