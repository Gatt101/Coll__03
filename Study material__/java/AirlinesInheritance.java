import java.util.*;

class Airlines {
    private int ID_number;
    private String name;
    private String address;
    private String contact;
    private String email;
    public double frequentFlyerPoints;

    public Airlines(int ID_number, String name, String address, String contact, String email) {
        this.ID_number = ID_number;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.frequentFlyerPoints = 0;
    }

    public void Airlines_member() {
        System.out.println("Member Number: " + ID_number);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Mobile Number: " + contact);
        System.out.println("Initial FrequentFlyer Points: " + frequentFlyerPoints);
    }
}

class Domestic_Flights extends Airlines {
    public Domestic_Flights(int ID_number, String name, String address, String contact, String email) {
        super(ID_number, name, address, contact, email);
    }

    public void displayAvailableFlights() {
        System.out.println("Available Domestic Flights: Flight 1, Flight 2, Flight 3, ...");
    }

    public double calculateCost(int numberOfSeats) {
        double seatCost = 1000;
        double c = seatCost / 100;
        frequentFlyerPoints = c;
        System.out.println("New Flyyer Points:" + frequentFlyerPoints);
        return seatCost * numberOfSeats;
    }
}

class International_Flights extends Airlines {
    public International_Flights(int ID_number, String name, String address, String contact, String email) {
        super(ID_number, name, address, contact, email);
    }

    public void displayAvailableFlights() {
        System.out.println("Available International Flights: Flight A, Flight B, Flight C, ...");
    }

    public double calculateCost(int numberOfSeats) {
        double seatCost = 2000;
        double c = seatCost / 100;
        frequentFlyerPoints = c;
        System.out.println("New Flyyer Points:" + frequentFlyerPoints);
        return seatCost * numberOfSeats;
    }
}

public class AirlinesInheritance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Domestic_Flights domesticFlight = new Domestic_Flights(101, "MR x", "vcet vasai", "9876543210",
                "xmenorigins@example.com");
        domesticFlight.Airlines_member();
        domesticFlight.displayAvailableFlights();
        int numberOfSeats = 3;
        double cost = domesticFlight.calculateCost(numberOfSeats);
        System.out.println("Cost for " + numberOfSeats + " seats: Rs. " + cost);

        International_Flights internationalFlight = new International_Flights(201, "Jada", "456 Elm St",
                "9876543211", "jada@example.com");
        internationalFlight.Airlines_member();
        internationalFlight.displayAvailableFlights();
        numberOfSeats = 2;
        cost = internationalFlight.calculateCost(numberOfSeats);
        System.out.println("Cost for " + numberOfSeats + " seats: Rs. " + cost);
        scanner.close();
    }
}
