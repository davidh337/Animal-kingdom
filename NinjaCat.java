import java.awt.*;

public class NinjaCat extends Critter{
    @Override
    public Action getMove(CritterInfo info) {
        return Action.RIGHT;
    }

    @Override
    public Color getColor() {
        return Color.YELLOW;
    }

    @Override
    public String toString() {
        return "NINJAAA";
    }

    public NinjaCat() {
    }
}
