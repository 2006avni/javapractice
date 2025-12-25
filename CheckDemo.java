import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="CheckDemo" width=200 height=300></applet>*/
public class CheckDemo extends Applet implements ItemListner
{
   Checkbox c1,c2,c3,c4;
   CheckboxGroup cb;
   public void init()
   {
     c1=new Checkbox("Red",cb,false);
     c2=new Checkbox("Green",cb,false);
     c3=new Checkbox("Blue",cb,false);
     c4=new Checkbox("Pink",cb,false);
     cb=new CheckboxGroup();
     add(c1);
     add(c2);
     add(c3);
     add(c4);
    c1.addItemListener(this);
    c2.addItemListener(this);
    c3.addItemListener(this);
    c4.addItemListener(this);
  }
    public static ItemStateChanged(ItemEvent ie)
    {
      if(c1.getState())
      setBackground(Color,red);
      else if(c2.getState())
      setBackground(Color,green);
      else if(c3.getState())
      setBackground(Color,blue);
      else if(c4.getState())
      setBackground(Color,pink);
    }
}
