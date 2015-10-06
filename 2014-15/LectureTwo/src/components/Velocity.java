package components;

public class Velocity extends com.badlogic.ashley.core.Component {
    public int x = 0, y = 0;

    public Velocity(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
