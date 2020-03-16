/**
 * New monster type for Emerald Mine game.
 * @author Louis Wleynad based on cambolbro (based on code from previous years).
 */

import java.util.Random;

class Bug extends Moveable
{
    // 1 = up, 2 = right, 3 = down, 4 = left
    private int direction;

    public Bug()
    {
        direction = 1;
    }

    public boolean isEdible() { return false; }
    public boolean hasMass() { return false; }
    public boolean isVulnerable() { return true; }
    public String getIconFile(){  return "picture/bug"+direction+".png";}

    public char getMove()
    {

        switch(direction){

            case(1): return 'u';  /** always start with direction 1 */
            case(2): return 'r';
            case(3): return 'd';
            case(4): return 'l';
            default: return '?';
        }
    }

    public void changeDirection()
    {

        switch (direction){

            case(1):  direction=2;break;   /** will change direction, evoked by the alienmove method in world when it bumps into a rock or dirt*/
            case(2):  direction=3;break;
            case(3): direction=4;break;
            case(4): direction=1;break;


        }




    }

    public String toString() { return "b"; }
}




class Spaceship extends Moveable
{
    // 1 = up, 2 = right, 3 = down, 4 = left
    private int direction;

    public Spaceship()
    {
        direction = 1;
    }

    public boolean isEdible() { return false; }
    public boolean hasMass() { return false; }
    public boolean isVulnerable() { return true; }
    public String getIconFile(){ return "picture/spaceship"+direction+".png"; }


    public char getMove()
    {
        switch(direction){

            case(1): return 'u';
            case(2): return 'r';
            case(3): return 'd';
            case(4): return 'l';
            default: return '?';
        }
    }

    public void changeDirection()
    {
        switch(direction){

            case(1): direction=4;break;
            case(2): direction=1;break;
            case(3): direction=2;break;
            case(4): direction=3;break;
        }
    }

    public String toString() { return "s"; }

}