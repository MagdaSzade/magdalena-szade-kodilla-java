package com.kodilla.testing.forum.statistics;

import java.util.Objects;

public class CalculateStatistics {
    private int numberOfUsers;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public CalculateStatistics() {
    }

    //constructor for testing.
    public CalculateStatistics(int numberOfUsers, int numberOfPosts, int numberOfComments, double averageNumberOfPostPerUser, double averageNumberOfCommentsPerUser, double averageNumberOfCommentsPerPost) {
        this.numberOfUsers = numberOfUsers;
        this.numberOfPosts = numberOfPosts;
        this.numberOfComments = numberOfComments;
        this.averageNumberOfPostPerUser = averageNumberOfPostPerUser;
        this.averageNumberOfCommentsPerUser = averageNumberOfCommentsPerUser;
        this.averageNumberOfCommentsPerPost = averageNumberOfCommentsPerPost;
    }

    public void calculatedAdvStatistic(Statistics statistic) {
        this.numberOfUsers = statistic.usersNames().size();
        this.numberOfPosts = statistic.postsCount();
        this.numberOfComments = statistic.commentsCount();
        if (this.numberOfUsers > 0) {
            this.averageNumberOfPostPerUser = (double) this.numberOfPosts / (double) this.numberOfUsers;
        } else {
            this.averageNumberOfPostPerUser = 0;
        }
        if (this.numberOfUsers > 0) {
            this.averageNumberOfCommentsPerUser = (double) this.numberOfComments / (double) this.numberOfUsers;
        } else {
            this.averageNumberOfCommentsPerUser = 0;
        }
        if (this.numberOfPosts > 0) {
            this.averageNumberOfCommentsPerPost = (double) this.numberOfComments / (double) this.numberOfPosts;
        } else {
            this.averageNumberOfCommentsPerPost = 0;
        }
    }

    public void showStatistic() {
        System.out.println("Statystyki naszego forum:");
        System.out.println("Liczba użytkowników: " + this.numberOfUsers);
        System.out.println("Liczba postów: " + this.numberOfPosts);
        System.out.println("Liczba komentarzy: " + this.numberOfComments);
        System.out.println("średnia liczba postów na użytkownika: " + this.averageNumberOfPostPerUser);
        System.out.println("średnia liczba komentarzy na użytkownika: " + this.averageNumberOfCommentsPerUser);
        System.out.println("średnia liczba komentarzy na post: " + this.averageNumberOfCommentsPerPost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CalculateStatistics that = (CalculateStatistics) o;
        return numberOfUsers == that.numberOfUsers &&
                numberOfPosts == that.numberOfPosts &&
                numberOfComments == that.numberOfComments &&
                Double.compare(that.averageNumberOfPostPerUser, averageNumberOfPostPerUser) == 0 &&
                Double.compare(that.averageNumberOfCommentsPerUser, averageNumberOfCommentsPerUser) == 0 &&
                Double.compare(that.averageNumberOfCommentsPerPost, averageNumberOfCommentsPerPost) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfUsers, numberOfPosts, numberOfComments, averageNumberOfPostPerUser, averageNumberOfCommentsPerUser, averageNumberOfCommentsPerPost);
    }
}
