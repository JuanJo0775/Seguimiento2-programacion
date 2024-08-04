package Shipment;

public class MainShipment {
    public MainShipment() {
    }

    public static void main(String[] args) {
        Shipment shipment = new Shipment("123456", "2024-07-20", "Box", "123456789", 10.0, "Armenia", "Bogota", 10000.0, "In progress");
        System.out.println("Cost per kilo: " + shipment.calculateCostPerKilo());
        System.out.println("Has the shipment been delivered? " + shipment.checkShipment());
    }
}
