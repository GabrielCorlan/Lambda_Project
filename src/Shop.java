import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;

public class Shop {

    static ArrayList<Laptop> laptopuri = new ArrayList<>();

    public static void main(String[] args) {

        for (int i = 0; i < 15; i++) {
            laptopuri.add(LaptopFactory.generateLaptop());
        }

        laptopuri.sort(Comparator.comparing(l -> l.marca));
        laptopuri.sort((l1, l2) -> Integer.compare(l1.ram, l2.ram));
        laptopuri.sort((l1, l2) -> Double.compare(l1.diagonala, l2.diagonala));

        for (var laptop : laptopuri) {
            print(laptop);
        }

        printCriteriu("Laptopuri marca Dell");

        var laptopuriDell = laptopuri.stream()
                .filter(laptop -> laptop.marca.equals("Dell"))
                .filter(laptop -> laptop.diagonala > 15.0)
                .count();

        System.out.printf("Avem %d laptopuri marca Dell cu diagonala mai mare de 15 inch pe stoc%n", laptopuriDell);

        printCriteriu("Laptopuri mai ieftine de 1500 lei");

        var laptopSub1500 = laptopuri.stream()
                .anyMatch(laptop -> laptop.pret < 1500);

        System.out.print(laptopSub1500 ? "Avem " : "Nu avem ");
        System.out.println("laptopuri mai ieftine de 1500 lei pe stoc");

        printCriteriu("Preturi laptopuri Samsung");

        // Să se stocheze într-un nou array prețurile tuturor laptopurilor care sunt marca Samsung.
        var preturiSamsung = laptopuri.stream()
                .filter(laptop -> laptop.marca.equals("Samsung"))
                .map(laptop -> laptop.pret)
                .toArray();

        for(var p : preturiSamsung) System.out.print(p + " ");
        System.out.println();

//        printCriteriu("laptopuri sortate in functie de pret");
//
//        laptopuri.sort((l1, l2) -> Double.compare(l1.pret, l2.pret));
//
//        for (var laptop : laptopuri) {
//            print(laptop);
//        }

        printCriteriu("Primul laptop marca Dell");

        Optional<Laptop> primulDell = laptopuri.stream()
                .filter(laptop -> laptop.marca.equals("Dell"))
                .findFirst();

        System.out.println(primulDell);
    }
    public static void print(Laptop laptop) {
        System.out.println(laptop.toString());
    }

    public static void printCriteriu(String criteriu) {
        System.out.printf("%n>>>>>>>>>>> %s <<<<<<<<<<<%n%n", criteriu);
    }
}
