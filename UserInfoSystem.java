import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

// import 파일
public class UserInfoSystem extends JFrame implements ActionListener, ListSelectionListener
{

   //------------------------------------------------------------------------------
    // 사용자 UI를 위해 필요한 변수들 선언 
    //------------------------------------------------------------------------------
    private Vector<User> collection; // a collection of Student objects 
    
    //  GUI 컴포넌트를 위한 멤버 변수들 선언
    private JPanel leftPanel, topPanel,addPanel0, addPanel, addPanel2, addPanel3, centerPanel, infoPanel, editPanel, ProfilePanel, profilePanel, buttonAddPanel, buttonAddPane2, buttonAddPane3, searchPanel, listPanel, Info2Panel3 ,Info2Panel2 ,Info2Panel,Info2Panel4,buttonEditPanel,loginPanel2,infoPanel2,infoPanel3, addPanel1, ChangePanel,ChangeList,loginPanel;
    private JPanel phonebookList, phonebookDelete ,checkPanel1,checkPanel2, checkPanel3,checkPanel4,checkPanel5,noteList, noteDelete, scheduleList, scheduleDelete,smallphonebookList,smallnoteList,smallnoteList2,smallphonebookList2;
    private JLabel lblTitle;
    private JLabel label1,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14,label15,label16,label17,label18,label19,label120;
    private JLabel  lblPhoneName, lblPhoneNumber,lblScheduleDate, lblScheduleExplain, lblNoteTitle,lblNoteMemo, lblProfile;
    private DefaultListModel listModel ;
    private JButton btnPhoto;
    private JTextField txtPhoneName, txtPhoneNumber, txtScheduleDate, txtScheduleExplain, txtNoteTitle, txtNoteMemo;
    private JButton btnAdd1, btnAdd2, btnAdd3, btnAdd4, btnAdd5, btnAdd6, btnCancel,btnSearch,btnDel,btnDel1,btnDel2,btnDel3,btnDel11,btnDel22,btnDel33;
    private JFileChooser fc;
    private JPanel checkPanel;
    private JTextArea txtinfo1, txtinfo2, phonetxt, scheduletxt, notetxt, phonetxt1, scheduletxt1, notetxt1;
    //private JRadioButton grade1, grade2, grade3, grade4;
   // private JComboBox year, month, day, search;
    private JList stdList ;
    private JTextField jtf1,jtf2;
    private JLabel image;
    private int index, state;
    private int hgap;
    private int vgap;
    private JMenuItem jmi1,jmi2,jmi3;
    private JCheckBox bookCheck1,bookCheck2,deleteCheck,bookCheck3,bookCheck4,bookCheck5,bookCheck6,bookCheck7,bookCheck8;
    private JCheckBox phonebookCheck,noteCheck;
    private String id = "sw";
    private String password = "sw";
    public JTextField tf, tf2;
    public JPasswordField pf, pf2;
    private JButton loginButton, ChangeButton, ChangeListButton;
    JLabel loginText = new JLabel();
    JLabel ChangeText = new JLabel();
    private boolean isLogin = false;
    private boolean checkNote = false;
    private boolean CheckSchdule = false;
    private boolean checkPhone = false;
    public int a[] = new int[6];
    public int phonecount = 0;
    static int schedulecount=0;
    static int notecount=0;
    static int flag[]= new int[6];

