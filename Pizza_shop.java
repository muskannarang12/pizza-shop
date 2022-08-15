  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza_shop;

import java.awt.*;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Pizza_shop extends JFrame implements ActionListener{
    
    JLabel title, topping , size , type , order, image1;
    Container c;
   JCheckBox t,g,b,m,k,p,s;
   JLabel tc,gc,bc,mc,me,mp,ms,label;
   JRadioButton small,medium,large, thin, mediumc, pan;
   JTextField area;
   JButton btn;
   ImageIcon image;
   ButtonGroup grp;
   
   
    public Pizza_shop(String a)
    {
    
    setSize(1000,1000);
    setMinimumSize(new Dimension(1000,1000));
       
    
  c = getContentPane();
  c.setBackground(Color.yellow);
		c.setLayout(null);
                
                
        title = new JLabel("WELCOME TO MUSKAN`S PIZZA SHOP");
        title.setFont(new Font("Arial" , Font.BOLD , 20));
        title.setForeground(Color.RED);
        title.setSize(400,30);
        title.setLocation(300,30);
        c.add(title);
        
        
        
        topping = new JLabel("Each Topping:  1.50$");
        topping.setForeground(Color.red);
        topping.setFont(new Font("Arial" , Font.BOLD , 16));
        topping.setSize(380,100);
        topping.setLocation(150,120);
        c.add(topping);
        
  
       
      
         
        t = new JCheckBox("Tomato");
        t.setBackground(Color.yellow);
        t.setSelected(false);
        t.setFont(new Font("Arial" , Font.BOLD , 16));
        t.setSize(100, 30);
        t.setLocation(170,200);
           c.add(t);

    
     g = new JCheckBox("Green pepper");
     g.setBackground(Color.yellow);
     g.setFont(new Font("Arial" , Font.BOLD , 16));
     g.setLocation(170,230);
     g.setSize(120, 30);
     g.setSelected(false);
     c.add(g);
    
    
       b = new JCheckBox("Black olives");
         b.setBackground(Color.yellow);
       b.setFont(new Font("Arial" , Font.BOLD , 16));
    b.setLocation(170,260);
    b.setSize(120, 30);
     b.setSelected(false);
    
    c.add(b);
    
    
       m = new JCheckBox("Extra cheese");
       m.setBackground(Color.yellow);
    m.setFont(new Font("Arial" , Font.BOLD , 16));
    m.setLocation(170,290);
    m.setSize(120, 30);
   m.setSelected(false);
    
    c.add(m);
    
    
    
      
     k = new JCheckBox("Mushrooms");
    k.setBackground(Color.yellow);
    k.setFont(new Font("Arial" , Font.BOLD , 16));
    k.setLocation(170,320);
    k.setSize(120, 30);
     k.setSelected(false);
    c.add(k);
    
     p = new JCheckBox("Pepperoni");
   p.setBackground(Color.yellow);
    p.setFont(new Font("Arial" , Font.BOLD , 16));
    p.setLocation(170,350);
     p.setSelected(false);
    p.setSize(120, 30);
     c.add(p);
   
     s = new   JCheckBox("Sausage");
     s.setBackground(Color.yellow);
    s.setSelected(false);
    s.setFont(new Font("Arial" , Font.BOLD , 16));
    s.setLocation(170,380);
    s.setSize(120, 30);
   c.add(s);
    
    
    
        size = new JLabel("Pizza size");
        size.setForeground(Color.red);
        size.setFont(new Font("Arial" , Font.BOLD , 16));
        size.setSize(300,80);
        size.setLocation(500,120);
        c.add(size);
        
        small = new JRadioButton("Small :$6.50");
         small.setBackground(Color.yellow);
         small.setFont(new Font("Arial" , Font.BOLD , 16));
        small.setSize(200,30);
        small.setLocation(500,190);
         small.setSelected(false);
        small.setActionCommand("Small");
        c.add(small);
        
         medium = new JRadioButton(" Medium :$8.50");
          medium.setBackground(Color.yellow);
         medium.setFont(new Font("Arial" , Font.BOLD , 16));
        medium.setSize(200,30);
        medium.setLocation(500,220);
        medium.setActionCommand("Medium");
       medium.setSelected(false);
        c.add(medium);
        
         large = new JRadioButton(" Large :$10.50");
         large.setBackground(Color.yellow);
         large.setFont(new Font("Arial" , Font.BOLD , 16));
        large.setSize(200,30);
        large.setLocation(500,250);
        large.setActionCommand("large");
         large.setSelected(false);
        c.add(large);
    
        
        
       
        
         grp = new ButtonGroup();
        grp.add(small);
        grp.add(medium);
        grp.add(large);
    
     type = new JLabel("Pizza type");
        type.setForeground(Color.red);
        type.setFont(new Font("Arial" , Font.BOLD , 16));
        type.setSize(300,80);
        type.setLocation(700,120);
        
        c.add(type);
        
        thin = new JRadioButton(" Thin crust");
        thin.setBackground(Color.yellow);
       thin.setFont(new Font("Arial" , Font.BOLD , 16));
        thin.setSize(200,30);
        thin.setLocation(700,190);
        thin.setSelected(false);
        c.add(thin);
        
        mediumc = new JRadioButton(" Medium crust");
        mediumc.setBackground(Color.yellow);
       mediumc.setFont(new Font("Arial" , Font.BOLD , 16));
        mediumc.setSize(200,30);
        mediumc.setLocation(700,220);
        mediumc.setSelected(false);
        c.add(mediumc);
        
        pan = new JRadioButton(" Pan");
        pan.setBackground(Color.yellow);
       pan.setFont(new Font("Arial" , Font.BOLD , 16));
        pan.setSize(200,30);
        pan.setLocation(700,250);
        pan.setSelected(false);
       
        c.add(pan);
        
        
        btn = new JButton("Process Selection");
        btn.setSize(150, 50);
        btn.setBackground(Color.red);
        btn.setForeground(Color.yellow);
        btn.setLocation(450,350);
        
        btn.addActionListener(this);
        c.add(btn);
        
        
        area = new JTextField();
        area.setSize(900, 400);
        area.setBackground(Color.lightGray);
        area.setLocation(50,500);
        c.add(area);
        
        
        
        order = new JLabel("Your order");
        order.setForeground(Color.red);
        order.setFont(new Font("Arial" , Font.BOLD , 16));
        order.setSize(100,50);
        order.setLocation(50,450);
        c.add(order);
        
    
         
       label = new JLabel(); //JLabel Creation
        label.setIcon(new ImageIcon("cmps.JPG")); //Sets the image to be displayed as an icon
        Dimension size = label.getPreferredSize(); //Gets the size of the image
        label.setBounds(330,120, size.width, size.height); //Sets the location of the image
        
        //Sets the location of the image
 
          c.add(label); //Adds objects to the container
        

    
    }
     

    
 
    public static void main(String[] args) {
       
         Pizza_shop obj = new  Pizza_shop("pizza shop");
         obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         obj.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    double amount =0;
        String msg = "TOPPINGS:   ";
        String msg1 = "PIZZA SIZE :" +" \n\n"
                ;
        String msg2 = "PIZZA TYPE: ";
        
      if (e.getSource() == btn) {
          
          
       if (small.isSelected()) {
                msg1 = "Small"+ "\n";
                area.setText(msg1);
            }
       else if (medium.isSelected()) {
                msg1 = "Medium"+ "\n";
                area.setText(msg1);
            }
       else  if (large.isSelected()) {
                msg1 = "Large"+ "\n";
                area.setText(msg1);
            }
          
      
		 if (t.isSelected()) {
                amount += 150 ;
                msg += "Tomato"+ "\n";
                area.setText(msg);
            }
                  
               if (b.isSelected()) {
                amount += 150 ;
                msg += "\n" +",Black Olives";
                area.setText(msg);
            }
                     if (m.isSelected()) {
                amount += 150 ;
                msg += " , Extra cheese";
                area.setText(msg);
            }
                         if (k.isSelected()) {
                amount += 150 ;
                msg += ", Mushrooms";
                area.setText(msg);
            }
                       if (g.isSelected()) {
                amount += 150 ;
                msg += ", Green pepper";
                area.setText(msg);
            }
                       
                         if (s.isSelected()) {
                amount += 150 ;
                msg += ",Suasage";
                area.setText(msg);
            }
                         if (p.isSelected()) {
                amount += 150 ;
                msg += ", Pepproni\n";
                area.setText(msg);
            }
				
      
				
      
     
        
    }}

