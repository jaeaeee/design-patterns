package designpatterns._01_creational_patterns._03_abstract_factory;

import designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteAnchor;
import designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteWheel;

public class WhiteshipPartsFactory implements ShipPartsFactory {

    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