    //------------------------------------------------------------------------------
    //생성자 - GUI를 구성한다.
    //------------------------------------------------------------------------------
    public UserInfoSystem(){
     
     // collection 을 생성하다.   
     collection = new Vector<User>();

     fc = new JFileChooser();
     //콜렉션에추가하는방식
     
     //------------------------------------------------------------------------------
     // 사용자 화면에 컴포넌트들 구성하여 배치
     // 각 컴포넌트 구성시 필요한 리스너 등록
     //------------------------------------------------------------------------------  
  
       


      JMenuBar jmb=new JMenuBar();
      setJMenuBar(jmb);
      jtf1=new JTextField();
      
     // 상단 타이틀
     topPanel = new JPanel();
     lblTitle =new JLabel("유저 관리 시스템");
     lblTitle.setFont(new Font("돋움", Font.BOLD, 20));//글씨크기 위해
     topPanel.add(lblTitle);

     
     
     
     
     /////////////////////////////////////////////////////////////////////////////////
     // 학생정보 등록 panel  작성
     /////////////////////////////////////////////////////////////////////////////////
    
     addPanel =new JPanel();
     addPanel.setBorder(BorderFactory.createTitledBorder("Menu"));
     addPanel.setPreferredSize(new Dimension(300, 500));
     

     addPanel1 =new JPanel();
     addPanel1.setBorder(BorderFactory.createTitledBorder("Phone Book"));
     addPanel1.setPreferredSize(new Dimension(280, 150));
     
     
     addPanel2 =new JPanel();
     addPanel2.setBorder(BorderFactory.createTitledBorder("Scedule"));
     addPanel2.setPreferredSize(new Dimension(280, 150));
     
     addPanel3 =new JPanel();
     addPanel3.setBorder(BorderFactory.createTitledBorder("Note"));
     addPanel3.setPreferredSize(new Dimension(280, 150));
   
     
     
     addPanel.add(addPanel1);
     addPanel.add(addPanel2);
     addPanel.add(addPanel3);

   
     
     //라벨 지정   
     lblPhoneName = new JLabel("이름");
     lblPhoneNumber = new JLabel("전화번호");
     lblScheduleDate = new JLabel("날짜");
     lblScheduleExplain = new JLabel("일정");
     lblNoteTitle = new JLabel("제목");
     lblNoteMemo = new JLabel("내용");
   
    
     // 텍스트 지정
     txtPhoneName = new JTextField(20);
     txtPhoneNumber = new JTextField(18);
     txtScheduleDate= new JTextField(20);
     txtScheduleExplain = new JTextField(20);
     txtNoteTitle= new JTextField(20);
     txtNoteMemo = new JTextField(20);
  
     
     //컴포넌트 추가
     addPanel1.add(lblPhoneName);
     addPanel1.add(txtPhoneName);
     
     addPanel1.add(lblPhoneNumber);
     addPanel1.add(txtPhoneNumber);
     
     addPanel2.add(lblScheduleDate);
     addPanel2.add(txtScheduleDate);
     
     addPanel2.add(lblScheduleExplain);
     addPanel2.add(txtScheduleExplain);
     
     addPanel3.add(lblNoteTitle);
     addPanel3.add(txtNoteTitle);
     
     addPanel3.add(lblNoteMemo);
     addPanel3.add(txtNoteMemo);
     
     //버튼들 
     buttonAddPanel = new JPanel();
     btnAdd1 = new JButton("추가");
     buttonAddPanel.add(btnAdd1);
     addPanel1.add(btnAdd1);
     btnAdd1.addActionListener(new SavePhoneNumberEvent());
     
     
     buttonAddPanel = new JPanel();
     btnAdd4 = new JButton("리스트보기");
     btnAdd4.addActionListener(new ShowPhonebookList());
     buttonAddPanel.add(btnAdd4);
     addPanel1.add(btnAdd4);
     
     
     
     buttonAddPane2 = new JPanel();
     btnAdd2 = new JButton("추가");
     buttonAddPane2.add(btnAdd2);
     addPanel2.add(btnAdd2);
     btnAdd2.addActionListener(new SaveScheduleEvent());
   
     

     
     //buttonAddPanel = new JPanel();
     btnAdd5 = new JButton("리스트보기");
     btnAdd5.addActionListener(new ShowScheduleList());
     buttonAddPanel.add(btnAdd5);
     addPanel2.add(btnAdd5);
     
     buttonAddPane3 = new JPanel();
     btnAdd3 = new JButton("추가");
     buttonAddPane3.add(btnAdd3);
     addPanel3.add(btnAdd3);
     btnAdd3.addActionListener(new SaveNoteEvent());
     
     
    // buttonAddPanel = new JPanel();
     btnAdd6 = new JButton("리스트보기");
     btnAdd6.addActionListener(new ShowNoteList());
     buttonAddPanel.add(btnAdd6);
     addPanel3.add(btnAdd6);
   
   
     
     
/////////////////////////////////////////////////////////////////////////////////
// 가운데 center panel
/////////////////////////////////////////////////////////////////////////////////

centerPanel = new JPanel();
centerPanel.setBorder(BorderFactory.createTitledBorder("  "));
centerPanel.setPreferredSize(new Dimension(300, 550));
centerPanel.setLayout(new BorderLayout());

//연락처보기
phonebookList = new JPanel();
phonetxt = new JTextArea(20, 20);
phonetxt.setBounds(20, 200, 270, 300);
phonetxt.setLineWrap(true);
int bv = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int bh = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane bbjsp = new JScrollPane(phonetxt, bv, bh);
phonebookList.add(bbjsp);


//연락처 삭제 버튼 눌러졌을 때
checkPanel = new JPanel();
deleteCheck = new JCheckBox("");
checkPanel.add(deleteCheck);
phonebookDelete = new JPanel();
phonebookDelete.add(bbjsp);





// 노트보기 버튼 눌러졌을 때
noteList = new JPanel();
notetxt = new JTextArea(20, 20);
notetxt.setBounds(20, 200, 270, 300);
notetxt.setLineWrap(true);


//노트삭제버튼 눌러졌을 때
noteDelete = new JPanel();
noteDelete.add(bbjsp);



// 일정 보기 버튼 눌러졌을 때
scheduleList = new JPanel();
scheduletxt = new JTextArea(20, 20);
scheduletxt.setBounds(20, 200, 270, 300);
scheduletxt.setLineWrap(true);
JScrollPane bbbjsp = new JScrollPane(scheduletxt, bv, bh);
phonebookList.add(bbbjsp);



//일정 삭제 버튼 눌러졌을 때
scheduleDelete = new JPanel();
scheduleDelete.add(bbbjsp);
buttonEditPanel = new JPanel();
btnDel = new JButton("삭제");
btnDel.addActionListener(new ShowScheduleList());
btnDel22 = new JButton("스케줄을 삭제합니다.");
btnDel22.addActionListener(new ShowScheduleList());
btnDel22.setVisible(false);
buttonEditPanel.add(btnDel);
buttonEditPanel.add(btnDel22);

checkPanel = new JPanel();
checkPanel1 = new JPanel();
checkPanel2 = new JPanel();
checkPanel3= new JPanel();
checkPanel4= new JPanel();
checkPanel5= new JPanel();
GridLayout gl = new GridLayout(5,1);
checkPanel1.setLayout(gl);

bookCheck1 = new JCheckBox("");
bookCheck2 = new JCheckBox("");
bookCheck3  = new JCheckBox("");
bookCheck4  = new JCheckBox("");
bookCheck5  = new JCheckBox("");

bookCheck1.addActionListener(new JCheck());
bookCheck2.addActionListener(new JCheck());
bookCheck3.addActionListener(new JCheck());
bookCheck4.addActionListener(new JCheck());
bookCheck5.addActionListener(new JCheck());

checkPanel1.add(bookCheck1);
checkPanel1.add(bookCheck2);
checkPanel1.add(bookCheck3);
checkPanel1.add(bookCheck4);
checkPanel1.add(bookCheck5);

GridLayout gll = new GridLayout(5,1);
checkPanel.setLayout(gll);
checkPanel.add(checkPanel1);
checkPanel.add(checkPanel2);
checkPanel.add(checkPanel3);
checkPanel.add(checkPanel4);
checkPanel.add(checkPanel5);
centerPanel.add(scheduleDelete, BorderLayout.CENTER);
centerPanel.add(checkPanel, BorderLayout.WEST);
centerPanel.add(buttonEditPanel, BorderLayout.SOUTH);

     
     /////////////////////////////////////////////////////////////////////////////////
     // 상세 정보 panel
     /////////////////////////////////////////////////////////////////////////////////
     
     loginPanel = new JPanel();
     loginPanel.setPreferredSize(new Dimension(300, 80));
     loginPanel.setLayout(new BorderLayout());
     loginPanel2 = new JPanel();
     loginPanel2.setBorder(BorderFactory.createTitledBorder("로그인"));
     loginPanel2.setPreferredSize(new Dimension(280, 135));
     loginPanel2.setLayout(new FlowLayout());
     
     
     JPanel idPanel = new JPanel();
     JPanel passPanel = new JPanel();
     tf = new JTextField(12);
     pf = new JPasswordField(10);
     
     JLabel idLabel = new JLabel("ID : ");
     JLabel passLabel = new JLabel("PASSWORD : ");
     loginButton = new JButton("LOGIN");
     loginButton.addActionListener(new LoginEvent());
    
     
     idPanel.add(idLabel);
     idPanel.add(tf);
     passPanel.add(passLabel);
     passPanel.add(pf);

     setTitle("LOGIN");
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     

     loginPanel2.add(idPanel);
     loginPanel2.add(passPanel);
     loginPanel2.add(loginButton);
     loginPanel2.add(loginText);
     loginPanel.add(loginPanel2,BorderLayout.PAGE_START);
     setVisible(true);
     
     ChangePanel = new JPanel();
     ChangePanel.setBorder(BorderFactory.createTitledBorder("회원정보 변경"));
     ChangePanel.setPreferredSize(new Dimension(280, 150));
     ChangeButton = new JButton("내 정보 변경하기");
     ChangePanel.add(ChangeButton,BorderLayout.CENTER);
     ChangePanel.add(ChangeText,BorderLayout.PAGE_START);
     
     loginPanel.add(ChangePanel, BorderLayout.CENTER);
     
     ChangeButton.addActionListener(new ChangeEvent());
    
     
     
     
     
     // 프레임에  panel 추가
     add(topPanel, BorderLayout.PAGE_START);
     add(addPanel, BorderLayout.LINE_START);
     add(centerPanel, BorderLayout.CENTER);
     add(loginPanel, BorderLayout.LINE_END);
     
     setTitle("소프트웨어 공학 과제");
     setSize(900, 600);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
     setVisible(true);
     setResizable(false);
    }
    
