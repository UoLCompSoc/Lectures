import com.badlogic.ashley.core.*;
import com.badlogic.ashley.systems.*;

import components.*;
import systems.*;

public class Main {
    private Engine engine = null;

    public Main() {
        engine = new Engine();

        Entity e = new Entity();

        e.add(new Position(5, 10));
        e.add(new Velocity(1, 1));
        engine.addEntity(e);

        engine.addSystem(new MovementSystem(0));

        printPosition(e);

        engine.update(0.5f);

        printPosition(e);
    }

    public void printPosition(Entity e) {
        ComponentMapper<Position> pm = ComponentMapper.getFor(Position.class);

        Position p = pm.get(e);

        if(p == null) {
            return;
        }

        System.out.println("Located at (x, y) = (" + p.x + ", " + p.y + ").");
    }

    public static void main(String[] args) {
        new Main();
    }
}

