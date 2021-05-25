import java.awt.*;
import java.util.Random;

public class Tiger extends Critter{
    Random random = new Random();
    protected int move;
    protected Color color;


    public Tiger() {
        this.move = 1;
    }

    @Override
    public String toString() {
        return "TGR";
    }

    @Override
    public Action getMove(CritterInfo info) {
        if(this.move == 3) {
            this.move = 0;
            int r = random.nextInt(3 - 1 + 1) + 1;
            switch (r) {
                case 1:
                    this.color = Color.BLUE;
                    break;
                case 2:
                    this.color = Color.RED;
                    break;
                case 3:
                    this.color = Color.GREEN;
                    break;
                default:
                    break;
            }
        }
        this.move++;
        if(info.frontThreat())
        {
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
        return color;
    }

}

