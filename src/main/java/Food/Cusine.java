package Food;

import java.util.*;

public class Cusine {

    public static String Polish = "Polish";
    public static String Italian = "Italian";
    public static String Mexican = "Mexican";


    ArrayList<String> nameOfCusine = new ArrayList<String>();


    public Cusine(ArrayList<String> nameOfCusine) {
        super();
        this.nameOfCusine = nameOfCusine;
    }

    public ArrayList<String> getNameOfCusine() {
        return nameOfCusine;
    }

    public void setNameOfCusine(ArrayList<String> nameOfCusine) {
        this.nameOfCusine = nameOfCusine;
    }
}
