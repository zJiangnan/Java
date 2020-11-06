package com.Test.Book;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test extends JFrame {

	/**
	 * ����ͼ�鴰��
	 * @param args
	 */
	
	JPanel jp;//���
	JLabel jl1,jl2,jl3;//����
	JTextField jtf1,jtf2,jtf3;//�ı���
	JButton bt1,bt2;//��ť
	
	public Test(){
		jp = new JPanel();
		jl1 = new JLabel("ͼ�����ƣ�");
		jl2 = new JLabel("ͼ�����ߣ�");
		jl3 = new JLabel("ͼ��۸�");
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		bt1 = new JButton("����");
		bt2 = new JButton("����");
		
		jp.add(jl1);jp.add(jtf1);
		jp.add(jl2);jp.add(jtf2);
		jp.add(jl3);jp.add(jtf3);
		jp.add(bt1);jp.add(bt2);
		jp.setLayout(null);
		jl1.setBounds(100, 30, 80, 30);
		jl2.setBounds(100, 80, 80, 30);
		jl3.setBounds(100, 130, 80, 30);
		jtf1.setBounds(200, 30, 100, 30);
		jtf2.setBounds(200, 80, 100, 30);
		jtf3.setBounds(200, 130, 100, 30);
		bt1.setBounds(100, 230, 80, 30);
		bt2.setBounds(260, 230, 80, 30);
		this.setTitle("���ͼ��");
		this.add(jp);
		this.setSize(400,400);
		this.setVisible(true);
		bt1.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				String bookname = jtf1.getText();
				String author = jtf2.getText();
				double price = Double.parseDouble(jtf3.getText());
				Book book = new Book(bookname,author,price);
				int result = new BookDaoImpl().bookAdd(book);
				if(result == 1){
					JOptionPane.showMessageDialog(null, "ͼ����ӳɹ���");
				}
				else
					JOptionPane.showMessageDialog(null, "ͼ�����ʧ�ܣ�");
			}});
		bt2.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent arg0) {
				jtf1.setText("");
				jtf2.setText("");
				jtf3.setText("");
				
			}});
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new Test();
	}

}
