package lesson1;

import java.util.Objects;

public class Human implements Competitable {
    private int diveDepth;
    private int swimLength;

    public Human(int diveDepth, int swimLength) {
        this.diveDepth = diveDepth;
        this.swimLength = swimLength;
    }

    @Override
    public void dive(int depth) {
        if (depth > diveDepth) {
            System.out.println("Я человек, я не смог нормально нырнуть!");
        } else {
            System.out.println("Я человек, я смог нырнуть!");
        }
    }

    @Override
    public void swim(int length) {
        if (length > swimLength) {
            System.out.println("Я человек, я не смог проплыть!");
        } else {
            System.out.println("Я человек, я смог проплыть!");
        }
    }
}
