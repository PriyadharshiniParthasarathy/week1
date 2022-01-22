package JavaClass;

public class Mobile {
	int number = 789456120;
	
	public void sendMsg()
	{
		System.out.println("Sending message");
	}
	void makeCall()
	{
		System.out.println("makeCall: - "+number);
	}
	private void saveContact() 
		{
			System.out.println("saveContact: - "+number);
		}
	
	public static void main(String[] args) {
		Mobile nokia = new Mobile();
		nokia.sendMsg();
		nokia.makeCall();
		nokia.saveContact();	
	}
}
