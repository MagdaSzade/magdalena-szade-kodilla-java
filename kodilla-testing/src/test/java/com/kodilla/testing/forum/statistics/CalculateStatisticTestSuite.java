package com.kodilla.testing.forum.statistics;

import org.junit.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.ArrayList;

public class CalculateStatisticTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test
    public void testCalculateStatistic1() {
        //numbers of post = 0;
        //Given
        CalculateStatistics calculate = new CalculateStatistics();
        CalculateStatistics calculateCompared = new CalculateStatistics(5, 0,0,0,0,0);
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        userList.add("Adam");
        userList.add("Janek");
        userList.add("Damian");
        userList.add("Jacek");
        userList.add("Jurek");
        int numberOfPosts = 0;
        int numberOfComments = 0;
        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(numberOfComments);
        //When
        calculate.calculatedAdvStatistic(statisticMock);
        //Then
        Assert.assertEquals(calculateCompared, calculate);
    }

    @Test
    public void testCalculateStatistic2() {
        //numbers of post = 1000 and comments = 0;
        //Given
        CalculateStatistics calculate = new CalculateStatistics();
        CalculateStatistics calculateCompared = new CalculateStatistics(5, 1000,0,200,0,0);
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        userList.add("Adam");
        userList.add("Janek");
        userList.add("Damian");
        userList.add("Jacek");
        userList.add("Jurek");
        int numberOfPosts = 1000;
        int numberOfComments = 0;
        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(numberOfComments);
        //When
        calculate.calculatedAdvStatistic(statisticMock);
        //Then
        Assert.assertEquals(calculateCompared, calculate);
    }

    @Test
    public void testCalculateStatistic3() {
        //numbers of post < numbers of posts;
        //Given
        CalculateStatistics calculate = new CalculateStatistics();
        CalculateStatistics calculateCompared = new CalculateStatistics(5, 1000,200,200,40,0.2);
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        userList.add("Adam");
        userList.add("Janek");
        userList.add("Damian");
        userList.add("Jacek");
        userList.add("Jurek");
        int numberOfPosts = 1000;
        int numberOfComments = 200;
        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(numberOfComments);
        //When
        calculate.calculatedAdvStatistic(statisticMock);
        //Then
        Assert.assertEquals(calculateCompared, calculate);
    }

    @Test
    public void testCalculateStatistic4() {
        //numbers of post > numbers of posts;
        //Given
        CalculateStatistics calculate = new CalculateStatistics();
        CalculateStatistics calculateCompared = new CalculateStatistics(5, 200,1000,40,200,5);
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        userList.add("Adam");
        userList.add("Janek");
        userList.add("Damian");
        userList.add("Jacek");
        userList.add("Jurek");
        int numberOfPosts = 200;
        int numberOfComments = 1000;
        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(numberOfComments);
        //When
        calculate.calculatedAdvStatistic(statisticMock);
        //Then
        Assert.assertEquals(calculateCompared, calculate);
    }

    @Test
    public void testCalculateStatistic5() {
        //number of users = 0;
        //Given
        CalculateStatistics calculate = new CalculateStatistics();
        CalculateStatistics calculateCompared = new CalculateStatistics(0, 200,1000,0,0,5);
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        int numberOfPosts = 200;
        int numberOfComments = 1000;
        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(numberOfComments);
        //When
        calculate.calculatedAdvStatistic(statisticMock);
        //Then
        Assert.assertEquals(calculateCompared, calculate);
    }

    @Test
    public void testCalculateStatistic6() {
        //numbers of users = 100;
        //Given
        CalculateStatistics calculate = new CalculateStatistics();
        CalculateStatistics calculateCompared = new CalculateStatistics(100, 200,1000,2,10,5);
        Statistics statisticMock = mock(Statistics.class);
        ArrayList<String> userList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            userList.add("Test");
        }
        int numberOfPosts = 200;
        int numberOfComments = 1000;
        when(statisticMock.usersNames()).thenReturn(userList);
        when(statisticMock.postsCount()).thenReturn(numberOfPosts);
        when(statisticMock.commentsCount()).thenReturn(numberOfComments);
        //When
        calculate.calculatedAdvStatistic(statisticMock);
        //Then
        Assert.assertEquals(calculateCompared, calculate);
    }
}
