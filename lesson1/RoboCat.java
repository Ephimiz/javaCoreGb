package lesson1;

public class RoboCat implements Competitable {
    private int diveDepth;
    private int swimLength;

    public RoboCat(int diveDepth, int swimLength) {
        this.diveDepth = diveDepth;
        this.swimLength = swimLength;
    }

    @Override
    public void dive(int depth) {
        if (depth > diveDepth) {
            System.out.println("Я Roboкот, я не смог нормально нырнуть!");
        } else {
            System.out.println("Я Roboкот, я смог нырнуть!");
        }
    }

    @Override
    public void swim(int length) {
        if (length > swimLength) {
            System.out.println("Я Roboкот, я не смог проплыть!");
        } else {
            System.out.println("Я Roboкот, я смог проплыть!");
        }
    }
}