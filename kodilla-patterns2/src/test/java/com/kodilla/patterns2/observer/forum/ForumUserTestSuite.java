package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {

    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum  = new JavaToolsForumTopic();
        ForumUser johnny = new ForumUser("Johny");
        ForumUser ivonka = new ForumUser("Iwonka");
        ForumUser jessi = new ForumUser("Jessi");
        javaHelpForum.registerObserver(johnny);
        javaHelpForum.registerObserver(jessi);
        javaToolsForum.registerObserver(ivonka);
        javaToolsForum.registerObserver(jessi);
        //When
        javaHelpForum.addPost("Post 1");
        javaHelpForum.addPost("Post 2");
        javaToolsForum.addPost("Post 1");
        javaHelpForum.addPost("Post 3");
        javaToolsForum.addPost("Post 2");
        //Then
        Assert.assertEquals(3, johnny.getUpdateCount());
        Assert.assertEquals(2, ivonka.getUpdateCount());
        Assert.assertEquals(5, jessi.getUpdateCount());
    }
}
