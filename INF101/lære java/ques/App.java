package ques;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class App {
    ////// (head)<--oooooooooooo<--(tail) FIFO(first in first out)
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);
        q1.add(1);
        q1.add(4);
        q1.add(5);
        System.out.println(q1);
        //fjerner 1 plass i køen og legger den til value
        int value = q1.remove();
        System.out.println(value);
        System.out.println(q1.element());//gir ut 1plass i køen

        Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(3);
        q2.offer(1);
        q2.offer(2);
        q2.offer(5);
        q2.offer(6);//offer gjør at selv om det ikke er plass i køen blir det ikke feilmeldig bare retunerer false.

        System.out.println(q2);
        System.out.println(q2.poll());//prøver å ta ut av køen
        
    }
}
