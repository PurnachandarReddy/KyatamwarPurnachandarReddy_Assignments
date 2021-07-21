package Assignment02;

public class ClientPersistence {
	public static void main(String args[])
	{
		FilePersistence fp=new FilePersistence();
		DatabasePersistence dp=new DatabasePersistence();
		fp.persist();
		dp.persist();
	}

}
