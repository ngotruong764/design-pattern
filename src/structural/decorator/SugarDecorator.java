package structural.decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String description() {
        return coffee.description() + ", Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 0.5;
    }
}
