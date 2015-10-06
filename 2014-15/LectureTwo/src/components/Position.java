package components;

import com.badlogic.ashley.core.Component;

public class Position extends Component {
    public int x = 0, y = 0;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

