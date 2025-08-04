package designpatterns._02_structural_patterns._11_flyweight;

public class Character {

    private char value;
    private String color;
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value; // 외부 상태 : 이 값들은 문자마다 다르기 때문에 공유하지 않음
        this.color = color; // 외부 상태
        this.font = font;   // 내부 상태 (공유 객체) : 같은 "nanum:12"라면 여러 문자끼리 공유할 수 있음

    }

    public Font getFont() {
        return this.font;
    }
}