  public class JCheck implements ActionListener{
	 
	  public JCheck j;
	   @Override
       public void actionPerformed(ActionEvent e) {
		  
		// !flagcheck(bookCheck1.isSelected(),flag[1])
		 //  if(bookCheck1.isSelected() && flag[1] == 0){
		   if(flagcheck(bookCheck1.isSelected(),flag[1])==0){
			   
			   a[1] = 1;
			   System.out.println("a1");
			   flag[1]= 1;
		   }
		   else if(bookCheck2.isSelected()&& flag[2] == 0){
			   a[2] = 1;
			   System.out.println("a2");
			   flag[2]= 1;
		   }
		   else if(bookCheck3.isSelected()&& flag[3] == 0){
			   a[3] = 1;
			   System.out.println("a3");
			   flag[3]= 1;
		   }
		   else if(bookCheck4.isSelected()&& flag[4] == 0){
			   a[4] = 1;
			   flag[4]= 1;
			   System.out.println("a4");
		   }else if(bookCheck5.isSelected()&& flag[5] == 0){
			   a[5] = 1;
			   flag[5]= 1;
			   System.out.println("a5");
		   }
		   }
	   }
  
    class LastPhoneNumberDelete implements ActionListener{
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 
    	 }
    }
    
    class LastSchduleDelete implements ActionListener{
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 
    	 }
    	 }
    
    class LastNoteDelete implements ActionListener{
    	 @Override
         public void actionPerformed(ActionEvent e) {
    		 
    	 }
    }
    

    class SavePhoneNumberEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() == btnAdd1){
            
              try {      
                 String txtPhoneName2 = txtPhoneName.getText();
                 String txtPhoneNumber2 = txtPhoneNumber.getText();
                 
                 if ( checkPhoneComent(txtPhoneName2) == true) 
                    checkPhone = true;
                 else
                   checkPhone = false;
                            
                 if (checkPhone) {
                 String text_id = tf.getText();
                 BufferedWriter writer = new BufferedWriter(new FileWriter(text_id+"_phone.txt",true));
                 
                 writer.write(txtPhoneName2+" ");
                 writer.write(txtPhoneNumber2);
                 writer.write("\r\n");
                 writer.close();
              } else {
                 String text_id = tf.getText();
                  BufferedWriter writer = new BufferedWriter(new FileWriter(text_id+"_phone.txt",true));

                  writer.write(txtPhoneName2+" ");                 
                  writer.write(txtPhoneNumber2);
                  writer.write("\r\n");
                  writer.close();
                 
              }
              }catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
              }
           }
        }
     }
    
    class SaveScheduleEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() == btnAdd2){
              try {
                 
                 String txtScheduleDate2 = txtScheduleDate.getText();
                 String txtScheduleExplain2 = txtScheduleExplain.getText();
              
                 if (CheckSchduleComent(txtScheduleDate2) == true)
                    CheckSchdule = true;
                 else
                    CheckSchdule = false;
                 
                 if (CheckSchdule) {
                    String text_id = tf.getText();
                     BufferedWriter writer = new BufferedWriter(new FileWriter(text_id+"_schedule.txt",true));
                     writer.write(txtScheduleDate2+" "); 
                     writer.write(txtScheduleExplain2);
                     writer.write("\r\n");
                     
                     writer.close();
                 } else {
                    String text_id = tf.getText();
                     BufferedWriter writer = new BufferedWriter(new FileWriter(text_id+"_schedule.txt",true));
                     writer.write(txtScheduleDate2+" "); 
                     writer.write(txtScheduleExplain2);
                     writer.write("\r\n");
                     
                     writer.close();
                 }
              }catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
              }
           }
        }
     }

    class SaveNoteEvent implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() == btnAdd3){
              try {
                 
                 String txtNoteTitle2 = txtNoteTitle.getText();
                 String txtNoteMemo2 = txtNoteMemo.getText();
                 
                 if ( checkNoteComent(txtNoteTitle2) == true) 
               	  checkNote = true;
                 else
               	 checkNote = false;
                            
                 
                 if (checkNote) {
               	  String text_id = tf.getText();
                     BufferedWriter writer = new BufferedWriter(new FileWriter(text_id+"_note.txt",true));

                     writer.write(txtNoteTitle2+" ");                 
                     writer.write(txtNoteMemo2);
                     writer.write("\r\n");
                     writer.close();
                    } else {
                   	 String text_id = tf.getText();
                        BufferedWriter writer = new BufferedWriter(new FileWriter(text_id+"_note.txt",true));

                        writer.write(txtNoteTitle2+" ");                 
                        writer.write(txtNoteMemo2);
                        writer.write("\r\n");
                        writer.close();
                      } 
                    }catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
              }
           }
        }

     }
    class LoginEvent implements ActionListener{

          @Override
          public void actionPerformed(ActionEvent e) {
             Object obj = e.getSource();
             if(obj == ChangeButton){
                  ChangePanel.setVisible(false);  
                  ChangeList = new JPanel();   
                  ChangeList.setBorder(BorderFactory.createTitledBorder("회원정보 변경"));
                  ChangeList.setPreferredSize(new Dimension(280, 150));
                  //ChangeList.setLayout(new BorderLayout());
                  
                  JLabel idLabel2 = new JLabel("ID : ");
                 // Student s2 =collection.get(stdList.getSelectedIndex());  //이부분 수정해줘야함 저장한 아이디 불러오는 곳 
                  
                 // tf.setText(s2.getName());
                 //tf.setEditable(false);  
                  
                  tf2 = new JTextField(16);
                  pf2 = new JPasswordField(15);
                  
                  JLabel passLabel2 = new JLabel("PASSWORD : ");
                  ChangeList.add(idLabel2);
                  ChangeList.add(tf2);
                  ChangeList.add(passLabel2);
                  ChangeList.add(pf2);
                  ChangeListButton = new JButton("변경하기");       
                  ChangeList.add(ChangeListButton);
                  loginPanel.add(ChangeList, BorderLayout.CENTER);
                  ChangeListButton.addActionListener(new LoginEvent());

             }else if(obj == loginButton){
                     try {    
                        String text_id = tf.getText();
                        String text_pw = pf.getText();
                        
                        
                        if ( checkPassword(text_id, text_pw) == true) 
                        	 isLogin = true;
                        else
                        	 isLogin = false;
                        
                         if (isLogin) {
                          loginText.setText("로그인되었습니다. "+text_id+"님 안녕하세요.");
                          isLogin = false;
                         } else {
                          loginText.setText("ID 또는 password가 잘못되었습니다.");
                        JOptionPane.showMessageDialog(null, "PassWord Error");
                           }
                         }
                         catch (Exception e1) {
                             JOptionPane.showMessageDialog(null, "Id Error");  

                        }   

             }else if(obj == ChangeListButton){
                 String text_id = tf2.getText();
                   String text_pw = pf2.getText();
                   

                   try {
                      BufferedReader reader = new BufferedReader(new FileReader(text_id+".txt"));
                      String file_id = reader.readLine(); 
                      String file_pw = reader.readLine();

                      reader.close();
                      if(text_pw.equals(file_pw)){
                         JOptionPane.showMessageDialog(null, "Same Password");            
                      }else{
                         JOptionPane.showMessageDialog(null, "PassWord Changed");         
                          BufferedWriter writer = new BufferedWriter(new FileWriter(text_id+".txt"));
                            writer.write(text_id);
                           writer.write("\r\n");
                            writer.write(text_pw);
                            writer.close();      
                      }
                    
                 } catch (IOException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                 }
                   }
             }
          }
    class ShowPhonebookList implements ActionListener{
        //연락처보기
        @Override
        public void actionPerformed(ActionEvent e){

     	   Object obj = e.getSource(); 
     	   if(obj == btnAdd4){//연락처보기
     		   scheduleDelete.setVisible(false);  
     		   checkPanel.setVisible(false);  
     		   phonebookDelete = new JPanel();
     		   BoxLayout layout = new BoxLayout(phonebookDelete.getRootPane(), BoxLayout.Y_AXIS);
     		   phonetxt = new JTextArea(20, 20);
     		   phonetxt.setBounds(20, 200, 270, 300);
     		   phonetxt.setLineWrap(true);
     		   int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
     		   int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
     		   JScrollPane jsp = new JScrollPane(phonetxt, v, h);
     		   phonebookDelete.add(jsp);
     		   buttonEditPanel = new JPanel();
     		   btnDel1 = new JButton("연락처삭제");
     		   btnDel1.addActionListener(new ShowPhonebookList());

     		   btnDel11 = new JButton("연락처를 삭제합니다.");
     		   btnDel11.addActionListener(new ShowPhonebookList());


     		   buttonEditPanel.add(btnDel1);
     		   buttonEditPanel.add(btnDel11);

     		   btnDel11.setVisible(false);

     		   centerPanel.add(phonebookDelete, BorderLayout.CENTER);
     		   centerPanel.add(buttonEditPanel, BorderLayout.SOUTH);

     		   ByteArrayOutputStream bo;
     		   FileInputStream fis;
     		   try{
     			   String text_id = tf.getText();
     			   BufferedReader reader = new BufferedReader(new FileReader(text_id+"_phone.txt"));
     			   bo = new ByteArrayOutputStream();
     			   String s="";
     			   String s1="";
     			   fis = new FileInputStream(text_id+"_phone.txt");
     			   int i=0;
     			   while((i = fis.read()) != -1){
     				   bo.write(i);
     			   }
     			   while ((s1 = reader.readLine()) != null){

     				phonecount =  phonecountplus(phonecount);
     			   }

     			   System.out.println("폰카"+phonecount);
     			   phonetxt.setText(bo.toString());
     			   fis.close();
     			   bo.close();
     		   }catch(IOException e2){
     			   System.err.println(e2);
     			   System.exit(1);
     		   }
     	   }else if (obj == btnDel1){

     		   checkPanel.setVisible(true); 
     		   btnDel11.setVisible(true);
     		

     	   }else if(obj == btnDel11){

    			FileInputStream fiss;
    			int j=0;
    			checkPanel.setVisible(true); 
    			String line="";
    			String dummy = "";
    			try {
    				String text_id = tf.getText();
    				//제목쓰기
    				BufferedReader reader = new BufferedReader(new FileReader(text_id+"_phone.txt"));
    				fiss = new FileInputStream(text_id+"_phone.txt");
    				//1. 삭제하고자 하는 position 이전까지는 이동하며 dummy에 저장
    				
    				int i;
 				for(i=1;i<phonecount+1;i++){
 					//우리가 실제적으로 저장할것
 					if(a[i] == 0 && flag[i] == 0){
 						System.out.println(line);
 						line = reader.readLine();
 						dummy = dummy+ (line + "\r\n" );
 						//System.out.println("이건 더미값"+dummy);
 					}//선택돼서 버릴것
 					else{
 						System.out.println(line);
 						line = reader.readLine();
 						}
 				}
    				FileWriter fw = new FileWriter(text_id+"_phone.txt");
    				fw.write(dummy);			

    				//bw.close();
    				fw.close();
    				reader.close();
    			} catch (IOException e4) {
    				// TODO Auto-generated catch block
    				System.err.println(e4);
    				System.exit(1);
    			}

    		}
    	}
    }
     class ShowScheduleList implements ActionListener{
     	@Override
     	public void actionPerformed(ActionEvent e){
     		//스케줄보기
     		int i;
     		String s1="";
     		Object obj = e.getSource(); 
     		if(obj == btnAdd5){//스케줄보기
     			ByteArrayOutputStream bo;
     			FileInputStream fis;
     			checkPanel.setVisible(false);  
     			try{
     				String text_id = tf.getText();
     				BufferedReader reader = new BufferedReader(new FileReader(text_id+"_schedule.txt"));
     				bo = new ByteArrayOutputStream();
     				String s;
     				fis = new FileInputStream(text_id+"_schedule.txt");

     				i=0;
     				while((i = fis.read()) != -1){
     					//System.out.println(s);
     					//booktxt.setText(s);
     					bo.write(i);
     				}
     				while ((s1 = reader.readLine()) != null){
     					//schedulecount++;
     					schedulecount =  schedulecountplus(schedulecount);
     					System.out.println(schedulecount);
     				}
     				System.out.println(schedulecount);
     				scheduletxt.setText(bo.toString());
     				fis.close();
     				bo.close();
     			}catch(IOException e2){
     				System.err.println(e2);
     				System.exit(1);
     			}
     		}else if(obj == btnDel){
     			System.out.println("schedeldez");
     			btnDel22.setVisible(true);
     			checkPanel.setVisible(true); 
     		}else if(obj == btnDel22){

     			FileInputStream fiss;
     			int j=0;
     			checkPanel.setVisible(true); 
     			String line="";
     			String dummy = "";
     			try {
     				String text_id = tf.getText();
     				//제목쓰기
     				BufferedReader reader = new BufferedReader(new FileReader(text_id+"_schedule.txt"));
     				fiss = new FileInputStream(text_id+"_schedule.txt");

     				
     				for(i=1;i<schedulecount+1;i++){
     					//우리가 실제적으로 저장할것
     					if(a[i] == 0 && flag[i] == 0){
     						System.out.println(line);
     						line = reader.readLine();
     						dummy = dummy+ (line + "\r\n" );
     						//System.out.println("이건 더미값"+dummy);
     					}//선택돼서 버릴것
     					else{
     						System.out.println(line);
     						line = reader.readLine();
     						}
     				}
     				

     				FileWriter fw = new FileWriter(text_id+"_schedule.txt");
     				fw.write(dummy);			

     				//bw.close();
     				fw.close();
     				reader.close();
     			} catch (IOException e3) {
     				// TODO Auto-generated catch block
     				System.err.println(e3);
     				System.exit(1);
     			}

     		}
     	}
     }
    public class ShowNoteList implements ActionListener{
     	@Override
     	//노트보기
        public void actionPerformed(ActionEvent e){
          
           
            Object obj = e.getSource(); 
            if(obj == btnAdd6){//노트보기
                String s1 = "";
                scheduleDelete.setVisible(false);  
                checkPanel.setVisible(false);  
                noteDelete = new JPanel();
                BoxLayout layout = new BoxLayout(noteDelete.getRootPane(), BoxLayout.Y_AXIS);
                notetxt = new JTextArea(20, 20);
                notetxt.setBounds(20, 200, 270, 300);
                notetxt.setLineWrap(true);
                int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
                int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
                JScrollPane jsp = new JScrollPane(notetxt, v, h);
                noteDelete.add(jsp);
                buttonEditPanel = new JPanel();
                btnDel3 = new JButton("노트삭제");
                btnDel3.addActionListener(new ShowNoteList());
                
                btnDel33 = new JButton("노트를 삭제합니다.");
                btnDel33.addActionListener(new ShowNoteList());
                
                btnDel33.setVisible(false);
                
                buttonEditPanel.add(btnDel3);
                buttonEditPanel.add(btnDel33);
                centerPanel.add(noteDelete, BorderLayout.CENTER);
                centerPanel.add(buttonEditPanel, BorderLayout.SOUTH);
                
                 ByteArrayOutputStream bo;
                 FileInputStream fis;
                 try{
                    String text_id = tf.getText();
                    BufferedReader reader = new BufferedReader(new FileReader(text_id+"_note.txt"));
                    String s;
                
                 bo = new ByteArrayOutputStream(); 
                 fis = new FileInputStream(text_id+"_note.txt");
                 int i=0;
                  while((i = fis.read()) != -1){
                   //System.out.println(s);
                   //booktxt.setText(s);
                     bo.write(i);
                   }
                  while ((s1 = reader.readLine()) != null){
                	  notecount =  notecountplus(notecount);
                   }
                  System.out.println(notecount);
                  notetxt.setText(bo.toString());
                  fis.close();
                  bo.close();
                  }catch(IOException e2){
                   System.err.println(e2);
                   System.exit(1);
                   }
                 }else if(obj == btnDel3){
                 	
                 	checkPanel.setVisible(true); 
                 	btnDel33.setVisible(true);
                      System.out.println("notez");
                      
                 }else if(obj == btnDel33){

            			FileInputStream fiss;
            			int j=0;
            			checkPanel.setVisible(true); 
            			String line="";
            			String dummy = "";
            			try {
            				String text_id = tf.getText();
            				//제목쓰기
            				BufferedReader reader = new BufferedReader(new FileReader(text_id+"_note.txt"));
            				fiss = new FileInputStream(text_id+"_note.txt");

            				int i;
         				for(i=1;i<notecount+1;i++){
         					//우리가 실제적으로 저장할것
         					if(a[i] == 0 && flag[i] == 0){
         						System.out.println(line);
         						line = reader.readLine();
         						dummy = dummy+ (line + "\r\n" );
         						//System.out.println("이건 더미값"+dummy);
         					}//선택돼서 버릴것
         					else{
         						System.out.println(line);
         						line = reader.readLine();
         						}
         				}
            				FileWriter fw = new FileWriter(text_id+"_note.txt");
            				fw.write(dummy);			

            				//bw.close();
            				fw.close();
            				reader.close();
            			} catch (IOException e3) {
            				// TODO Auto-generated catch block
            				System.err.println(e3);
            				System.exit(1);
            			}
            			}
            }
     	}
     class ShowPhonebookDelete implements ActionListener{
        
        @Override
       
        public void actionPerformed(ActionEvent e) {
     	   checkPanel.setVisible(true);  
           
       //    Object obj = e.getSource(); 
        //    if(obj == btnDel1){//폰북삭제
            
         	   System.out.println("zzzzzz");
            
        //    }
            }
            
         }
     class ShowScheduleDelete implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
           Object obj = e.getSource(); 
            if(obj == btnDel){//스케줄삭제
         	   checkPanel = new JPanel();
                deleteCheck = new JCheckBox("");
                checkPanel.add(deleteCheck);
                centerPanel.add(checkPanel,BorderLayout.WEST);
                
            
            }
            }
            
         }
     class ShowNoteDelete implements ActionListener{

         @Override
         public void actionPerformed(ActionEvent e) {
           Object obj = e.getSource(); 
            if(obj == btnDel3){//노트삭제
            }
           // checkPanel = new JPanel();
            //checkPanel.add(deleteCheck);
            //centerPanel.add(checkPanel,BorderLayout.WEST);
            //System.out.println("zzzzzz");
            }
            
         }
         class ChangeEvent implements ActionListener{
            public void actionPerformed(ActionEvent e){
                ChangePanel.setVisible(false);  
                ChangeList = new JPanel();   
                ChangeList.setBorder(BorderFactory.createTitledBorder("회원정보 변경"));
                ChangeList.setPreferredSize(new Dimension(280, 150));
                //ChangeList.setLayout(new BorderLayout());
                
                JLabel idLabel2 = new JLabel("ID : ");
               // Student s2 =collection.get(stdList.getSelectedIndex());  //이부분 수정해줘야함 저장한 아이디 불러오는 곳 
                
               // tf.setText(s2.getName());
               //tf.setEditable(false);  
                
                tf2 = new JTextField(16);
                pf2 = new JPasswordField(15);
                
                JLabel passLabel2 = new JLabel("PASSWORD : ");
                ChangeList.add(idLabel2);
                ChangeList.add(tf2);
                ChangeList.add(passLabel2);
                ChangeList.add(pf2);
                ChangeListButton = new JButton("변경하기");       
                ChangeList.add(ChangeListButton);
                loginPanel.add(ChangeList, BorderLayout.CENTER);
                ChangeListButton.addActionListener(new LoginEvent());

                }
         }
     
     //------------------------------------------------------------------------------
     // 리스너 인터페이스를 위한 각 메소드 구현
     // 어떤 이벤트가 발생했는지에 따라 각각의 기능을 수행한다.
     //------------------------------------------------------------------------------
     
     public void actionPerformed(ActionEvent e){
      Object source = e.getSource();
      int count = User.getUserCount();

      //불러오기 메뉴 이벤트 처리
       if(e.getSource() == jmi1){//파일 열기 창 보여주기
          int rv =fc.showOpenDialog(this);
          if(rv == JFileChooser.APPROVE_OPTION){
             try {
                 File file = fc.getSelectedFile();
                 FileInputStream fis = new FileInputStream(fc.getSelectedFile());
                 ObjectInputStream ois = new ObjectInputStream(fis);
                try {
                   collection = (Vector<User>) ois.readObject();
                } catch (ClassNotFoundException e1) {
                   // TODO Auto-generated catch block
                   e1.printStackTrace();
                }
                //저장 전 list clear
                 listModel.removeAllElements();
                 //불러온 파일 내 이름들 list에 추가
                 for(int i =0; i<count; i++){
                       User s = collection.get(i);
                       listModel.addElement(s.getPhoneName());
                 }
             }
             
                 catch (FileNotFoundException e2) {
                  // TODO Auto-generated catch block
                  e2.printStackTrace();
                 } catch (IOException e3) {
                  // TODO Auto-generated catch block
                  e3.printStackTrace();
                }    
             
          }
      }
      
      //저장하기 메뉴 이벤트 처리
      else if(e.getSource() == jmi2){//파일 열기 창 보여주기
          int rv =fc.showSaveDialog(this);
          if(rv == JFileChooser.APPROVE_OPTION){
             try {
                  File file = fc.getSelectedFile();
                  FileOutputStream fos = new FileOutputStream(fc.getSelectedFile());
                  ObjectOutputStream oos = new ObjectOutputStream(fos);
                  oos.writeObject(collection);
                  oos.close();
                 } catch (FileNotFoundException e1) {
                  // TODO Auto-generated catch block
                  e1.printStackTrace();
                 } catch (IOException e2) {
                  // TODO Auto-generated catch block
                  e2.printStackTrace();
                 }    
           }
      }
     }
     

     
     //내용  clear 함수
     void blank(){
        txtPhoneName.setText("");
        txtPhoneNumber.setText("");
        txtScheduleDate.setText("");
        txtScheduleExplain.setText("");
        txtNoteTitle.setText("");
        txtNoteMemo.setText("");
        txtinfo1.setText("");
      
     }
     
     
     //------------------------------------------------------------------------------
     //선택된 인덱스에 해당되는 학생 정보를 textArea 에서 출력한다.
     //------------------------------------------------------------------------------
     @Override
     public void valueChanged(ListSelectionEvent arg0) {
      // TODO Auto-generated method stub
        index = stdList.getSelectedIndex();
        if( index != -1){
           User x =collection.get(index);
           txtinfo2.setText(x.toString());
           //ImageIcon imageIcon = new ImageIcon(collection.elementAt(index).getPhoto());
           //image.setIcon(imageIcon);
      }
     }
     

     public static void main(String[] args) {
      // TODO Auto-generated method stub
        new UserInfoSystem();
     }



     public boolean checkNoteComent(String totalNote) throws IOException{
    		String text_id = tf.getText();
			BufferedReader reader = new BufferedReader(new FileReader("aa_note.txt"));	 
    	 String totalNoteComent = reader.readLine();
    	 reader.close();
    	 	 
    	 if (totalNote.equals(totalNoteComent))
    		 checkNote = true;
         else
        	 checkNote = false;
    	 
    	 return checkNote;	

     }

	public boolean checkPassword(String id, String pw) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("aa.txt"));
        String file_id = reader.readLine(); 
        String file_pw = reader.readLine();
        reader.close();
        
         if (id.equals(file_id)&&pw.equals(file_pw))
        	 isLogin = true;
         else
        	 isLogin = false;
		return isLogin;
	}
	
	 public boolean CheckSchduleComent(String ScheduleDate) throws IOException{
         String text_id = tf.getText();
       BufferedReader reader = new BufferedReader(new FileReader("aa_schedule.txt"));
       String totalSchduleComent = reader.readLine();
       reader.close();
       
       if (ScheduleDate.equals(totalSchduleComent))
          CheckSchdule = true;
          else
             CheckSchdule = false;
         
         return CheckSchdule;   
       
   }
	    public boolean checkPhoneComent(String totalPhone) throws IOException{
	        String text_id = tf.getText();
	          BufferedReader reader = new BufferedReader(new FileReader("aa_Phone.txt"));  
	      String totalPhoneComent = reader.readLine();
	      reader.close();
	          
	      if (totalPhone.equals(totalPhoneComent))
	    	  checkPhone = true;
	       else
	    	   checkPhone = false;
	      
	      return checkPhone;   
	          
	   }

	public int flagcheck(boolean s, int a2){
		  int k=0;
		  boolean b1;
			b1 =  false;
			int fflag = 0;
		  if(bookCheck1.isSelected() && flag[1] == 0){
			   a[1] = 1;
			   System.out.println("a1");
			   flag[1]= 1;
			   k= flag[2];
		  }
		   else if(bookCheck2.isSelected()&& flag[2] == 0){
			   a[2] = 1;
			   System.out.println("a2");
			   flag[2]= 1;
			   k= flag[2];
		   }
		   else if(bookCheck3.isSelected()&& flag[3] == 0){
			   a[3] = 1;
			   System.out.println("a3");
			   flag[3]= 1;
			   k= flag[3];
		   }
		   else if(bookCheck4.isSelected()&& flag[4] == 0){
			   a[4] = 1;
			   flag[4]= 1;
			   System.out.println("a4");
			   k= flag[4];
			   
		   }else if(bookCheck5.isSelected()&& flag[5] == 0){
			   a[5] = 1;
			   flag[5]= 1;
			   System.out.println("a5");
			   k= flag[5];
			   }
		return k;
		}
	
	public int notecountplus(int notecount){	
		 return notecount+=1;
	}
	public int phonecountplus(int phonecount){		
		return phonecount+=1;
	}
	public int schedulecountplus(int schedulecount){
		return schedulecount+=1;
	}


}
