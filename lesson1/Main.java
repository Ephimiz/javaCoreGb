package lesson1;

public class Main {
    public static void main(String[] args) {
        Competitable[] competitors =
                {new RoboCat(4, 5),new Human(4, 5),
                        new Robot(10, 5)};

        Overcomable[] overcomables = {new Wall(10), new Pool(10)};

        for (Competitable competitable : competitors) {
            for (Overcomable overcomable : overcomables) {
                overcomable.overcome(competitable);
            }
        }
    }
}
