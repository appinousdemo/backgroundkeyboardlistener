package com.test;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.TrayIcon.MessageType;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
  
class Login extends JFrame implements ActionListener
 {
  JButton SUBMIT;
  JPanel panel;
  JLabel label1,label2,label3,label4;
  final JTextField  text1,text2,text3,text4;
   Login()
   {
   label1 = new JLabel();
   label1.setText("Username:");
   text1 = new JTextField(15);
 
   label2 = new JLabel();
   label2.setText("Password:");
   text2 = new JPasswordField(15);
   
   label3 = new JLabel();
   label3.setText("url:");
   text3 = new JTextField(15);
   text3.setText("url:3306");
   
   label4 = new JLabel();
   label4.setText("DB Name:");
   text4 = new JTextField(15);
  
   SUBMIT=new JButton("Check Connection");
   
   panel=new JPanel(new GridLayout(5,1));
   panel.add(label3);
   panel.add(text3);
   panel.add(label4);
   panel.add(text4);
   panel.add(label1);
   panel.add(text1);
   panel.add(label2);
   panel.add(text2);
   panel.add(SUBMIT);
   add(panel,BorderLayout.CENTER);
   SUBMIT.addActionListener(this);
   setTitle("Check Connection");
   }
  public void actionPerformed(ActionEvent ae)
   {
   String value1=text1.getText();
   String value2=text2.getText();
   SystemTray tray = SystemTray.getSystemTray();

   //If the icon is a file
   Image image = Toolkit.getDefaultToolkit().createImage("/img/icon.png");
   //Alternative (if the icon is on the classpath):
   //Image image = Toolkit.getToolkit().createImage(getClass().getResource("icon.png"));

   TrayIcon trayIcon = new TrayIcon(image, "DB Connection test");
   //Let the system resize the image if needed
   trayIcon.setImageAutoSize(true);
   try {
   	Class.forName("com.mysql.jdbc.Driver");
       System.out.println("Trying to connect");
       System.out.println(value1+value2);
       Connection connection = DriverManager.getConnection("jdbc:mysql://"+text3.getText()+"/"+text4.getText(),value1,value1);
       trayIcon.setToolTip("Connection Established Successfull and the DATABASE NAME IS:"
               + connection.getMetaData().getDatabaseProductName());
       tray.add(trayIcon);
       trayIcon.displayMessage("connection", "Connection created"
               + connection.getMetaData().getDatabaseProductName(), MessageType.INFO);
       System.out.println("Connection Established Successfull and the DATABASE NAME IS:"
               + connection.getMetaData().getDatabaseProductName());
   } catch (Exception e1) {
   	trayIcon.setToolTip("Unable to make connection with DB"+e1.toString());
       try {
			tray.add(trayIcon);
		} catch (AWTException e2) {
			// TODO Auto-generated catch block
			//e2.printStackTrace();
		}

       trayIcon.displayMessage("connection", "Error : "+e1.toString(), MessageType.INFO);
System.out.println("Unable to make connection with DB"+e1.toString());
       e1.printStackTrace();
   }
 }
 }
  public class LoginDemo
 {
   public static void main(String arg[])
   {
   try
   {
   Login frame=new Login();
   frame.setSize(400,200);
   frame.setVisible(true);
   }
   catch(Exception e)
   {JOptionPane.showMessageDialog(null, e.getMessage());}
   }
 }
