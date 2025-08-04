package designpatterns._02_structural_patterns._11_flyweight;

public class Client {

    public static void main(String[] args) {
        FontFactory fontFactory = new FontFactory();
        Character c1 = new Character('h', "white", fontFactory.getFont("nanum:12"));
        Character c2 = new Character('e', "white", fontFactory.getFont("nanum:12"));
        Character c3 = new Character('l', "white", fontFactory.getFont("nanum:12"));

        Character c4 = new Character('o', "white", fontFactory.getFont("arial:14"));

        System.out.println("c1과 c2의 Font 공유 여부: " + (c1.getFont() == c2.getFont()));
        System.out.println("c1과 c4의 Font 공유 여부: " + (c1.getFont() == c4.getFont()));
    }
}