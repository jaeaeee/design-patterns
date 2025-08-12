// 게시글 1개의 정보 담는 개체 (제목, 작성 시간)
// 단순 데이터 저장용 DTO
package designpatterns._03_behavior_patterns._16_iterator;

import java.time.LocalDateTime;

public class Post {

    private String title;               // 게시글 제목
    private LocalDateTime createdDateTime; // 작성 시간

    // 생성자: 제목과 작성 시간을 설정
    public Post(String title) {
        this.title = title;
        this.createdDateTime = LocalDateTime.now();
    }

    // getter / setter
    public String getTitle() {
        return title;
    }

    public LocalDateTime getCreatedDateTime() {
        return createdDateTime;
    }
}

