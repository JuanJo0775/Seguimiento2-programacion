package Shipment;

public class Shipment {
    private String guideNumber;
    private String date;
    private String typePackaging;
    private String idClient;
    private double weight;
    private String hometown;
    private String cityDestination;
    private double cost;
    private String shipmentStatus;

    public Shipment(String guideNumber, String date, String typePackaging, String idClient, double weight, String hometown, String cityDestination, double cost, String shipmentStatus) {
        this.guideNumber = guideNumber;
        this.date = date;
        this.typePackaging = typePackaging;
        this.idClient = idClient;
        this.weight = weight;
        this.hometown = hometown;
        this.cityDestination = cityDestination;
        this.cost = cost;
        this.shipmentStatus = shipmentStatus;
    }

    public String getGuideNumber() {

        return this.guideNumber;
    }

    public void setGuideNumber(String guideNumber) {
        this.guideNumber = guideNumber;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTypePackaging() {
        return this.typePackaging;
    }

    public void setTypePackaging(String typePackaging) {
        this.typePackaging = typePackaging;
    }

    public String getIdClient() {
        return this.idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getHometown() {
        return this.hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getCityDestination() {
        return this.cityDestination;
    }

    public void setCityDestination(String cityDestination) {
        this.cityDestination = cityDestination;
    }

    public double getCost() {
        return this.cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getShipmentStatus() {
        return this.shipmentStatus;
    }

    public void setShipmentStatus(String shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public double calculateCostPerKilo() {
        return this.cost / this.weight;
    }

    public boolean checkShipment() {
        return this.shipmentStatus.equalsIgnoreCase("Delivered");
    }

    public String toString() {
        return "Shipment{guideNumber='" + this.guideNumber + "', date='" + this.date + "', typePackaging='" + this.typePackaging + "', idClient='" + this.idClient + "', weight=" + this.weight + ", hometown='" + this.hometown + "', cityDestination='" + this.cityDestination + "', cost=" + this.cost + ", shipmentStatus='" + this.shipmentStatus + "'}";
    }
}
