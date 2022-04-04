package lesson1;

public class Robot implements Competitable {
    private int diveDepth;
    private int swimLength;

    public Robot(int diveDepth, int swimLength) {
        this.diveDepth = diveDepth;
        this.swimLength = swimLength;
    }


    public void dive(int depth) {
        if (depth > diveDepth) {
            System.out.println("Я robot, я не смог нормально нырнуть!");
        } else {
            System.out.println("Я robot, я смог нырнуть!");
        }
    }


    public void swim(int length) {
        if (length > swimLength) {
            System.out.println("Я robot, я не смог проплыть!");
        } else {
            System.out.println("Я robot, я смог проплыть!");
        }
    }
}
