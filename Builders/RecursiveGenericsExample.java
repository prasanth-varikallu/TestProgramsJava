package Builders;

public class RecursiveGenericsExample {

    public static void main(String[] args) {
        Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.Spinach)
                .addTopping(Pizza.Topping.Chicken)
                .build();

    }
}
