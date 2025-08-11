package designpatterns._03_behavior_patterns._15_interpreter;

import java.util.Map;

public interface PostfixExpression {

    int interpret(Map<Character, Integer> context);

}
