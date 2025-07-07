package designpatterns._01_creational_patterns._03_abstract_factory;

import designpatterns._01_creational_patterns._02_factoryㅡmethod.DefaultShipFactory;
import designpatterns._01_creational_patterns._02_factoryㅡmethod.Ship;
import designpatterns._01_creational_patterns._02_factoryㅡmethod.Whiteship;

public class WhiteshipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteshipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new Whiteship();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
