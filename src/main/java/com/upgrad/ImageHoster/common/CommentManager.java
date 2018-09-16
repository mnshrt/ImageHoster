package com.upgrad.ImageHoster.common;

import com.upgrad.ImageHoster.model.Comment;
import org.hibernate.Session;

import java.util.List;

public class CommentManager extends SessionManager {
    /**
     * This method retrieves all of the comments saved in the database
     *
     * @return a List of Comment objects
     */
    public List<Comment> getAllComments() {
        Session session = openSession();
        List<Comment> comments = session.createCriteria(Comment.class).list();
        commitSession(session);

        return comments;
    }

    /**
     * This method saves a comment object in the database
     *
     * @return a List of Comment objects
     */

    public Comment createComment(Comment comment) {
        Session session = openSession();
        session.save(comment);
        commitSession(session);
        return comment;
    }
}
