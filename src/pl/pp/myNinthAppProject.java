package pl.pp;

public class myNinthAppProject {
    private String warehouseNumber;
    private int totalSpace;
    private int occupiedSpace;
    private String ownerName;
    private String ownerEmail;
    private String ownerPhone;

    // Constructor
    public myNinthAppProject(String warehouseNumber, int totalSpace, String ownerName, String ownerEmail, String ownerPhone) {
        this.warehouseNumber = warehouseNumber;
        this.totalSpace = totalSpace;
        this.ownerName = ownerName;
        this.ownerEmail = ownerEmail;
        this.ownerPhone = ownerPhone;
        this.occupiedSpace = 0;
    }

    // Getters and Setters
    public String getWarehouseNumber() { return warehouseNumber; }
    public void setWarehouseNumber(String warehouseNumber) { this.warehouseNumber = warehouseNumber; }

    public int getAvailableSpace() { return totalSpace - occupiedSpace; }

    public String getOwnerName() { return ownerName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }

    public String getOwnerEmail() { return ownerEmail; }
    public void setOwnerEmail(String ownerEmail) { this.ownerEmail = ownerEmail; }

    public String getOwnerPhone() { return ownerPhone; }
    public void setOwnerPhone(String ownerPhone) { this.ownerPhone = ownerPhone; }

    // Core methods
    public void addGoods(int amount) {
        if (amount <= getAvailableSpace()) {
            occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + getAvailableSpace() + " units.");
        } else {
            System.out.println("Cannot add " + amount + " units. Only " + getAvailableSpace() + " units available.");
        }
    }

    public void removeGoods(int amount) {
        if (amount <= occupiedSpace) {
            occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + getAvailableSpace() + " units.");
        } else {
            System.out.println("Cannot remove " + amount + " units. Only " + occupiedSpace + " units are stored.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + getAvailableSpace() + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        setOwnerEmail(newEmail);
        setOwnerPhone(newPhone);
        System.out.println("Updated owner contact: Email = " + newEmail + ", Phone = " + newPhone);
    }
}