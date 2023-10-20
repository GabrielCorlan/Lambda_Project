package test;

import java.util.function.Supplier;

public class Test {

    static Supplier<String> passwordSupplier = new Supplier<String>() {
        @Override
        public String get() {
            return "correctPassword";
        }
    };

    public static void main(String[] args) {
        connectToDatabase("wrongInput", passwordSupplier); // Parola incorecta
        connectToDatabase("correctPassword", passwordSupplier);
    }



    public static void connectToDatabase(String inputPassword, Supplier<String> dbPassword){
        if(inputPassword.equals(dbPassword.get())){
            System.out.println("V-ati conectat la baza de date");
        }else{
            System.out.println("Parola incorecta");
        }
    }
}
