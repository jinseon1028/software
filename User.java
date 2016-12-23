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
	//Student 정보를 반환한다.
	//------------------------------------------------------------------------------
	 public String toString()
	   {
	      String description;      
	      description="-이름: "+phoneName+"\n";
	      description+="-전화번호: "+phoneNumber+"\n";
	      description+="-일정날짜: "+scheduleDate+"\n";
	      description+="-일정메모: "+scheduleExplain+"\n";
	      
	     description+="-노트타이틀: "+noteTitle+"\n";
	     description+="-노트메모: "+noteMemo+"\n";
	        
	      return description;
	   }
	
}

