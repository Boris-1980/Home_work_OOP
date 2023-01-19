package Seminar_1;

public class Juice extends Product {
    private String type;

    public Juice(int price, String name, String type) {
        super(price, name);
        this.type = type;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " Вкус " + type;
    }
    
}
