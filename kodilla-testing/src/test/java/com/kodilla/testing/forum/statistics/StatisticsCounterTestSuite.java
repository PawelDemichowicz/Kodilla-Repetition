package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsCounterTestSuite {
    @Test
    public void testCalculateAdvStatisticsWhenNumberOfPostsEqualZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i=0; i<10 ; i++){
            usersList.add("name");
        }
        int postsNumber = 0;
        int commentsNumber = 10;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = statisticsCounter.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCounter.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCounter.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(averagePostsPerUser,0);
        Assertions.assertEquals(averageCommentsPerUser,1);
        Assertions.assertEquals(averageCommentsPerPost,0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfPostsEqualOneThousand(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i=0; i<10; i++){
            usersList.add("name");
        }
        int postsNumber = 1000;
        int commentsNumber = 100;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = statisticsCounter.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCounter.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCounter.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(averagePostsPerUser,100);
        Assertions.assertEquals(averageCommentsPerUser,10);
        Assertions.assertEquals(averageCommentsPerPost,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsEqualZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i=0; i<10; i++){
            usersList.add("name");
        }
        int postsNumber = 1000;
        int commentsNumber = 0;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = statisticsCounter.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCounter.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCounter.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(averagePostsPerUser,100);
        Assertions.assertEquals(averageCommentsPerUser,0);
        Assertions.assertEquals(averageCommentsPerPost,0);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsIsBiggerThanNumberOfPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i=0; i<10; i++){
            usersList.add("name");
        }
        int postsNumber = 100;
        int commentsNumber = 1000;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = statisticsCounter.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCounter.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCounter.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(averagePostsPerUser,10);
        Assertions.assertEquals(averageCommentsPerUser,100);
        Assertions.assertEquals(averageCommentsPerPost,10);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfCommentsIsLowerThanNumberOfPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i=0; i<10; i++){
            usersList.add("name");
        }
        int postsNumber = 1000;
        int commentsNumber = 100;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = statisticsCounter.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCounter.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCounter.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(averagePostsPerUser,100);
        Assertions.assertEquals(averageCommentsPerUser,10);
        Assertions.assertEquals(averageCommentsPerPost,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfUsersEqualZero(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        int postsNumber = 1000;
        int commentsNumber = 100;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = statisticsCounter.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCounter.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCounter.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(averagePostsPerUser,0);
        Assertions.assertEquals(averageCommentsPerUser,0);
        Assertions.assertEquals(averageCommentsPerPost,0.1);
    }

    @Test
    public void testCalculateAdvStatisticsWhenNumberOfUsersEqualOneHundred(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersList = new ArrayList<>();
        for (int i=0; i<100; i++){
            usersList.add("name");
        }
        int postsNumber = 1000;
        int commentsNumber = 100;

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(postsNumber);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumber);
        StatisticsCounter statisticsCounter = new StatisticsCounter(statisticsMock);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        double averagePostsPerUser = statisticsCounter.getAveragePostsPerUser();
        double averageCommentsPerUser = statisticsCounter.getAverageCommentsPerUser();
        double averageCommentsPerPost = statisticsCounter.getAverageCommentsPerPost();

        //Then
        Assertions.assertEquals(averagePostsPerUser,10);
        Assertions.assertEquals(averageCommentsPerUser,1);
        Assertions.assertEquals(averageCommentsPerPost,0.1);
    }
}
