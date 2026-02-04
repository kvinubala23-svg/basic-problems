class Basic {
    String brand;
    int year;

   
    Basic(String b, int y) {
        brand = b;
        year = y;
    }

   
    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year);
    }
}


public class Car {
    public static void main(String[] args) {
       
        Basic s1 = new Basic("Tesla", 2022);
        Basic s2 = new Basic("BMW", 2020);

        
        s1.display();
        s2.display();
    }
}
