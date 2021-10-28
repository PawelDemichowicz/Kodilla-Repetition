package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {
    private int quantityOfUsers;
    private int quantityOfPosts;
    private int quantityOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;

    Statistics statistics;

    public StatisticsCounter(Statistics statistics){
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics){
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        if (quantityOfUsers > 0) {
            averagePostsPerUser = quantityOfPosts / (double)quantityOfUsers;
            averageCommentsPerUser = quantityOfComments / (double)quantityOfUsers;
        } else {
            averagePostsPerUser = 0;
            averageCommentsPerUser = 0;
        }
        if (quantityOfPosts > 0){
            averageCommentsPerPost = quantityOfComments / (double)quantityOfPosts;
        } else{
            averageCommentsPerPost = 0;
        }

    }

    public void showStatistics(){
        System.out.println("Forum statistics:" + "\n" + "Quantity of users: " + quantityOfUsers
        + "\n" + "Quantity of posts: " + quantityOfPosts + "\n" + "Quantity of comments: " + quantityOfComments
        + "\n" + "Average posts per user:  " + averagePostsPerUser + "\n" + "Average comments per user: " + averageCommentsPerUser
        + "\n" + "Average comments per post: " + averageCommentsPerPost);
    }

    public int getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public int getQuantityOfComments() {
        return quantityOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
