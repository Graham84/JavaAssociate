
public class Array {
	
	char [] status;
	int [] ages;
	
	Shirt [] shirts;
	String [] names;
	
	status = new char [20];
	ages = new int [5];
	names = new String [7];
	shirts = new Shirt [3];

	ages[0] = 19;
	ages[1] = 42;
	ages[2] = 92;
	ages[3] = 33;
	
	shirts[0] = new Shirt();
	shirts[1] = new Shirt();
	shirts[2] = new Shirt();
	
	int [] ages1 = {19,42,92,33,46};
	Shirt [] shirts1 = {new Shirt(), new Shirt(), new Shirt()};

	int [] ages;				//results in error
	ages = {19,42,92,33,46};	//cannot declare and initialize an array in seperate lines
	
	
}
}
