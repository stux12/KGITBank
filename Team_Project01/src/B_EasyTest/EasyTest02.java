package B_EasyTest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import A_Main.JavaTestList;

import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JDesktopPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EasyTest02 extends EasyTest01 {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EasyTest02 frame = new EasyTest02(EasyCount);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param easyCount 
	 * @param easyCount 
	 * @param easyCount 
	 */
	public EasyTest02(int easyCount) {
		super(easyCount);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("난이도 下");
		lblNewLabel.setIcon(new ImageIcon(EasyTest01.class.getResource("/image/chick.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		lblNewLabel.setBounds(12, 10, 94, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setOpaque(true);
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setBounds(0, 55, 734, 1);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2/10");
		lblNewLabel_2.setFont(new Font("맑은 고딕", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(681, 11, 41, 27);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("<html>Q 02 String a = \"ondal\";<br/>System.out.print(a)를 하면 무엇이 출력될까요??\r\n");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("맑은 고딕", Font.PLAIN, 30));
		lblNewLabel_3.setBounds(35, 83, 659, 111);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton = new JButton("아무것도 출력되지 않는다");
		btnNewButton.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(255, 255, 0));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest03(EasyCount).setVisible(true);
			}
		});
		btnNewButton.setBounds(35, 252, 659, 50);
		contentPane.add(btnNewButton);
		
		JButton btnOndai = new JButton("ondai");
		btnOndai.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnOndai.setBackground(new Color(255, 255, 0));
		btnOndai.setForeground(new Color(0, 0, 0));
		btnOndai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest03(EasyCount).setVisible(true);
			}
		});
		btnOndai.setBounds(35, 348, 659, 50);
		contentPane.add(btnOndai);
		
		JButton btnUndal = new JButton("undal");
		btnUndal.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnUndal.setBackground(new Color(255, 255, 0));
		btnUndal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTest03(EasyCount).setVisible(true);
			}
		});
		btnUndal.setBounds(35, 435, 659, 50);
		contentPane.add(btnUndal);
		
		JButton btnOndal = new JButton("ondal");
		btnOndal.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		btnOndal.setBackground(new Color(255, 255, 0));
		btnOndal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EasyCount++;
				dispose();
				setVisible(false);
				new EasyTest03(EasyCount).setVisible(true);
			}
		});
		btnOndal.setBounds(35, 523, 659, 50);
		contentPane.add(btnOndal);
		
		JButton button_5 = new JButton("처음문제로");
		button_5.setIcon(new ImageIcon(EasyTest02.class.getResource("/image/Yhome.png")));
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				EasyCount=0;
				dispose();
				setVisible(false);
				new EasyTest01(EasyCount).setVisible(true);
			}
		});
		button_5.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_5.setBackground(new Color(255, 255, 0));
		button_5.setBounds(35, 615, 174, 52);
		contentPane.add(button_5);
		
		JButton button_4 = new JButton("포기해요?");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_4.setIcon(new ImageIcon(EasyTest01.class.getResource("/image/smiley.png")));
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				setVisible(false);
				new EasyTestLast(EasyCount).setVisible(true);
			}
		});
		button_4.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		button_4.setBackground(new Color(255, 255, 0));
		button_4.setBounds(520, 615, 174, 52);
		contentPane.add(button_4);
	}
}