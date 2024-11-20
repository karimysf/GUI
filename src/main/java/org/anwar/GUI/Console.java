package org.anwar.GUI;

public class Console implements Observer{

    public void update(CmpGraphiqe c) {
        System.out.println("have been updated in console "+c.nom);

    }
}
