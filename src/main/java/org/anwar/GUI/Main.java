package org.anwar.GUI;

public class Main {
    public static void main(String[] args) {
        CmpFactory WinOS=WindowsFactory.getInstance();
        Button button= WinOS.createButton();
        button.click();
        button.attach(new Text());
        button.click();

    }
}