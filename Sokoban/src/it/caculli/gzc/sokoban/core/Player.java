package it.caculli.gzc.sokoban.core;

public class Player extends Actor
{
    public Player( int x, int y )
    {
        super( x, y );
    }

    public void move( int x, int y )
    {
        setX( getX() + x );
        setY( getY() + y );
    }
}
