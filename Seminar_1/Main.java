package Seminar_1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(new Product(15, "Молоко"));
        vendingMachine.addProduct(new Product(20,"Хлеб"));
        vendingMachine.addProduct(new Product(42,"Масло Крестьянское"));
        vendingMachine.addProduct(new Chocolate(50,"Шоколад Аленка","Молочный с орехами"));

        for (Product item: vendingMachine.getProducts()) {
            System.out.println(item);
        }

        // Product found = vendingMachine.find("Хлеб");
        // System.out.println(found);

    }

}
    

