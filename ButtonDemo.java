import java.awt.*;
import java.awt.event.*;
public class ButtonDemo extends Frame
{
   Button b1,b2,b3;
   ButtonDemo()
   {
     setSize(400,400);
     setLayout(new FlowLayout());
     setTitle("My First Frame");
     setVisible(true);
     b1=new Button("Avni");
     b2=new Button("Prerana");
     b3=new Button("Hello");
     add(b1);
     add(b2);
     add(b3);
  }
     public static void main(String args[])
     {
           ButtonDemo f=new ButtonDemo();
      }
}


