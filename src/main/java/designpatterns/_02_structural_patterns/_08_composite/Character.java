// 확장 가능 -> 장비, 펫, 스킬 등 여러 요소 가질 수 있음
// 복합 객체 중 상위 개념

package designpatterns._02_structural_patterns._08_composite;

public class Character implements Component {

    private Bag bag;

    @Override
    public int getPrice() {
        return bag.getPrice();
    }

}
