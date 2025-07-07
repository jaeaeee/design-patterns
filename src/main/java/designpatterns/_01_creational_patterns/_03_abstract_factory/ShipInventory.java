package designpatterns._01_creational_patterns._03_abstract_factory;

import designpatterns._01_creational_patterns._02_factoryㅡmethod.Ship;
import designpatterns._01_creational_patterns._02_factoryㅡmethod.ShipFactory;

public class ShipInventory {

    public static void main(String[] args) {
        ShipFactory shipFactory = new WhiteshipFactory(new WhiteshipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getWheel().getClass());
    }
}

