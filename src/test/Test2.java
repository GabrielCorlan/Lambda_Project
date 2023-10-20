package test;

import java.util.function.Function;

public class Test2 {

    static Function<Integer, String> myFunction = new Function<Integer, String>() {

        @Override
        public String apply(Integer n) {
            return String.valueOf(n);
        }
    };

    public static void main(String[] args) {
        // run someth
        String test = myMethod(99, myFunction);
    }



    public static String myMethod(int number, Function<Integer,String> function){
        return function.apply(number);
    }

}
