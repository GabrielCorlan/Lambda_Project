import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class LaptopFactory {

    static ArrayList<String> marci = new ArrayList<>(Arrays.asList("Dell", "Asus", "Toshiba", "Lenovo", "HP", "Samsung", "Samsung"));
    static ArrayList<String> procesoare = new ArrayList<>(Arrays.asList("Pentium", "Athlon", "AMD Ryzen 5", "AMD Ryzen 3", "Intel i5", "Intel i3", "Dual Core"));
    static ArrayList<Integer> rami = new ArrayList<>(Arrays.asList(4, 8, 16, 12, 24, 32, 2));
    static ArrayList<Double> diagonale = new ArrayList<>(Arrays.asList(11.5, 13.3, 14.6, 17.3, 19.1, 15.4, 12.2));
    static ArrayList<Double> preturi = new ArrayList<>(Arrays.asList(1239.99, 1599.99, 2199.99, 2459.99, 1649.99, 3500.0, 3129.99));


    public static Laptop generateLaptop() {
        Random rnd = new Random();
        return new Laptop(
                rami.get(rnd.nextInt(rami.size())),
                        marci.get(rnd.nextInt(marci.size())),
                                procesoare.get(rnd.nextInt(procesoare.size())),
                                        diagonale.get(rnd.nextInt(diagonale.size())),
                                                preturi.get(rnd.nextInt(preturi.size()))
                                                );
    }
}
