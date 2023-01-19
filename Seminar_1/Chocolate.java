package Seminar_1;

public class Chocolate extends Product {
    private String type;

    public Chocolate(int price, String name, String type) {
        super(price, name);
        this.type = type;
    }

    @Override
    public String toString() {
        
        return super.toString() + " Сорт: " + type;

            //return String.format(super.toString() + " calories: %f", this.calories); 
        }

    }



// public class Chocolade extends Product {
//     private double calories;

//     public Chocolade(String name, double cost, double calories) {
//         super(name, cost);
//         this.calories = calories;
//     }

//     @Override
//     public String toString() {
//         return String.format(super.toString() + " calories: %f", this.calories);
//     }

//     public double getCalories() {
//         return calories;
//     }
// }
