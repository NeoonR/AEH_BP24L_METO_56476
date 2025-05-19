package pl.pp;

public class main {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse(
                "WH-01", 5000, "John Doe", "john@example.com", "123456789"
        );

        warehouse.addGoods(3000);
        warehouse.removeGoods(1000);
        warehouse.addGoods(2500);
        warehouse.checkOccupancy();
        warehouse.updateContact("newemail@example.com", "987654321");
    }
}
