// 클래스 게시판 역할
package designpatterns._03_behavior_patterns._16_iterator;
import designpatterns._03_behavior_patterns._16_iterator.Post;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {

    // posts라는 ArrayList에 게시글을 저장하고, 가져올 수 있음
    List<Post> posts = new ArrayList<>();

        // 현재 저장된 게시글 목록을 반환
    public List<Post> getPosts() {
        return posts;
    }

        // 새로운 게시글을 생성해서 리스트에 추가
    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    // !! 기본 순회 방식(추가순)이 아닌 최신순으로 게시글을 순회할 수 있는 이터레이터 반환
    public Iterator<Post> getRecentPostIterator() {
        return new RecentPostIterator(this.posts);
    }
}

