package designpatterns._02_structural_patterns._08_composite;

import java.util.ArrayList;
import java.util.List;

public class Bag implements Component {

    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public int getPrice() {
        return components.stream() // 리스트를 스트림 형태로 바꿈
                .mapToInt(Component::getPrice) // 각 구성요소의 getPrice() 호출 -> 재귀 호출
//              .mapToInt(c -> c.getPrice()) // 스트림 요소들 int 변환해주는 메서드
                .sum();
    }
//    int total = 0;
//    for (Component c : components) {
//        total += c.getPrice(); // Item이면 그냥 가격, Bag이면 또 getPrice() (재귀)
//    }
//    return total;

}
