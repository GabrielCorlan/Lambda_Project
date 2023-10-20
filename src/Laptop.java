public class Laptop {

    static int counterId = 0;

    int ram, id;
    String marca, procesor;
    double diagonala, pret;

    public Laptop(int ram, String marca, String procesor, double diagonala, double pret) {
        ++counterId;
        id = counterId;
        this.ram = ram;
        this.marca = marca;
        this.procesor = procesor;
        this.diagonala = diagonala;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", ram=" + ram +
                ", marca='" + marca + '\'' +
                ", procesor='" + procesor + '\'' +
                ", diagonala=" + diagonala +
                ", pret=" + pret +
                '}';
    }
}
