package com.upgrad.ImageHoster.service;

import com.upgrad.ImageHoster.model.Comment;

import java.util.List;

public interface CommentService {
    List<Comment> getAll();

    Comment createComment(Comment comment);
}
