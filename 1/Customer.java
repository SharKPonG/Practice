import java.util.Scanner;

// Main Class
class Customer {
    protected String name;
    protected int age;
    protected int point;

    Customer(String name, int age, int point){
        this.name = name;
        this.age = age;
        this.point = point; 
    }
}

// Sub Class
class Order extends Customer {
    private double totalPrice = 0.0;

    public Order(String name, int age, int point) {
        super(name, age, point);
    }


    public void inputItems() {
        Scanner in = new Scanner(System.in);
        int itemCount = in.nextInt();

        for (int i = 1; i <= itemCount; i++) {
            double price = in.nextDouble();
            totalPrice += price;
        }
    }


    public double calculatedTotalProductPrice() {
        double discountedPrice = totalPrice;

        if (age >= 60) {
            discountedPrice *= 0.90; // ลด 10%
        }

        if (point >= 100) {
            discountedPrice *= 0.95; // ลดเพิ่มอีก 5%
        }

        return discountedPrice;
    }

    // Main
    public static void main(String[] args) {
        Order o = new Order("Sharkpong", 60, 100); 

        o.inputItems();  
        double finalPrice = o.calculatedTotalProductPrice();
        System.out.println(finalPrice);
    }
}
