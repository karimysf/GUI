package org.anwar.GUI;

public class WindowsFactory extends CmpFactory {
    private static WindowsFactory wi;
    private WindowsFactory()
    {

    }
    public static WindowsFactory getInstance()
    {
        if (wi==null)

            wi=new WindowsFactory();


        return wi;
    }

    @Override
    public Button createButton(){
        return new WinButton();
    }

}
