package Food;

import OrderSystem.FoodInterface;

import java.math.BigDecimal;

public class Drink implements FoodInterface {

    public int iceCube;

    public int getIceCube() {
        return iceCube;
    }

    public Drink(int iceCube) {
        this.iceCube = iceCube;
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public BigDecimal getPrice() {
        return null;
    }
}

