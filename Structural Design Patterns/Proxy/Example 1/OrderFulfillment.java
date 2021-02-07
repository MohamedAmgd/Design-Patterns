import java.util.ArrayList;

public class OrderFulfillment implements IOrder {
    private ArrayList<Warehouse> warehouses;

    public OrderFulfillment() {
        warehouses = new ArrayList<>();
    }

    @Override
    public void fulfillOrder(Order order) {
        for (Warehouse warehouse : warehouses) {
            Order newOrder = new Order(order.getShipmentAddress());
            for (Item item : order.itemList) {
                if (warehouse.currentInventory(item) > 0) {
                    newOrder.addItem(item);
                    order.removeItem(item);
                }
            }
            warehouse.fulfillOrder(newOrder);
        }
    }

}
