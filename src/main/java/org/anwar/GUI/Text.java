package org.anwar.GUI;

public class Text implements Observer{
    @Override
     public void update(CmpGraphiqe c)
    {
        System.out.println("text file updated "+c.nom);
    }
}
