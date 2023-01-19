package Seminar_1;

public class Eggs extends Product {
    private int piece;

    public Eggs(int price,String name, int piece){
    super(price, name);
    this.piece = piece;
    }   

    @Override
    public String toString() {
        return super.toString() + " штук " + piece;
    }
}

