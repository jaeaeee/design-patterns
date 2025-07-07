package designpatterns._01_creational_patterns._02_factoryㅡmethod.java;

import designpatterns._01_creational_patterns._02_factoryㅡmethod.Blackship;
import designpatterns._01_creational_patterns._02_factoryㅡmethod.Whiteship;

public class SimpleFactory {

    public Object createProduct(String name) {
        if (name.equals("whiteship")) {
            return new Whiteship();
        } else if (name.equals("blackship")) {
            return new Blackship();
        }

        throw new IllegalArgumentException();
    }
}
