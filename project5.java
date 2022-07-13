import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class project5 extends Frame implements ActionListener
{
JPanel p,p1;
 Button b1,b2,b3,b4,b5,b6,b7,b8;
int s,s1,s2,s3;
TextField t1,t2,t3,t4,t5;
Choice c,c1,c2;
Label l1,l2,l3,l4,l5,l6;
String str,str1,str2,str3;
Frame f=new Frame();
public project5()
{

 p=new JPanel();
p1=new JPanel();
 b1=new Button("Red");
b1.setBackground(Color.red);
 b2=new Button("Pink");
b2.setBackground(Color.pink);
 b3=new Button("Blue");
b3.setBackground(Color.blue);
 b4=new Button("Orange");
b4.setBackground(Color.orange);
 b5=new Button("Cyan");
b5.setBackground(Color.cyan);
 b6=new Button("Yellow");
b6.setBackground(Color.yellow);
 b7=new Button("Black");
b7.setBackground(Color.black);
 b8=new Button("Clear");
b8.setBackground(Color.white);
l4=new Label("color_brush");
l5=new Label("Shapes");
l6=new Label("Color_shape");

l1=new Label("Size of brush");
t1=new TextField(5);
//l2=new Label("radius");
//t2=new TextField(5);
l3=new Label("width and height");
t3=new TextField(5);
t4=new TextField(5);
t5=new TextField(5);


setLayout(new FlowLayout(FlowLayout.LEFT));
p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);
p.add(b5);
p.add(b6);
p.add(b7);
p.add(b8);
//p.add(b9);
p.setToolTipText("Colors To set the background");

c=new Choice();
c.add("red");
c.add("blue");
c.add("orange");
c.add("pink");
c.add("yellow");
c.add("black");

c1=new Choice();
c1.add("rectangle");
c1.add("circle");
c1.add("line");


c2=new Choice();
c2.add("red");
c2.add("blue");
c2.add("orange");
c2.add("pink");
c2.add("yellow");
c2.add("black");
c2.add("circle");
c2.add("rectangle");
c2.add("line");

add(l1);
add(t1);
p1.add(l3);
p1.add(t3);
p1.add(t4);
p1.add(l5);
p1.add(c1);
p1.add(l6);
p1.add(c2);
p1.add(l4);
p1.add(c);

p1.setToolTipText("Shapes");

add(p,new GridLayout(2,2));
add(p1,FlowLayout.LEFT);

b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
b8.addActionListener(this);
//b9.addActionListener(this);



//Size of brush
addMouseMotionListener(new MouseMotionAdapter(){
public void mouseDragged( MouseEvent e)
{

s=Integer.parseInt(t1.getText());
Graphics g = getGraphics();

str=c.getSelectedItem();
if(str.equals("red"))
{
g.setColor(Color.red);
g.fillOval(e.getX(),e.getY(),s,s);
}
else if(str.equals("blue"))
{
g.setColor(Color.blue);
g.fillOval(e.getX(),e.getY(),s,s);
}
else if(str.equals("pink"))
{
g.setColor(Color.pink);
g.fillOval(e.getX(),e.getY(),s,s);
}
else if(str.equals("orange"))
{
g.setColor(Color.orange);
g.fillOval(e.getX(),e.getY(),s,s);
}
else if(str.equals("yellow"))
{
g.setColor(Color.yellow);
g.fillOval(e.getX(),e.getY(),s,s);
}
else if(str.equals("black"))
{
g.setColor(Color.black);
g.fillOval(e.getX(),e.getY(),s,s);
}
//else if(s=="null")
//{
//System.out.println("enter size of brush");
//}

else 
{
g.setColor(Color.cyan);
g.fillOval(e.getX(),e.getY(),s,s);
}
}
});




//Shapes
addMouseListener(new MouseAdapter(){
public void mousePressed( MouseEvent e)
{
Graphics g = getGraphics();
str3=c1.getSelectedItem();
str2=c2.getSelectedItem();
//System.out.println(str2);
s2=Integer.parseInt(t3.getText());
s3=Integer.parseInt(t4.getText());

//circle
 if(str3.equals("circle")&&str2.equals("blue"))
{
l3.setText("Radius");
g.setColor(Color.blue);
g.fillOval(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("circle")&&str2.equals("red"))
{
l3.setText("Radius");
g.setColor(Color.red);
g.fillOval(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("circle")&&str2.equals("pink"))
{
l3.setText("Radius");
g.setColor(Color.pink);
g.fillOval(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("circle")&&str2.equals("orange"))
{
l3.setText("Radius");
g.setColor(Color.orange);
g.fillOval(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("circle")&&str2.equals("black"))
{
l3.setText("Radius");
g.setColor(Color.black);
g.fillOval(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("circle")&&str2.equals("yellow"))
{
l3.setText("Radius");
g.setColor(Color.yellow);
g.fillOval(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("circle")&&str2.equals("circle"))
{
l3.setText("Radius");

g.drawOval(e.getX(),e.getY(),s2,s3);
}


//Rect
else if(str3.equals("rectangle")&&str2.equals("yellow"))
{
l3.setText("Width and Height");
g.setColor(Color.yellow);
g.fillRect(e.getX(),e.getY(),s2,s3);
}
else  if(str3.equals("rectangle")&&str2.equals("blue"))
{
l3.setText("Width and Height");
g.setColor(Color.blue);
g.fillRect(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("rectangle")&&str2.equals("red"))
{
l3.setText("Width and Height");
g.setColor(Color.red);
g.fillRect(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("rectangle")&&str2.equals("pink"))
{
l3.setText("Width and Height");
g.setColor(Color.pink);
g.fillRect(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("rectangle")&&str2.equals("orange"))
{
l3.setText("Width and Height");
g.setColor(Color.orange);
g.fillRect(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("rectangle")&&str2.equals("black"))
{
l3.setText("Width and Height");
g.setColor(Color.black);
g.fillRect(e.getX(),e.getY(),s2,s3);
}


//Line
else if(str3.equals("line")&&str2.equals("black"))
{
l3.setText("Width and Height");
g.setColor(Color.black);
g.drawLine(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("line")&&str2.equals("line"))
{
l3.setText("Width and Height");
g.setColor(Color.black);
g.drawLine(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("line")&&str2.equals("yellow"))
{
l3.setText("Width and Height");
g.setColor(Color.yellow);
g.drawLine(e.getX(),e.getY(),s2,s3);
}
else  if(str3.equals("line")&&str2.equals("blue"))
{
l3.setText("Width and Height");
g.setColor(Color.blue);
g.drawLine(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("line")&&str2.equals("red"))
{
l3.setText("Width and Height");
g.setColor(Color.red);
g.drawLine(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("line")&&str2.equals("pink"))
{
l3.setText("Width and Height");
g.setColor(Color.pink);
g.drawLine(e.getX(),e.getY(),s2,s3);
}
else if(str3.equals("line")&&str2.equals("orange"))
{
l3.setText("Width and Height");
g.setColor(Color.orange);
g.drawLine(e.getX(),e.getY(),s2,s3);
}
else
{
l3.setText("Radius");
g.drawRect(e.getX(),e.getY(),s2,s3);
}

}
});

//exit
addWindowListener(new WindowAdapter(){
public void windowClosing( WindowEvent e)
{
System.exit(0);
}
});
}


//beckground buttons
public void actionPerformed(ActionEvent ae)
{
if(ae.getActionCommand()=="Red")
{
setBackground(Color.red);
}
else if(ae.getActionCommand()=="Pink")
 {
setBackground(Color.pink);
}
else if(ae.getActionCommand()=="Blue")
 {
setBackground(Color.blue);
}
else if(ae.getActionCommand()=="Orange")
 {
setBackground(Color.orange);
}
else if(ae.getActionCommand()=="Cyan")
 {
setBackground(Color.cyan);
}
else if(ae.getActionCommand()=="Yellow")
 {
setBackground(Color.yellow);
}
else if(ae.getActionCommand()=="Black")
 {
setBackground(Color.black);
}

else 
 {
setBackground(Color.white);
}
}
//Constuctor close
public static void main(String args[])
{
project5 cb=new project5();
cb.setIconImage(new ImageIcon("img3.jpg").getImage());
cb.setSize(900,700);
cb.setVisible(true);
}
}
