package org.Juggling;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        ValidPattern vp = new ValidPattern();

        String pattern = "513";

        System.out.println(vp.isValidPattern(pattern));

    }
}