package lab11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

public class GUI implements ActionListener{
	
	JFrame frame;
	private JPanel c1, c2;
	private JButton addBook, addVerse, addRoot, ImportPoemBtn, importPoemBtn1;
	private Container contentPane;

	public GUI() {
		init();
	}

	public void init() {

		frame = new JFrame("GUI");
		frame.setSize(1080, 720);
		frame.setLocation(150, 10);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = frame.getContentPane();
		c1 = new JPanel();
		c1.setLayout(null);
		ImportPoemBtn = new JButton("Import Poem");
		addBook = new JButton("Add Book");
		addVerse = new JButton("Add Verse");
		addRoot = new JButton("Add new root");
		c1.setBounds(0, 0, 200, 720);

	

	}

	public static void main(String[] args) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		
	}
}
