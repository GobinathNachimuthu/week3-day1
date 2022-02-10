package week3.day1;

public class Students {
	
		public void getStudentInfo(int ID)
		{
			System.out.println("ID - "+ID);
		}
		
		public void getStudentInfo(int ID,String Name)
		{
			System.out.println("ID-"+ID);
			System.out.println("Name  :"+ Name );
		}
		public void getStudentInfo(String Email,String PhoneNumber)
		{
			System.out.println("Email:"+Email);
			System.out.println("PhoneNumber:PhoneNumber");
		}

		public static void main(String[] args) {
			Students stud = new Students();
			stud.getStudentInfo(199439);
			stud.getStudentInfo(199439, "Gobi");
			stud.getStudentInfo("gobi123@gmail.com", "9080144643");
			

		}

	}