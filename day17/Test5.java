package com.day17;
//������ �Է¹޾� �հ踦 ������ִ� ������ ����� 

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.Set;

public class Test5 extends Frame implements ActionListener{ 
	
	private static final long serialVersionUID = 1L;
	
	private TextField[] tf = new TextField[4]; //�ؽ�Ʈ �ʵ尡 100�� �ʿ��ϸ� 100�� �������� �׷��� �迭 �̿� 
	private Label result = new Label("", Label.LEFT);  //Ŀ���� ������ġ? 
	private Button btn1,btn2;  //��ư�� �ΰ����̶� ������ 
	
	public Test5() { //�⺻������ 
		String[] title = {"�̸�", "����","����","����","����"};
		
		setLayout(null); //�������� ��ġ�ϰڴ� ���̾ƿ��� �ʱ�ȭ�ؼ� 
		for(int i=0;i<5;i++) {  //�ټ��� ���� �Ʒ��� �ټ��� ��������� 
			Label lbl = new Label(); 
			lbl.setText(title[i]);
			lbl.setBounds(10, (i+1)*30, 50, 20); //��ǥ 50*20ũ���� �ڽ��� ���� 
			add(lbl);     //�����ӿ� ���� 
			if(i!=4) {  //f�� 4�� ���������� ���� �ؽ�Ʈ ���带 �־�� 
				tf[i] = new TextField(); //tf�迭�ȿ� �ؽ�Ʈ�ʵ��� ��ü�� �־��  ���ڵ�Ȱ��� ������ �迭����� �ȿ� �ؽ�Ʈ�ʵ���� 
				tf[i].setBounds(80, (i+1)*30,70,20); //��ǥ(x,y)�� 70*20 ũ���� �ؽ�Ʈ�ʵ� ���� 
				tf[i].addKeyListener(new KeyHandler()); //Ű������ ���������� ���� 
				add(tf[i]);
				
			}else {
				result.setBounds(80,(i+1)*30,70,20);
				add(result); //ȭ�鿡 �����ֱ� ���� 
			}
		}
		
		//��ư 
		btn1 = new Button("���");
		btn1.setBounds(180,30,60,20);
		add(btn1);
		btn1.addActionListener(this);   
		btn1.addKeyListener(new KeyHandler());  //�ѹ��� ���Ÿ� Ű�ڵ鷯 �ڸ��� Ű �ƴ��;��� �ȴ�  //Ű������ Ű���尨�� 
		
		btn2 = new Button("����");
		btn2.setBounds(180,60,60,20);
		add(btn2);
		btn2.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
		setTitle("����ó��");
		setSize(260, 180);
		setResizable(false);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Test5();

	}

	@Override
	public void actionPerformed(ActionEvent e) {  //�޼ҵ��� �ٱ��κ� ���ڰ�ȣŬ�� �ϸ� 
		
		Object ob = e.getSource(); //�̺�Ʈ�� �޾Ƴ� 
		
		if(ob instanceof Button) {    //��ư�̾�??
			
			Button b = (Button)ob;  //���� ��ư���� �ٿ�ĳ������ 
			
			if(b==btn1) {
				
				//���� 
				execute();
				
			}else if(b==btn2) {    //btn2�� �����ڵ����� �ȴ� 
				
				System.exit(0); //����
				
			
			}	
		}
	}
	
	private void execute() {
	    
					int tot = 0;
					
					try {
						
						for(int i=1;i<=3;i++) {
							
							tot+=Integer.parseInt(tf[i].getText());
						
						}
						
						result.setText(Integer.toString(tot));  //���ڷ� �ٲ㼭 
						//return.setText("" + tot)    ���� �����ָ� ���ڰ� ���ڰ��ȴ� 
						
						
					} catch (Exception e2) {
						result.setText("�Է¿���!!");
					}
	}
	
	
	class KeyHandler extends KeyAdapter{ //Ű������ �������̵�  Ű�ڵ鷯�� Ű �ƴ��͸� ��ӹ��� 

		@Override
		public void keyPressed(KeyEvent e) {     //���͸� ĥ�����ٰ����ϴ� ������ ����ڿ��� ���͸� ġ�� �ൿ�� ������ ������ ����� �˷��ִ�       
												//����ġ�°� �ʹ������ϱ� ������Ʈ(��������޼ҵ�)
			Object ob = e.getSource();
			
			if(e.getKeyCode()!=KeyEvent.VK_ENTER) {
				return;   //���� ������ ������ �������� 
			}
			
			//���͸� ������ ���� 
			if(ob instanceof Button) {
				
				Button b = (Button)ob; //��ư���� �ٿ�ĳ��Ʈ 
				
				if(b==btn1) {
					
					//���� 
					execute(); //���־� 
					return;
				}
			}
				if (ob instanceof TextField){  //�ؽ�Ʈ�ʵ忣�Ϳ��񿡼� ������ �ؽ�Ʈ�ʵ�� 
					TextField t = (TextField)ob;  //�ٿ�ĳ��Ʈ 
					for(int i=0;i<tf.length;i++) { //t�� ��  
						if(i!=3&&tf[i]==t)  {  //f�� 3�ϰ� ���� �����鼭 ��Ʈ�������� Ƽ�����Ѵ�   tf�� 0��°�� ���� �ڱ� �ڽ��̿����Ѵ�
							tf[i+1].requestFocus(); //����ĭ �ؽ�Ʈ�ʵ�� �Űܶ� 
							return; //���⼭ ������ �ǹ� Ŭ���ϸ� ���� �������� 
						}else if(tf[3]==t) { //������ ��ġ 
							btn1.requestFocus(); //��ư1�� ��Ŀ���� �Űܶ� 
						}			
					}
				}
			}	
		}
	}

