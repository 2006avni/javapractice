import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class ListDemo extends Frame
{
  List l1;
  ListDemo()
  {
    setSize(400,400);
    setLayout(new GridLayout());
    setVisible(true);
    setTitle("ListDemo");
    l1=new List(10);
    l1.add("C");
    l1.add("C++");
    l1.add("Java");
    l1.add("PHP");
    l1.add("DTE");
    l1.add("CSS");
    l1.add("MAD");
    l1.add("AMI");
    add(l1);
    }
     public static void main(String args[])
   {
   ListDemo Id=new ListDemo();
  }

}
