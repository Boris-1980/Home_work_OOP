package Seminar_1;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine(new Product(15, "Молоко"));
        vendingMachine.addProduct(new Product(20,"Хлеб"));
        vendingMachine.addProduct(new Product(42,"Масло Крестьянское"));
        vendingMachine.addProduct(new Chocolate(50,"Шоколад Аленка","Молочный с орехами"));
        vendingMachine.addProduct(new Juice(12, "Сок", "Яблочный"));
        vendingMachine.addProduct(new Eggs(9,"Яйца куриные", 12));

        for (Product item: vendingMachine.getProducts()) {
            System.out.println(item);
        }

        // Product found = vendingMachine.find("Хлеб");
        // System.out.println(found);

    }

}
    

