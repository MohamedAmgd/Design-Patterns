import java.util.ArrayList;

public class Order {
    public ArrayList<Item> itemList = new ArrayList<>();
    private String shipmentAddress;

    public Order(String shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public void setShipmentAddress(String shipmentAddress) {
        this.shipmentAddress = shipmentAddress;
    }

    public String getShipmentAddress() {
        return shipmentAddress;
    }

    public void addItem(Item item) {
        itemList.add(item);
    }

    public void removeItem(Item item) {
        itemList.remove(item);
    }
}
