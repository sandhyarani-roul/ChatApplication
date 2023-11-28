import java.util.*;
import java.awt.*;
import java.io.*;
import java.lang.*;
import java.swing.*;
import java.awt.event.*;
import java.net.*;
public class Client extends Jframe implements ActionListener,Runnable
{
	JTextField tf1;
	JTextArea ta1;
	JScrollPane p1;
	JButton b1;
	ServerSocket ss;
	Socket s1;
	PrintWriter pw;
	BufferedReader br;

public client ()
{
	setLayout null;
	setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	tf1=new JTextField();
	ta1=new JTextArea();
	p1=new JScrollPane();
	b1=new JButton();

	add(tf1);
	add (p1);
	add (b1);
	setTitle("chat client");
	setSize(350,400);
	setVisible(true);
}


}