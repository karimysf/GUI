package org.anwar.GUI;
import java.util.ArrayList;
import java.util.List;
public abstract class CmpGraphiqe{
  List<Observer> l =new ArrayList<>();

   String nom;

    public CmpGraphiqe() {
        this.l.add(new Console());

    }
    public  void attach(Observer o)
    {this.l.add(o);

    }
    public  void detach(Observer o)
    {if (l.contains(o))
        this.l.remove(o);

    }
    public void notif()
    {
        for(Observer o:l)
            o.update(this);
    }

}
