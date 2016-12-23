import java.io.Serializable;

public class User implements Serializable{
	private String phoneName;   
	private String phoneNumber;   
	private String scheduleDate; 
	private String scheduleExplain;
	private String noteTitle;
	private String noteMemo;
	private static int userCount=0;          // number of Students
	
	 public User(String phoneName, String phoneNumber){
		 this.phoneName = phoneName;
		 this.phoneNumber = phoneNumber;
		 
		 this.scheduleDate = scheduleDate;
		 this.scheduleExplain = scheduleExplain;
		 
		 this.noteTitle = noteTitle;
		 this.noteMemo = noteMemo;
		 userCount++;
	 }
	 public void edit() {
		 setPhoneName(phoneName);
		 setPhoneNumber(phoneNumber);
		 
		 setScheduleDate(scheduleDate);
		 setScheduleExplain(scheduleExplain);
		 
		 setNoteTitle(noteTitle);
		 setNoteMemo(noteMemo);
		 
	 }
	
	public String getPhoneName() {
	      return phoneName;
	   }
	public void setPhoneName(String phoneName) {
	      this.phoneName = phoneName;
	   }
	public String getPhoneNumber() {
	      return phoneNumber;
	   }
	public void setPhoneNumber(String phoneNumber) {
	      this.phoneNumber = phoneNumber;
	   }
	
	public String getScheduleDate() {
		      return scheduleDate;
		   }
	public void setScheduleDate(String ScheduleDate) {
		      this.scheduleDate = ScheduleDate;
		   }
	
	public String getScheduleExplain() {
	      return scheduleExplain;
	   }
	public void setScheduleExplain(String ScheduleExplain) {
	      this.scheduleExplain = scheduleExplain;
	   }
	
	public String getNoteTitle() {
			return noteTitle;
		}
	public void setNoteTitle(String NoteTitle) {
			this.noteTitle = noteTitle;
		}
	
	public String getNoteMemo() {
		return noteMemo;
	}
	public void setNoteMemo(String NoteMemo) {
		this.noteMemo = noteMemo;
	}


	 public static int getUserCount() {
	      return userCount;
	      
	      
	   }   
	//------------------------------------------------------------------------------
	//Student ������ ��ȯ�Ѵ�.
	//------------------------------------------------------------------------------
	 public String toString()
	   {
	      String description;      
	      description="-�̸�: "+phoneName+"\n";
	      description+="-��ȭ��ȣ: "+phoneNumber+"\n";
	      description+="-������¥: "+scheduleDate+"\n";
	      description+="-�����޸�: "+scheduleExplain+"\n";
	      
	     description+="-��ƮŸ��Ʋ: "+noteTitle+"\n";
	     description+="-��Ʈ�޸�: "+noteMemo+"\n";
	        
	      return description;
	   }
	
}

