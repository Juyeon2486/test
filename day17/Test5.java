package com.day17;
//성적을 입력받아 합계를 계산해주는 윈도우 만들기 

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
	
	private TextField[] tf = new TextField[4]; //텍스트 필드가 100개 필요하면 100개 만들어야함 그래서 배열 이용 
	private Label result = new Label("", Label.LEFT);  //커서의 선정위치? 
	private Button btn1,btn2;  //버튼은 두개뿐이라 선언함 
	
	public Test5() { //기본생성자 
		String[] title = {"이름", "국어","영어","수학","총점"};
		
		setLayout(null); //수동으로 배치하겠다 레이아웃을 초기화해서 
		for(int i=0;i<5;i++) {  //다섯번 돌면 아래가 다섯번 만들어진다 
			Label lbl = new Label(); 
			lbl.setText(title[i]);
			lbl.setBounds(10, (i+1)*30, 50, 20); //좌표 50*20크기의 박스를 생성 
			add(lbl);     //프레임에 넣음 
			if(i!=4) {  //f가 4랑 같지않을때 까지 텍스트 빌드를 넣어라 
				tf[i] = new TextField(); //tf배열안에 텍스트필드라는 객체를 넣어라  레코드똑같음 위에서 배열만들고 안에 텍스트필드넣음 
				tf[i].setBounds(80, (i+1)*30,70,20); //좌표(x,y)에 70*20 크기의 텍스트필드 생성 
				tf[i].addKeyListener(new KeyHandler()); //키리스너 반응보여서 엔터 
				add(tf[i]);
				
			}else {
				result.setBounds(80,(i+1)*30,70,20);
				add(result); //화면에 보여주기 위해 
			}
		}
		
		//버튼 
		btn1 = new Button("결과");
		btn1.setBounds(180,30,60,20);
		add(btn1);
		btn1.addActionListener(this);   
		btn1.addKeyListener(new KeyHandler());  //한번만 쓸거면 키핸들러 자리에 키 아답터쓰면 된다  //키리스너 키보드감시 
		
		btn2 = new Button("종료");
		btn2.setBounds(180,60,60,20);
		add(btn2);
		btn2.addActionListener(this);
		
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		
		});
		
		setTitle("성적처리");
		setSize(260, 180);
		setResizable(false);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new Test5();

	}

	@Override
	public void actionPerformed(ActionEvent e) {  //메소드의 바깥부분 따닥괄호클릭 하면 
		
		Object ob = e.getSource(); //이벤트를 받아냄 
		
		if(ob instanceof Button) {    //버튼이야??
			
			Button b = (Button)ob;  //오비를 버튼으로 다운캐스팅해 
			
			if(b==btn1) {
				
				//연산 
				execute();
				
			}else if(b==btn2) {    //btn2는 종료코딩쓰면 된다 
				
				System.exit(0); //종료
				
			
			}	
		}
	}
	
	private void execute() {
	    
					int tot = 0;
					
					try {
						
						for(int i=1;i<=3;i++) {
							
							tot+=Integer.parseInt(tf[i].getText());
						
						}
						
						result.setText(Integer.toString(tot));  //문자로 바꿔서 
						//return.setText("" + tot)    널을 더해주면 숫자가 문자가된다 
						
						
					} catch (Exception e2) {
						result.setText("입력오류!!");
					}
	}
	
	
	class KeyHandler extends KeyAdapter{ //키프레스 오버라이드  키핸들러가 키 아답터를 상속받음 

		@Override
		public void keyPressed(KeyEvent e) {     //엔터를 칠때마다감시하는 감시자 사용자에게 엔터를 치고 행동을 이한테 이한테 명령을 알려주는       
												//엔터치는게 너무많으니까 오브젝트(가장상위메소드)
			Object ob = e.getSource();
			
			if(e.getKeyCode()!=KeyEvent.VK_ENTER) {
				return;   //같지 않으면 반응을 보이지마 
			}
			
			//엔터를 쳤을때 검증 
			if(ob instanceof Button) {
				
				Button b = (Button)ob; //버튼으로 다운캐스트 
				
				if(b==btn1) {
					
					//연산 
					execute(); //자주씀 
					return;
				}
			}
				if (ob instanceof TextField){  //텍스트필드엔터오비에서 받은게 텍스트필드냐 
					TextField t = (TextField)ob;  //다운캐스트 
					for(int i=0;i<tf.length;i++) { //t는 엔  
						if(i!=3&&tf[i]==t)  {  //f가 3하고 같지 않으면서 텍트스에프가 티여야한다   tf의 0번째가 현재 자기 자신이여야한다
							tf[i+1].requestFocus(); //다음칸 텍스트필드로 옮겨라 
							return; //여기서 리턴의 의미 클릭하면 포문 빠져나감 
						}else if(tf[3]==t) { //수학의 위치 
							btn1.requestFocus(); //버튼1로 포커스를 옮겨라 
						}			
					}
				}
			}	
		}
	}

