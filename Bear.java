import java.awt.*;

public class Bear extends Critter{
    private boolean polar;
    private int move;

    public Bear(boolean polar) {
        this.polar = polar;
    }

    @Override
    public Color getColor() {
        if (this.polar)
            return Color.WHITE;
        else
            return Color.BLACK;
    }

    @Override
    public Action getMove(CritterInfo info) {
        move ++;
        if (info.frontThreat())
        {
             return  Action.INFECT;
        }
        else if (info.getFront() == Neighbor.EMPTY)
        {   return  Action.HOP;}
        else
        {
            return Action.LEFT;
        }
    }

    @Override
    public String toString() {
        if ((move % 2) == 0)
        {
            return "/";
        }
        else
        {
            return "\\";
        }


    }
}
