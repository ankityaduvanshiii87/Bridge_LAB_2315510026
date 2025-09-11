package Java_class_and_object.Level_1;

public class MobilePhone {
    String brand;
    String model;
    double price;

    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayMobile() {
        System.out.println("Brand of mobile: " + brand);
        System.out.println("Model of mobile: " + model);
        System.out.println("Price of mobile: " + price);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        MobilePhone mobile1 = new MobilePhone("VIVO", "VIVO V29", 15999);
        MobilePhone mobile2 = new MobilePhone("ONE PLUS", "ONE PLUS Nord 4", 39999);
        MobilePhone mobile3 = new MobilePhone("APPLE", "iPhone Pro 16", 79999);

        mobile1.displayMobile();
        mobile2.displayMobile();
        mobile3.displayMobile();
    }
}
