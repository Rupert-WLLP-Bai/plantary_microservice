package edu.tongji.plantary.circle.service;

import edu.tongji.plantary.circle.entity.Comment;
import edu.tongji.plantary.circle.entity.Post;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

public interface PostService {
    //获取所有的post
    List<Post> getAllPosts();

    Optional<Post> addPost(Post post);

    Optional<Post> deletePost(String postID);

    Optional<Comment> addComment(String postID,Comment comment);

    List<Comment> getCommentByPostID(String postID);

    List<Post> getPostByPosterPhone(String posterPhone);

}