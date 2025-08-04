package designpatterns._02_structural_patterns._11_flyweight;

// 불변 클래스. 같은 폰트면 한 번만 생성됨
public final class Font {

    final String family;
    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }

    public String getFamily() {
        return family;
    }
    public int getSize() {
        return size;
    }
}
