package designpatterns._01_creational_patterns._03_abstract_factory._03_java;

import designpatterns._01_creational_patterns._02_factoryㅡmethod.Ship;
import designpatterns._01_creational_patterns._02_factoryㅡmethod.ShipFactory;

public class FactoryBeanConfig {
    public ShipFactory getShipFactory() {
        ShipFactory shipFactory = new ShipFactory() {
            @Override
            public void sendEmailTo(String email, Ship ship) {

            }

            @Override
            public Ship createShip() {
                return null;
            }
        };
        return shipFactory;
    }
}
