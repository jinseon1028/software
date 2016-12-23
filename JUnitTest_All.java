import static org.junit.Assert.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import org.junit.BeforeClass;

import org.junit.Test;

public class JUnitTest_All {
	
	public static UserInfoSystem userInfoSystem;
	
	 @BeforeClass
	 public static void beforeSetup() {
		 userInfoSystem = new UserInfoSystem();
	 }

	 @Test
	 public void IdChecktest() throws IOException {
		UserInfoSystem IdCheck = new UserInfoSystem();
			
		String id = "aa";
		String fw = "bb";
		
		assertTrue(IdCheck.checkPassword(id, fw));		
	 }

		@Test
		public void NoteComentChecktest() throws IOException {
			UserInfoSystem NoteCheck = new UserInfoSystem();
			
			String totalNoteComent = "12월23일 종강 ";
			
			assertFalse(NoteCheck.checkNoteComent(totalNoteComent));	
		}
		
		   @Test
		   public void SchduleChecktest() throws IOException {
		      UserInfoSystem SchduleCheck = new UserInfoSystem();
		         
		      String Schdule = "yy";
		      
		      
		      assertFalse(SchduleCheck.CheckSchduleComent(Schdule));      
		   }
		   
		   @Test
		   public void JChecktest() {
		      UserInfoSystem combocheck = new UserInfoSystem();
		         
		      boolean b1;
		      b1 =  false;
		      int fflag = 0;
		      
		      assertTrue((combocheck.flagcheck(b1,fflag)==0));   
		   }
		   
		   @Test
		      public void PhoneChecktest() throws IOException {
		         UserInfoSystem PhoneCheck = new UserInfoSystem();
		            
		         String Phone = "오진선 0108033393";
		         
		         
		         assertFalse(PhoneCheck.checkPhoneComent(Phone));      
		      }
		   
	   @Test
	    public void noteChecktest() {
	       UserInfoSystem notecountcheck = new UserInfoSystem();
	          
	       int notecount = 0;
	       
	       assertFalse(notecountcheck.phonecountplus(1)==0);
	       
	    }
	   
	   @Test
	   public void scheduleChecktest() {
	      UserInfoSystem schedulecountcheck = new UserInfoSystem();
	         
	      int schedulecount = 0;
	      
	      assertFalse(schedulecountcheck.phonecountplus(1)==0);
	      
	   }
	   
	   @Test
	   public void phonecountChecktest() {
	      UserInfoSystem phonecountcheck = new UserInfoSystem();
	         
	      int phonecount = 0;
	      
	      assertFalse(phonecountcheck.phonecountplus(1)==0);
	      
	   }
	   
	   

 }


