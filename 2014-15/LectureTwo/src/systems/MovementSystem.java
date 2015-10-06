package systems;

import com.badlogic.ashley.core.*;
import com.badlogic.ashley.systems.*;
import components.*;

public class MovementSystem extends IteratingSystem {
    public MovementSystem(int priority) {
        super(Family.getFor(Position.class, Velocity.class), priority);
    }

    @Override
    protected void processEntity(Entity entity, float deltaTime) {
        ComponentMapper<Position> pm = ComponentMapper.getFor(Position.class);
        ComponentMapper<Velocity> vm = ComponentMapper.getFor(Velocity.class);

        Position p = pm.get(entity);
        Velocity v = vm.get(entity);

        p.x += v.x;
        p.y += v.y;
    }
}

