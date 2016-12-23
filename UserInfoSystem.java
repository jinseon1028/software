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

// import ����
public class UserInfoSystem extends JFrame implements ActionListener, ListSelectionListener
{

   //------------------------------------------------------------------------------
    // ����� UI�� ���� �ʿ��� ������ ���� 
    //------------------------------------------------------------------------------
    private Vector<User> collection; // a collection of Student objects 
    
    //  GUI ������Ʈ�� ���� ��� ������ ����
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
    //������ - GUI�� �����Ѵ�.
    //------------------------------------------------------------------------------
    public UserInfoSystem(){
     
     // collection �� �����ϴ�.   
     collection = new Vector<User>();

     fc = new JFileChooser();
     //�ݷ��ǿ��߰��ϴ¹��
     
     //------------------------------------------------------------------------------
     // ����� ȭ�鿡 ������Ʈ�� �����Ͽ� ��ġ
     // �� ������Ʈ ������ �ʿ��� ������ ���
     //------------------------------------------------------------------------------  
  
       


      JMenuBar jmb=new JMenuBar();
      setJMenuBar(jmb);
      jtf1=new JTextField();
      
     // ��� Ÿ��Ʋ
     topPanel = new JPanel();
     lblTitle =new JLabel("���� ���� �ý���");
     lblTitle.setFont(new Font("����", Font.BOLD, 20));//�۾�ũ�� ����
     topPanel.add(lblTitle);

     
     
     
     
     /////////////////////////////////////////////////////////////////////////////////
     // �л����� ��� panel  �ۼ�
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

   
     
     //�� ����   
     lblPhoneName = new JLabel("�̸�");
     lblPhoneNumber = new JLabel("��ȭ��ȣ");
     lblScheduleDate = new JLabel("��¥");
     lblScheduleExplain = new JLabel("����");
     lblNoteTitle = new JLabel("����");
     lblNoteMemo = new JLabel("����");
   
    
     // �ؽ�Ʈ ����
     txtPhoneName = new JTextField(20);
     txtPhoneNumber = new JTextField(18);
     txtScheduleDate= new JTextField(20);
     txtScheduleExplain = new JTextField(20);
     txtNoteTitle= new JTextField(20);
     txtNoteMemo = new JTextField(20);
  
     
     //������Ʈ �߰�
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
     
     //��ư�� 
     buttonAddPanel = new JPanel();
     btnAdd1 = new JButton("�߰�");
     buttonAddPanel.add(btnAdd1);
     addPanel1.add(btnAdd1);
     btnAdd1.addActionListener(new SavePhoneNumberEvent());
     
     
     buttonAddPanel = new JPanel();
     btnAdd4 = new JButton("����Ʈ����");
     btnAdd4.addActionListener(new ShowPhonebookList());
     buttonAddPanel.add(btnAdd4);
     addPanel1.add(btnAdd4);
     
     
     
     buttonAddPane2 = new JPanel();
     btnAdd2 = new JButton("�߰�");
     buttonAddPane2.add(btnAdd2);
     addPanel2.add(btnAdd2);
     btnAdd2.addActionListener(new SaveScheduleEvent());
   
     

     
     //buttonAddPanel = new JPanel();
     btnAdd5 = new JButton("����Ʈ����");
     btnAdd5.addActionListener(new ShowScheduleList());
     buttonAddPanel.add(btnAdd5);
     addPanel2.add(btnAdd5);
     
     buttonAddPane3 = new JPanel();
     btnAdd3 = new JButton("�߰�");
     buttonAddPane3.add(btnAdd3);
     addPanel3.add(btnAdd3);
     btnAdd3.addActionListener(new SaveNoteEvent());
     
     
    // buttonAddPanel = new JPanel();
     btnAdd6 = new JButton("����Ʈ����");
     btnAdd6.addActionListener(new ShowNoteList());
     buttonAddPanel.add(btnAdd6);
     addPanel3.add(btnAdd6);
   
   
     
     
/////////////////////////////////////////////////////////////////////////////////
// ��� center panel
/////////////////////////////////////////////////////////////////////////////////

centerPanel = new JPanel();
centerPanel.setBorder(BorderFactory.createTitledBorder("  "));
centerPanel.setPreferredSize(new Dimension(300, 550));
centerPanel.setLayout(new BorderLayout());

//����ó����
phonebookList = new JPanel();
phonetxt = new JTextArea(20, 20);
phonetxt.setBounds(20, 200, 270, 300);
phonetxt.setLineWrap(true);
int bv = ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
int bh = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
JScrollPane bbjsp = new JScrollPane(phonetxt, bv, bh);
phonebookList.add(bbjsp);


//����ó ���� ��ư �������� ��
checkPanel = new JPanel();
deleteCheck = new JCheckBox("");
checkPanel.add(deleteCheck);
phonebookDelete = new JPanel();
phonebookDelete.add(bbjsp);





// ��Ʈ���� ��ư �������� ��
noteList = new JPanel();
notetxt = new JTextArea(20, 20);
notetxt.setBounds(20, 200, 270, 300);
notetxt.setLineWrap(true);


//��Ʈ������ư �������� ��
noteDelete = new JPanel();
noteDelete.add(bbjsp);



// ���� ���� ��ư �������� ��
scheduleList = new JPanel();
scheduletxt = new JTextArea(20, 20);
scheduletxt.setBounds(20, 200, 270, 300);
scheduletxt.setLineWrap(true);
JScrollPane bbbjsp = new JScrollPane(scheduletxt, bv, bh);
phonebookList.add(bbbjsp);



//���� ���� ��ư �������� ��
scheduleDelete = new JPanel();
scheduleDelete.add(bbbjsp);
buttonEditPanel = new JPanel();
btnDel = new JButton("����");
btnDel.addActionListener(new ShowScheduleList());
btnDel22 = new JButton("�������� �����մϴ�.");
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
     // �� ���� panel
     /////////////////////////////////////////////////////////////////////////////////
     
     loginPanel = new JPanel();
     loginPanel.setPreferredSize(new Dimension(300, 80));
     loginPanel.setLayout(new BorderLayout());
     loginPanel2 = new JPanel();
     loginPanel2.setBorder(BorderFactory.createTitledBorder("�α���"));
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
     ChangePanel.setBorder(BorderFactory.createTitledBorder("ȸ������ ����"));
     ChangePanel.setPreferredSize(new Dimension(280, 150));
     ChangeButton = new JButton("�� ���� �����ϱ�");
     ChangePanel.add(ChangeButton,BorderLayout.CENTER);
     ChangePanel.add(ChangeText,BorderLayout.PAGE_START);
     
     loginPanel.add(ChangePanel, BorderLayout.CENTER);
     
     ChangeButton.addActionListener(new ChangeEvent());
    
     
     
     
     
     // �����ӿ�  panel �߰�
     add(topPanel, BorderLayout.PAGE_START);
     add(addPanel, BorderLayout.LINE_START);
     add(centerPanel, BorderLayout.CENTER);
     add(loginPanel, BorderLayout.LINE_END);
     
     setTitle("����Ʈ���� ���� ����");
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
                  ChangeList.setBorder(BorderFactory.createTitledBorder("ȸ������ ����"));
                  ChangeList.setPreferredSize(new Dimension(280, 150));
                  //ChangeList.setLayout(new BorderLayout());
                  
                  JLabel idLabel2 = new JLabel("ID : ");
                 // Student s2 =collection.get(stdList.getSelectedIndex());  //�̺κ� ����������� ������ ���̵� �ҷ����� �� 
                  
                 // tf.setText(s2.getName());
                 //tf.setEditable(false);  
                  
                  tf2 = new JTextField(16);
                  pf2 = new JPasswordField(15);
                  
                  JLabel passLabel2 = new JLabel("PASSWORD : ");
                  ChangeList.add(idLabel2);
                  ChangeList.add(tf2);
                  ChangeList.add(passLabel2);
                  ChangeList.add(pf2);
                  ChangeListButton = new JButton("�����ϱ�");       
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
                          loginText.setText("�α��εǾ����ϴ�. "+text_id+"�� �ȳ��ϼ���.");
                          isLogin = false;
                         } else {
                          loginText.setText("ID �Ǵ� password�� �߸��Ǿ����ϴ�.");
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
        //����ó����
        @Override
        public void actionPerformed(ActionEvent e){

     	   Object obj = e.getSource(); 
     	   if(obj == btnAdd4){//����ó����
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
     		   btnDel1 = new JButton("����ó����");
     		   btnDel1.addActionListener(new ShowPhonebookList());

     		   btnDel11 = new JButton("����ó�� �����մϴ�.");
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

     			   System.out.println("��ī"+phonecount);
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
    				//���񾲱�
    				BufferedReader reader = new BufferedReader(new FileReader(text_id+"_phone.txt"));
    				fiss = new FileInputStream(text_id+"_phone.txt");
    				//1. �����ϰ��� �ϴ� position ���������� �̵��ϸ� dummy�� ����
    				
    				int i;
 				for(i=1;i<phonecount+1;i++){
 					//�츮�� ���������� �����Ұ�
 					if(a[i] == 0 && flag[i] == 0){
 						System.out.println(line);
 						line = reader.readLine();
 						dummy = dummy+ (line + "\r\n" );
 						//System.out.println("�̰� ���̰�"+dummy);
 					}//���õż� ������
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
     		//�����ٺ���
     		int i;
     		String s1="";
     		Object obj = e.getSource(); 
     		if(obj == btnAdd5){//�����ٺ���
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
     				//���񾲱�
     				BufferedReader reader = new BufferedReader(new FileReader(text_id+"_schedule.txt"));
     				fiss = new FileInputStream(text_id+"_schedule.txt");

     				
     				for(i=1;i<schedulecount+1;i++){
     					//�츮�� ���������� �����Ұ�
     					if(a[i] == 0 && flag[i] == 0){
     						System.out.println(line);
     						line = reader.readLine();
     						dummy = dummy+ (line + "\r\n" );
     						//System.out.println("�̰� ���̰�"+dummy);
     					}//���õż� ������
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
     	//��Ʈ����
        public void actionPerformed(ActionEvent e){
          
           
            Object obj = e.getSource(); 
            if(obj == btnAdd6){//��Ʈ����
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
                btnDel3 = new JButton("��Ʈ����");
                btnDel3.addActionListener(new ShowNoteList());
                
                btnDel33 = new JButton("��Ʈ�� �����մϴ�.");
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
            				//���񾲱�
            				BufferedReader reader = new BufferedReader(new FileReader(text_id+"_note.txt"));
            				fiss = new FileInputStream(text_id+"_note.txt");

            				int i;
         				for(i=1;i<notecount+1;i++){
         					//�츮�� ���������� �����Ұ�
         					if(a[i] == 0 && flag[i] == 0){
         						System.out.println(line);
         						line = reader.readLine();
         						dummy = dummy+ (line + "\r\n" );
         						//System.out.println("�̰� ���̰�"+dummy);
         					}//���õż� ������
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
        //    if(obj == btnDel1){//���ϻ���
            
         	   System.out.println("zzzzzz");
            
        //    }
            }
            
         }
     class ShowScheduleDelete implements ActionListener{
        
        @Override
        public void actionPerformed(ActionEvent e) {
           Object obj = e.getSource(); 
            if(obj == btnDel){//�����ٻ���
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
            if(obj == btnDel3){//��Ʈ����
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
                ChangeList.setBorder(BorderFactory.createTitledBorder("ȸ������ ����"));
                ChangeList.setPreferredSize(new Dimension(280, 150));
                //ChangeList.setLayout(new BorderLayout());
                
                JLabel idLabel2 = new JLabel("ID : ");
               // Student s2 =collection.get(stdList.getSelectedIndex());  //�̺κ� ����������� ������ ���̵� �ҷ����� �� 
                
               // tf.setText(s2.getName());
               //tf.setEditable(false);  
                
                tf2 = new JTextField(16);
                pf2 = new JPasswordField(15);
                
                JLabel passLabel2 = new JLabel("PASSWORD : ");
                ChangeList.add(idLabel2);
                ChangeList.add(tf2);
                ChangeList.add(passLabel2);
                ChangeList.add(pf2);
                ChangeListButton = new JButton("�����ϱ�");       
                ChangeList.add(ChangeListButton);
                loginPanel.add(ChangeList, BorderLayout.CENTER);
                ChangeListButton.addActionListener(new LoginEvent());

                }
         }
     
     //------------------------------------------------------------------------------
     // ������ �������̽��� ���� �� �޼ҵ� ����
     // � �̺�Ʈ�� �߻��ߴ����� ���� ������ ����� �����Ѵ�.
     //------------------------------------------------------------------------------
     
     public void actionPerformed(ActionEvent e){
      Object source = e.getSource();
      int count = User.getUserCount();

      //�ҷ����� �޴� �̺�Ʈ ó��
       if(e.getSource() == jmi1){//���� ���� â �����ֱ�
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
                //���� �� list clear
                 listModel.removeAllElements();
                 //�ҷ��� ���� �� �̸��� list�� �߰�
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
      
      //�����ϱ� �޴� �̺�Ʈ ó��
      else if(e.getSource() == jmi2){//���� ���� â �����ֱ�
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
     

     
     //����  clear �Լ�
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
     //���õ� �ε����� �ش�Ǵ� �л� ������ textArea ���� ����Ѵ�.
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
