package designpatterns._01_creational_patterns._02_factoryㅡmethod;

public class BlackshipFactory extends DefaultShipFactory {
    public Ship createShip() {
        return new Whiteship();
    }
}
