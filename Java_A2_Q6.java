abstract class Persistence{
	abstract void persist();
}

class FilePersistence extends Persistence
{
	void persist()
	{
		System.out.println("Data is saved on file");
	}
}

class DatabasePersistence extends Persistence
{
	void persist()
	{
		System.out.println("Data is saved on database");
	}
}

class Client
{
	void invoke(Persistence per)
	{
		per.persist();
	}
}

public class Java_A2_Q6 {
	public static void main(String[] args) {
		Persistence file= new FilePersistence();
		Persistence database= new DatabasePersistence();
		Client c= new Client();
		c.invoke(file);
		c.invoke(database);
	}
}
