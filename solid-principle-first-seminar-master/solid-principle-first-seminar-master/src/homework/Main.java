package homework;

import homework.sr.Reporter;
import homework.sr.Saver;

public class Main{
    public static void main(String[] args){
        User user = new User("Bob");

        Reporter reporter = new Reporter();
        reporter.output(user);

        Saver saver = new Saver();
        saver.output(user);

    }
}