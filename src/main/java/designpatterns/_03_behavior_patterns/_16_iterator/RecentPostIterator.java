package designpatterns._03_behavior_patterns._16_iterator;

import designpatterns._03_behavior_patterns._16_iterator.Post;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// 최신순으로 정렬된 게시글 리스트를 순회하는 역할
public class RecentPostIterator implements Iterator<Post> {

        // 내부적으로 실제 사용할 이터레이터
    private Iterator<Post> internalIterator;

    //생성자에서 Collections.sort()를 사용해 최신순 정렬을 하고,
    //내부적으로 기본 ArrayList 이터레이터를 internalIterator로 감싸서 사용
    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts,
                (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        this.internalIterator = posts.iterator();
    }
    // hasNext()와 next()를 그대로 제공하니, 외부에서는 그냥 이 메서드만 호출하면 됨
    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return this.internalIterator.next();
    }
}
//이렇게 하면 순회 방식은 최신순이지만, 사용하는 방법은 일반 이터레이터랑 동일
// 외부에서는 같은 코드로 똑같이 순회할 수 있음