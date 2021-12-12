package it.caculli.gzc.sokoban.ui;

import it.caculli.gzc.sokoban.ui.gui.MainFrame;

import javax.swing.SwingUtilities;

public class Menu
{
    public Menu()
    {
        SwingUtilities.invokeLater( new Runnable()
        {
            @Override
            public void run()
            {
                new MainFrame();
            }
        } );
    }
}
