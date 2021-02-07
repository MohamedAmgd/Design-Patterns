import java.util.Hashtable;

public class Warehouse implements IOrder {

    private Hashtable<String, Integer> stock;
    private String address;

    public Warehouse(String address) {
        this.address = address;
        stock = new Hashtable<>();
    }

    public String getAddress() {
        return address;
    }

    @Override
    public void fulfillOrder(Order order) {
        for (Item item : order.itemList) {
            stock.replace(item.sku, stock.get(item.sku).intValue() - 1);
        }
        // Process the order for shipment and delivery
    }

    public int currentInventory(Item item) {
        if (stock.containsKey(item.getSKU())) {
            return stock.get(item.getSKU()).intValue();
        }
        return 0;
    }

}
