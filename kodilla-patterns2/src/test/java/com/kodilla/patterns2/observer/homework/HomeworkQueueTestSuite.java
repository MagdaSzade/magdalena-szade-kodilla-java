package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        HomeworkObserver mentor1 = new Mentor("Mentor1");
        HomeworkObserver mentor2 = new Mentor("Mentor2");
        HomeworkObservable task201 = new HomeworkQueue("Zadanie 20.1");
        HomeworkObservable task202 = new HomeworkQueue("Zadanie 20.2");
        HomeworkObservable task203 = new HomeworkQueue("Zadanie 20.3");
        task201.registerObserver(mentor1);
        task202.registerObserver(mentor2);
        task203.registerObserver(mentor1);
        task203.registerObserver(mentor2);
        //When
        ((HomeworkQueue) task201).addHomework("20.1 - zadanie wykonane przez kursant 1");
        ((HomeworkQueue) task201).addHomework("20.1 - zadanie wykonane przez kursant 2");
        ((HomeworkQueue) task201).addHomework("20.1 - zadanie wykonane przez kursant 3");
        ((HomeworkQueue) task202).addHomework("20.2 - zadanie wykonane przez kursant 1");
        ((HomeworkQueue) task202).addHomework("20.2 - zadanie wykonane przez kursant 2");
        ((HomeworkQueue) task203).addHomework("20.3 - zadanie wykonane przez kursant 1");
        //Then
        Assert.assertEquals(4, ((Mentor) mentor1).getUpdateCount());
        Assert.assertEquals(3, ((Mentor) mentor2).getUpdateCount());
    }
}
