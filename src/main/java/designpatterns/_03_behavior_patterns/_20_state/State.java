package designpatterns._03_behavior_patterns._20_state;

public interface State {

    void addReview(String review, Student student);

    void addStudent(Student student);
}
