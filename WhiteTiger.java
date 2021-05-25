import java.awt.*;

public class WhiteTiger extends Tiger{

    boolean infected;
    @Override
    public Action getMove(CritterInfo info) {

        if(info.frontThreat())
        {
            this.infected = true;
            return Action.INFECT;
        }
        else if((info.getFront() == Neighbor.WALL)||(info.getLeft() == Neighbor.WALL))
        {
            return Action.LEFT;
        }
        else if(info.getFront() == Neighbor.SAME)
        {
            return Action.RIGHT;
        }
        else
        {
            return Action.HOP;
        }

    }

    @Override
    public Color getColor() {
        return Color.WHITE;
    }

    @Override
    public String toString() {
        if(this.infected)
        {
            return "TGR";
        }
        else
        {
            return "tgr";
        }
    }

    public WhiteTiger() {
    }
}
