package it.caculli.gzc.sokoban.core;

public abstract class Actor
{
    int x, y;
    private static final int SPACE = 20;

    public Actor( int x, int y )
    {
        setX( x );
        setY( y );
    }

    public void setX( int x )
    {
        this.x = x;
    }

    public int getX()
    {
        return x;
    }

    public void setY( int y )
    {
        this.y = y;
    }

    public int getY()
    {
        return y;
    }

    public boolean isLeftCollision( Actor actor )
    {
        return getX() - SPACE == actor.getX() && getY() == actor.getY();
    }

    public boolean isRightCollision( Actor actor )
    {
        return getX() + SPACE == actor.getX() && getY() == actor.getY();
    }

    public boolean isTopCollision( Actor actor )
    {
        return getY() - SPACE == actor.getY() && getX() == actor.getX();
    }

    public boolean isBottomCollision( Actor actor )
    {
        return getY() + SPACE == actor.getY() && getX() == actor.getX();
    }
}
