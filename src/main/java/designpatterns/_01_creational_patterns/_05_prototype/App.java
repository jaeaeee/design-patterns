package designpatterns._01_creational_patterns._05_prototype;

public class App {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        repository.setUser("Keesun");

        System.out.println(clone != githubIssue);
        System.out.println(clone.equals(githubIssue));
        System.out.println(clone.getClass() == githubIssue.getClass());
        System.out.println(clone.getRepository() == githubIssue.getRepository());

        System.out.println(clone.getUrl());
    }
}
/*
    clone()은 Object 클래스에 정의된 protected 메서드
    clone != githubIssue         // true : 서로 다른 인스턴스 (== 주소 다름)
    clone.equals(githubIssue)    // true : 내부 상태 같음 (equals() 오버라이딩 시)
    clone.getClass() == githubIssue.getClass() // true : 동일한 클래스에서 만들어짐
 */