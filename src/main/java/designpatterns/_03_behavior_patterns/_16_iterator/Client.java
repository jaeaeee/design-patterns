package designpatterns._03_behavior_patterns._16_iterator;

import designpatterns._03_behavior_patterns._16_iterator.Post;

import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        Board board = new Board();
        // 게시글 3개 등록
        board.addPost("디자인 패턴 게임");
        board.addPost("선생님, 저랑 디자인 패턴 하나 학습하시겠습니까?");
        board.addPost("지금 이 자리에 계신 여러분들은 모두 디자인 패턴을 학습하고 계신 분들입니다.");

        // [1] 기본 ArrayList순회 - 입력한 순서 그대로 출력됨
        List<Post> posts = board.getPosts(); // 리스트 그대로 가져오기
        for (int i = 0 ; i < posts.size() ; i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        // [2] 최신순 이터레이터 사용 - 최신 글 먼저 출력
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while(recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }
}// !! 순회 방식이 달라도 hasNext() / next() 호출 방식은 동일
