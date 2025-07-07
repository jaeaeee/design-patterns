package designpatterns._01_creational_patterns._03_abstract_factory._01_before;

import designpatterns._01_creational_patterns._02_factoryㅡmethod.DefaultShipFactory;
import designpatterns._01_creational_patterns._02_factoryㅡmethod.Ship;
import designpatterns._01_creational_patterns._02_factoryㅡmethod.Whiteship;
import designpatterns._01_creational_patterns._03_abstract_factory.Wheel;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(new WhiteAnchor());
        ship.setWheel(new WhiteWheel());
        return ship;
    }
}
