package designpatterns._01_creational_patterns._02_factoryㅡmethod;

public class WhiteshipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip() {
        return new Whiteship();
    }
}
