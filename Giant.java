import java.awt.*;

public class Giant extends Critter{
    private int move = 0;

    @Override
    public Action getMove(CritterInfo info) {
        this.move ++;
        if(move>= 24)
        {
            this.move = 1;
        }
        if (info.frontThreat())
        {
            return  Action.INFECT;
        }
        else if (info.getFront() == Neighbor.EMPTY)
        {   return  Action.HOP;}
        else
        {
            return Action.RIGHT;
        }
    }

    @Override
    public Color getColor() {
        return Color.GRAY;
    }

    @Override
    public String toString() {
        if(this.move < 6)
        {
            return "fee";
        }
        else if(this.move < 12)
        {
            return "fie";
        }
        else if(this.move < 18)
        {
            return "foe";
        }
        else
        {
            return "fum";
        }

    }

    public Giant() {
    }
}
