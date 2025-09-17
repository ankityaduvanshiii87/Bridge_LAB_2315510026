package Inheritence.Multilevel_Inheritance;

class Order {
    int orderId;
    String orderDate;
    Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    String getOrderStatus() {
        return "Order placed";
    }
}
class ShippedOrder extends Order {
    String trackingNumber;
    ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    String getOrderStatus() {
        return "Order shipped, Tracking: " + trackingNumber;
    }
}
class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    String getOrderStatus() {
        return "Order delivered on " + deliveryDate;
    }
}
public class Online_Retail_Order_Management {
    public static void main(String[] args) {
        Order o = new Order(100, "2025-09-16");
        ShippedOrder s = new ShippedOrder(101, "2025-09-16", "ABC123");
        DeliveredOrder d = new DeliveredOrder(102, "2025-09-16", "XYZ789", "2025-09-18");
        System.out.println(o.getOrderStatus());
        System.out.println(s.getOrderStatus());
        System.out.println(d.getOrderStatus());
    }
}

