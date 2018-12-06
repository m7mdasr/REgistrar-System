package funcs;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import java.awt.BorderLayout;

import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Canvas;
import javax.swing.JPanel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;

public class dasd extends JFrame{

	private JTable table;
	JLabel lblNewLabel;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JLabel label_8;
	private JLabel label_9;
	private JLabel label_10;
	private JLabel label_11;
	private JLabel label_12;
	private JLabel label_13;
	private JLabel label_14;
	private JLabel label_15;
	private JLabel label_16;
	private JLabel label_17;
	private JLabel label_18;
	private JLabel label_19;
	private JLabel label_20;
	private JLabel label_21;
	private JLabel label_22;
	private JLabel label_23;
	private JLabel label_24;
	private JLabel label_25;
	private JLabel label_26;
	private JLabel label_27;
	private JLabel label_28;
	private JLabel label_29;
	private JLabel label_30;
	private JLabel label_31;
	private JLabel label_32;
	private JLabel label_33;
	private JButton btnAddSection;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JLabel label_34;
	private JLabel label_35;
	private JLabel label_36;
	private JLabel label_37;
	private JLabel label_38;
	private JLabel label_39;
	private JLabel label_40;
	private JButton button_4;
	private JPanel panel_3;
	private JPanel panel_4;
	private JPanel panel_5;
	private JPanel panel_6;
	private JLabel label_41;
	private JLabel label_42;
	private JLabel label_43;
	private JLabel label_44;
	private JLabel label_45;
	private JLabel label_46;
	private JLabel label_47;
	private JLabel label_48;
	
	       
	
	
	public dasd() {
		
		setBackground(new Color(192, 192, 192));
		setBounds(100, 100, 1050, 670);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("8:00am to 8:50am");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 12));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setBounds(208, 199, 105, 40);
		getContentPane().add(lblNewLabel);
		
		label = new JLabel("9:00am to 9:50am");
		label.setFont(new Font("Arial", Font.BOLD, 12));
		label.setBackground(Color.GRAY);
		label.setBounds(208, 270, 105, 40);
		getContentPane().add(label);
		
		label_1 = new JLabel("2:00am to 2:50am");
		label_1.setFont(new Font("Arial", Font.BOLD, 12));
		label_1.setBackground(Color.GRAY);
		label_1.setBounds(208, 540, 105, 40);
		getContentPane().add(label_1);
		
		label_2 = new JLabel("10:00am to 10:50am");
		label_2.setFont(new Font("Arial", Font.BOLD, 12));
		label_2.setBackground(Color.GRAY);
		label_2.setBounds(208, 340, 118, 40);
		getContentPane().add(label_2);
		
		label_3 = new JLabel("11:00am to 11:50am");
		label_3.setFont(new Font("Arial", Font.BOLD, 12));
		label_3.setBackground(Color.GRAY);
		label_3.setBounds(208, 408, 118, 40);
		getContentPane().add(label_3);
		
		label_4 = new JLabel("Building 6 : Room125");
		label_4.setFont(new Font("Arial", Font.BOLD, 12));
		label_4.setBackground(Color.GRAY);
		label_4.setBounds(477, 199, 118, 40);
		getContentPane().add(label_4);
		
		label_5 = new JLabel("3");
		label_5.setFont(new Font("Arial", Font.BOLD, 12));
		label_5.setBackground(Color.GRAY);
		label_5.setBounds(639, 199, 12, 40);
		getContentPane().add(label_5);
		
		label_6 = new JLabel("18392");
		label_6.setFont(new Font("Arial", Font.BOLD, 12));
		label_6.setBackground(Color.GRAY);
		label_6.setBounds(721, 199, 35, 40);
		getContentPane().add(label_6);
		
		label_7 = new JLabel("Lec");
		label_7.setFont(new Font("Arial", Font.BOLD, 12));
		label_7.setBackground(Color.GRAY);
		label_7.setBounds(819, 199, 35, 40);
		getContentPane().add(label_7);
		
		label_8 = new JLabel("Adel Said");
		label_8.setFont(new Font("Arial", Font.BOLD, 12));
		label_8.setBackground(Color.GRAY);
		label_8.setBounds(364, 199, 64, 40);
		getContentPane().add(label_8);
		
		label_9 = new JLabel("MATH201");
		label_9.setFont(new Font("Arial", Font.BOLD, 12));
		label_9.setBackground(Color.GRAY);
		label_9.setBounds(66, 199, 64, 40);
		getContentPane().add(label_9);
		
		label_10 = new JLabel("MATH201");
		label_10.setFont(new Font("Arial", Font.BOLD, 12));
		label_10.setBackground(Color.GRAY);
		label_10.setBounds(66, 270, 64, 40);
		getContentPane().add(label_10);
		
		label_11 = new JLabel("MATH201");
		label_11.setFont(new Font("Arial", Font.BOLD, 12));
		label_11.setBackground(Color.GRAY);
		label_11.setBounds(66, 340, 64, 40);
		getContentPane().add(label_11);
		
		label_12 = new JLabel("MATH201");
		label_12.setFont(new Font("Arial", Font.BOLD, 12));
		label_12.setBackground(Color.GRAY);
		label_12.setBounds(66, 408, 64, 40);
		getContentPane().add(label_12);
		
		label_13 = new JLabel("MATH201");
		label_13.setFont(new Font("Arial", Font.BOLD, 12));
		label_13.setBackground(Color.GRAY);
		label_13.setBounds(66, 540, 64, 40);
		getContentPane().add(label_13);
		
		label_14 = new JLabel("Khaled Ali");
		label_14.setFont(new Font("Arial", Font.BOLD, 12));
		label_14.setBackground(Color.GRAY);
		label_14.setBounds(364, 270, 64, 40);
		getContentPane().add(label_14);
		
		label_15 = new JLabel("Waleed Adam");
		label_15.setFont(new Font("Arial", Font.BOLD, 12));
		label_15.setBackground(Color.GRAY);
		label_15.setBounds(349, 340, 79, 40);
		getContentPane().add(label_15);
		
		label_16 = new JLabel("Omar Alsoma");
		label_16.setFont(new Font("Arial", Font.BOLD, 12));
		label_16.setBackground(Color.GRAY);
		label_16.setBounds(349, 408, 79, 40);
		getContentPane().add(label_16);
		
		label_17 = new JLabel("Omar Jameel");
		label_17.setFont(new Font("Arial", Font.BOLD, 12));
		label_17.setBackground(Color.GRAY);
		label_17.setBounds(349, 540, 79, 40);
		getContentPane().add(label_17);
		
		label_18 = new JLabel("Building 4 : Room101");
		label_18.setFont(new Font("Arial", Font.BOLD, 12));
		label_18.setBackground(Color.GRAY);
		label_18.setBounds(477, 270, 118, 40);
		getContentPane().add(label_18);
		
		label_19 = new JLabel("Building 7 : Room129");
		label_19.setFont(new Font("Arial", Font.BOLD, 12));
		label_19.setBackground(Color.GRAY);
		label_19.setBounds(477, 340, 118, 40);
		getContentPane().add(label_19);
		
		label_20 = new JLabel("Building 59 : Room1012");
		label_20.setFont(new Font("Arial", Font.BOLD, 12));
		label_20.setBackground(Color.GRAY);
		label_20.setBounds(474, 408, 132, 40);
		getContentPane().add(label_20);
		
		label_21 = new JLabel("Building 4 : Room111");
		label_21.setFont(new Font("Arial", Font.BOLD, 12));
		label_21.setBackground(Color.GRAY);
		label_21.setBounds(477, 540, 118, 40);
		getContentPane().add(label_21);
		
		label_22 = new JLabel("3");
		label_22.setFont(new Font("Arial", Font.BOLD, 12));
		label_22.setBackground(Color.GRAY);
		label_22.setBounds(639, 270, 12, 40);
		getContentPane().add(label_22);
		
		label_23 = new JLabel("3");
		label_23.setFont(new Font("Arial", Font.BOLD, 12));
		label_23.setBackground(Color.GRAY);
		label_23.setBounds(639, 340, 12, 40);
		getContentPane().add(label_23);
		
		label_24 = new JLabel("3");
		label_24.setFont(new Font("Arial", Font.BOLD, 12));
		label_24.setBackground(Color.GRAY);
		label_24.setBounds(639, 408, 12, 40);
		getContentPane().add(label_24);
		
		label_25 = new JLabel("3");
		label_25.setFont(new Font("Arial", Font.BOLD, 12));
		label_25.setBackground(Color.GRAY);
		label_25.setBounds(639, 540, 12, 40);
		getContentPane().add(label_25);
		
		label_26 = new JLabel("18391");
		label_26.setFont(new Font("Arial", Font.BOLD, 12));
		label_26.setBackground(Color.GRAY);
		label_26.setBounds(721, 270, 35, 40);
		getContentPane().add(label_26);
		
		label_27 = new JLabel("18398");
		label_27.setFont(new Font("Arial", Font.BOLD, 12));
		label_27.setBackground(Color.GRAY);
		label_27.setBounds(721, 340, 35, 40);
		getContentPane().add(label_27);
		
		label_28 = new JLabel("18395");
		label_28.setFont(new Font("Arial", Font.BOLD, 12));
		label_28.setBackground(Color.GRAY);
		label_28.setBounds(721, 408, 35, 40);
		getContentPane().add(label_28);
		
		label_29 = new JLabel("18397");
		label_29.setFont(new Font("Arial", Font.BOLD, 12));
		label_29.setBackground(Color.GRAY);
		label_29.setBounds(721, 540, 35, 40);
		getContentPane().add(label_29);
		
		label_30 = new JLabel("Lec");
		label_30.setFont(new Font("Arial", Font.BOLD, 12));
		label_30.setBackground(Color.GRAY);
		label_30.setBounds(819, 270, 35, 40);
		getContentPane().add(label_30);
		
		label_31 = new JLabel("Lec");
		label_31.setFont(new Font("Arial", Font.BOLD, 12));
		label_31.setBackground(Color.GRAY);
		label_31.setBounds(819, 340, 35, 40);
		getContentPane().add(label_31);
		
		label_32 = new JLabel("Lec");
		label_32.setFont(new Font("Arial", Font.BOLD, 12));
		label_32.setBackground(Color.GRAY);
		label_32.setBounds(819, 408, 35, 40);
		getContentPane().add(label_32);
		
		label_33 = new JLabel("Lec");
		label_33.setFont(new Font("Arial", Font.BOLD, 12));
		label_33.setBackground(Color.GRAY);
		label_33.setBounds(819, 540, 35, 40);
		getContentPane().add(label_33);
		
		label_34 = new JLabel("1:00am to 1:50am");
		label_34.setFont(new Font("Arial", Font.BOLD, 12));
		label_34.setBackground(Color.GRAY);
		label_34.setBounds(208, 468, 105, 40);
		getContentPane().add(label_34);
		
		label_35 = new JLabel("MATH201");
		label_35.setFont(new Font("Arial", Font.BOLD, 12));
		label_35.setBackground(Color.GRAY);
		label_35.setBounds(66, 468, 64, 40);
		getContentPane().add(label_35);
		
		label_36 = new JLabel("Ali Salah");
		label_36.setFont(new Font("Arial", Font.BOLD, 12));
		label_36.setBackground(Color.GRAY);
		label_36.setBounds(364, 468, 58, 40);
		getContentPane().add(label_36);
		
		label_37 = new JLabel("Building 6 : Room125");
		label_37.setFont(new Font("Arial", Font.BOLD, 12));
		label_37.setBackground(Color.GRAY);
		label_37.setBounds(477, 468, 118, 40);
		getContentPane().add(label_37);
		
		label_38 = new JLabel("3");
		label_38.setFont(new Font("Arial", Font.BOLD, 12));
		label_38.setBackground(Color.GRAY);
		label_38.setBounds(639, 468, 12, 40);
		getContentPane().add(label_38);
		
		label_39 = new JLabel("18394");
		label_39.setFont(new Font("Arial", Font.BOLD, 12));
		label_39.setBackground(Color.GRAY);
		label_39.setBounds(721, 468, 35, 40);
		getContentPane().add(label_39);
		
		label_40 = new JLabel("Lec");
		label_40.setFont(new Font("Arial", Font.BOLD, 12));
		label_40.setBackground(Color.GRAY);
		label_40.setBounds(819, 468, 35, 40);
		getContentPane().add(label_40);
		
		label_41 = new JLabel("Timing");
		label_41.setFont(new Font("Arial", Font.BOLD, 13));
		label_41.setBackground(Color.GRAY);
		label_41.setBounds(234, 137, 45, 40);
		getContentPane().add(label_41);
		
		label_42 = new JLabel("Course");
		label_42.setFont(new Font("Arial", Font.BOLD, 13));
		label_42.setBackground(Color.GRAY);
		label_42.setBounds(71, 137, 45, 40);
		getContentPane().add(label_42);
		
		label_43 = new JLabel("Instructor");
		label_43.setFont(new Font("Arial", Font.BOLD, 13));
		label_43.setBackground(Color.GRAY);
		label_43.setBounds(364, 137, 64, 40);
		getContentPane().add(label_43);
		
		label_44 = new JLabel("Location");
		label_44.setFont(new Font("Arial", Font.BOLD, 13));
		label_44.setBackground(Color.GRAY);
		label_44.setBounds(505, 137, 58, 40);
		getContentPane().add(label_44);
		
		label_45 = new JLabel("Credit");
		label_45.setFont(new Font("Arial", Font.BOLD, 13));
		label_45.setBackground(Color.GRAY);
		label_45.setBounds(626, 137, 45, 40);
		getContentPane().add(label_45);
		
		label_46 = new JLabel("CRN");
		label_46.setFont(new Font("Arial", Font.BOLD, 13));
		label_46.setBackground(Color.GRAY);
		label_46.setBounds(721, 137, 35, 40);
		getContentPane().add(label_46);
		
		label_47 = new JLabel("Type");
		label_47.setFont(new Font("Arial", Font.BOLD, 13));
		label_47.setBackground(Color.GRAY);
		label_47.setBounds(819, 137, 35, 40);
		getContentPane().add(label_47);
		
		label_48 = new JLabel("Add button");
		label_48.setFont(new Font("Arial", Font.BOLD, 13));
		label_48.setBackground(Color.GRAY);
		label_48.setBounds(915, 137, 76, 40);
		getContentPane().add(label_48);
		
		btnAddSection = new JButton("Add section");
		btnAddSection.setBounds(902, 208, 89, 23);
		getContentPane().add(btnAddSection);
		
		button = new JButton("Add section");
		button.setBounds(902, 279, 89, 23);
		getContentPane().add(button);
		
		button_1 = new JButton("Add section");
		button_1.setBounds(902, 349, 89, 23);
		getContentPane().add(button_1);
		
		button_2 = new JButton("Add section");
		button_2.setBounds(902, 417, 89, 23);
		getContentPane().add(button_2);
		
		button_3 = new JButton("Add section");
		button_3.setBounds(902, 549, 89, 23);
		getContentPane().add(button_3);
		
		button_4 = new JButton("Add section");
		button_4.setBounds(902, 477, 89, 23);
		getContentPane().add(button_4);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		panel.setBounds(10, 188, 1014, 71);
		getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		panel_1.setBounds(10, 321, 1014, 76);
		getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(10, 459, 1014, 65);
		getContentPane().add(panel_2);
		
		panel_3 = new JPanel();
		panel_3.setBackground(new Color(220, 220, 220));
		panel_3.setBounds(10, 391, 1014, 75);
		getContentPane().add(panel_3);
		
		panel_4 = new JPanel();
		panel_4.setBackground(new Color(220, 220, 220));
		panel_4.setBounds(10, 519, 1024, 75);
		getContentPane().add(panel_4);
		
		panel_5 = new JPanel();
		panel_5.setBackground(new Color(220, 220, 220));
		panel_5.setBounds(10, 254, 1014, 84);
		getContentPane().add(panel_5);
		
		panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 128, 0));
		panel_6.setBounds(10, 128, 1014, 71);
		getContentPane().add(panel_6);
		
		table = new JTable();
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setBackground(new Color(245, 222, 179));
		table.setToolTipText("");
		table.setBorder(null);
		table.setForeground(Color.RED);
		table.setBounds(10, 128, 1014, 460);
		getContentPane().add(table);
	}
}
