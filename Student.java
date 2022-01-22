package JavaClass;

public class Student {
	int rollNo = 800;
	public void College()
	{
	
		String collegeName ="Jain";
		int branches = 5;
		System.out.println(collegeName);
		System.out.println(branches);
		
	}
	
	public static void main(String[] args)
	{
		Student coursesDetails = new Student();
		coursesDetails.College();
		System.out.println(coursesDetails.rollNo);	
		
	}
	
}