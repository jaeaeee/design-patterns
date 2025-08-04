package designpatterns._02_structural_patterns._11_flyweight;

import java.util.HashMap;
import java.util.Map;

// 플라이웨이트 객체(Font)를 생성하고 캐싱해서 공유하는 팩토리
// 동일한 key("nanum:12")로 요청이 들어오면 기존 객체를 반환해 재사용
public class FontFactory {

    private Map<String, Font> cache = new HashMap<>();

    // key 형식: "폰트이름:사이즈" -> ex) "nanum:12"
    public Font getFont(String font) {
        if (cache.containsKey(font)) {
            return cache.get(font); // 이미 있다면 기존 객체 재사용
        } else {
            String[] split = font.split(":");
            Font newFont = new Font(split[0], Integer.parseInt(split[1]));
            cache.put(font, newFont); // 새로 만들고 캐시에 저장
            return newFont;
        }
    }
}