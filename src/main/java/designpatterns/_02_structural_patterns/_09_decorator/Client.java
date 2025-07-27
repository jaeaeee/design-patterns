package designpatterns._02_structural_patterns._09_decorator;

public class Client {

    private final CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        commentService.addComment(comment);
    }
}
