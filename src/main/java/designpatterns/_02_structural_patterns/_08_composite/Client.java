package designpatterns._02_structural_patterns._08_composite;


public class Client {

    public static void main(String[] args) {
        Item doranBlade = new Item("도란검", 450);
        Item longsword = new Item("롱소드", 350);
        Item healPotion = new Item("체력 물약", 50);
        Item manaPotion = new Item("마나 물약", 70);

        // 서브 가방
        Bag subBag = new Bag();
        subBag.add(healPotion);
        subBag.add(manaPotion);

        Bag mainBag = new Bag();
        mainBag.add(doranBlade);
        mainBag.add(longsword);
        mainBag.add(subBag);


        Client client = new Client();
        client.printPrice(doranBlade);
        client.printPrice(longsword);

        client.printPrice(healPotion);
        client.printPrice(manaPotion);

        client.printPrice(subBag);
        client.printPrice(mainBag);
    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }


}
