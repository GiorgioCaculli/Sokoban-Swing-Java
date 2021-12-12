package it.caculli.gzc.sokoban.ui.gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame
{
    public MainFrame()
    {
        int WIDTH = 800;
        int HEIGHT = WIDTH / 4 * 3;
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setLocationByPlatform( true );
        setResizable( false );
        setSize( WIDTH, HEIGHT );
        setTitle( "Sokoban" );
        setVisible( true );
    }
}
