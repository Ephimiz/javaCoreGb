package lesson1;

public class Wall implements Overcomable {
    private int depth;

    public Wall(int depth) {
        this.depth = depth;
    }

    public void overcome(Competitable competitable) {
        competitable.dive(depth);
    }
}
