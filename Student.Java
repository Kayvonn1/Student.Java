public class StudentList {
	private static final boolean StudentInfo = false;
	private Student[] studentArray;
	public String email;

	public StudentList(Student[] studentArray){
		getStudentArray(studentArray);
	}

	public Student[] getStudentArray() {
		return studentArray;
	}

	public void getStudentArray(Student[] studentArray) {
		this.studentArray = studentArray;

	}

	public int studentCount(String major) {
		int count = 0;
		for(int i=0; i<studentArray.length; i++)
		{
			if(major.equals ( studentArray[i].getMajor()))
			{
				count++;
			
				{
				
				}
			}
		}
		return count;
	
	}			
	  public Student getStudentInfo(String email){
		  for(int x=0;x<studentArray.length;x++) {
	        if (studentArray[x].getEmail()==email) {
	            return studentArray[x];
	        }// end of if 
		  }//End of for loop
	        return null;
		
} // method getStudentInfo
	public String getAllstudentInfo() {
		String returnString = "";
		for (int x=0;x<studentArray.length;x++) {
			returnString=returnString+studentArray[x].toString()+System.lineSeparator();
		}
		return returnString;
	}//method getAllstudentInfo

		
	}//end of class
