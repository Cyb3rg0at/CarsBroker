import java.util.Scanner;

class Cars {
	
	String Name;
	int Year;
	String Colour;
	int Tank;
	int Price;


	void display() {
		System.out.println("[*] Name: " + Name);
		System.out.println("\t[+] Year: " + Year + "\n\t[+] Colour: " + Colour + "\n\t[+] Tank: " + Tank + "\n\t[+] Price: " + Price + "\n\n");
}


	String display_select(String Select) {
		switch (Select) {
			case "Name":
				return Name;
			case "Year":
				System.out.println(Year);
			case "Colour":
				return Colour;
			case "Tank":
				System.out.println(Tank);
			case "Price":
				System.out.println(Price);
			default:
				System.out.println("You Have Entered An Invalid Trait!");
				return "Invalid";
		}
	}
	
	
	void dispSelect() {
		if (Name == null) 
			System.out.println("Slot Is Empty!!!");
		else {
			Scanner In1 = new Scanner(System.in);
			System.out.println("[*] Available Attributes: ");
			System.out.println("\t[+] Name\n\t[+] Year\n\t[+] Colour\n\t[+] Tank\n\t[+] Price\nPlease Enter One Of The Above Options: ");
			String Resp1 = In1.nextLine();
			
			switch (Resp1) {
				case "Name":
					System.out.println("[*] " + Name);
					break;
				case "Year":
					System.out.println("[*] " + Year);
					break;
				case "Colour":
					System.out.println("[*] " + Colour);
					break;
				case  "Tank":
					System.out.println("[*] " + Tank);
					break;
				case "Price":
					System.out.println("[*] " + Price);
					break;
					
				default:
					System.out.println("You Have Entered An Invalid Attribute!!!");
					
			}
			
		}	
		
		
	}


	void edit() {
		if (Name == null)
			System.out.println("The Slot Is Empty!!!");
		else {
			Scanner Resp = new Scanner(System.in);
			System.out.println("Please Choose A Field: \n[*] Available Fields: \n\t[+] Year\n\t[+] Colour\n\t[+] Tank\n\t[+] Price\n:");
			String In1 = Resp.nextLine();
			
			switch (In1) {
				case "Year":
					Scanner Scan2 = new Scanner(System.in);
					System.out.println("Please Enter Your New Value: ");
					int NewVal1 =  Scan2.nextInt();
					Year = NewVal1;
					break;
				case "Colour":
					Scanner Scan3 = new Scanner(System.in);
					System.out.println("Please Enter Your New Value: ");
					String NewVal2 = Scan3.nextLine();
					Colour = NewVal2;
					break;
				case "Tank":
					Scanner Scan4 = new Scanner(System.in);
					System.out.println("Please Enter Your New Value: ");
					int NewVal3 = Scan4.nextInt();
					Tank = NewVal3;
					break;
				case "Price":
					Scanner Scan5 = new Scanner(System.in);
					System.out.println("Please Enter Your New Value: ");
					int NewVal4 = Scan5.nextInt();
					Price = NewVal4;
					break;
				case "Name":
					System.out.println("The Name Field Can Only Be Changed By Clearing The Slot!");
					break;
				default:
					System.out.println("You Have Entered An Invalid Field!!!");
			}
					
			}
			
	}
	void AddCar(int CarNum) {
		
		
				Scanner In1 = new Scanner(System.in);
				System.out.println("Please Enter The Car Name: ");
				String Res1 = In1.nextLine();
				
				Scanner In2 = new Scanner(System.in);
				System.out.println("Please Enter The Car Year: ");
				int Res2 = In2.nextInt();

				Scanner In3 = new Scanner(System.in);
				System.out.println("Please Enter The Car Colour: ");
				String Res3 = In3.nextLine();

				Scanner In4 = new Scanner(System.in);
				System.out.println("Please Enter The Car Tank Size");
				int Res4 = In4.nextInt();

				Scanner In5 = new Scanner(System.in);
				System.out.println("Please Enter The Car Price: ");
				int Res5 = In5.nextInt();

				Name = Res1;
				Year = Res2;
				Colour = Res3;
				Tank = Res4;
				Price = Res5;

				System.out.println("Car Saved!!!");
	
	}
	
	
	void Clear() {
		if (Name == null)
			System.out.println("Slot Already Empty!!!");
		else {
			  Name = null;
			  Year = 0;
			  Colour = null;
			  Tank = 0;
			  Price = 0;
			  
			  System.out.println("Slot Cleared!!!");
			  
		}
			
		
	}
}

public class CarsBroker {

	static Cars Car1 = new Cars();
	static Cars Car2 = new Cars();
	static Cars Car3 = new Cars();
	static Cars Car4 = new Cars();
	static Cars Car5 = new Cars();
	static Cars Car6 = new Cars();


	static void allDisp(int ObjNum) {
		switch (ObjNum) {
			case 1:
				if (Car1.Name == null)
					System.out.println("The Selected Slot Is Empty!!!");
				else
					Car1.display();
				break;
			case 2:
				if (Car2.Name == null)
					System.out.println("The Selected Slot Is Empty!!!");
				else
					Car2.display();
				break;
			case 3:
				if (Car3.Name == null)
					System.out.println("The Selected Slot Is Empty!!!");
				else
					Car3.display();
				break;
			case 4:
				if (Car4.Name == null)
					System.out.println("The Selected Slot Is Empty!!!");
				else
					Car4.display();
				break;
			case 5:
				if (Car5.Name == null)
					System.out.println("The Selected Slot Is Empty!!!");
				else
					Car5.display();
				break;
			case 6:
				if (Car6.Name == null)
					System.out.println("The Selected Slot Is Empty!!!");
				else
					Car6.display();
				break;
			default:
				System.out.println("You Have Entered An Invalid Value!!!");
				break;
	
	}
}
		

	public static void main(String[] args) {


		System.out.println("--------------------");
		System.out.println("Welcome To CarsBroker!!! Hit Enter To Continue");
		Scanner Welcome = new Scanner(System.in);
		System.out.println("--------------------");
		String Trash1 = Welcome.nextLine();


		int I1 = 0;
		while (I1 < 1) {
		System.out.println("Please Choose What You Would Like: ");
		System.out.println("\t(1) Add Car\n\t(2) Display Car\n\t(3) Edit Car\n\t(4) Clear SLot\n\t(5) Exit");
		Scanner Resp1 = new Scanner(System.in);
		System.out.println("Enter Response: ");
		int Input = Resp1.nextInt();
		
		
		switch (Input) {
			case 1:
				System.out.println("Available Car Slots: ");
				System.out.println("(1): " + (String) Car1.display_select("Name") + "\t(2): " + (String) Car2.display_select("Name") + "\t(3): " + (String) Car3.display_select("Name"));
				System.out.println("(4): " + (String) Car4.display_select("Name") + "\t(5): " + (String) Car5.display_select("Name") + "\t(6): " + (String) Car6.display_select("Name"));
				Scanner Resp2 = new Scanner(System.in);
				System.out.println("Please Choose A Slot: ");
				int Input2 = Resp2.nextInt();

				if (Input2 == 1) { 
					if (Car1.Name != null)
						System.out.println("Slot Is Full!!!");
					else
						Car1.AddCar(1);

				} else if (Input2 == 2) {
					if (Car2.Name != null)
						System.out.println("Slot Is Full!!!");
					else
						Car2.AddCar(2);
				} else if (Input2 == 3) {
					if (Car3.Name != null)
						System.out.println("Slot Is Full!!!");
					else
						Car3.AddCar(3);
				}else if (Input2 == 4) {
					if (Car4.Name != null)
						System.out.println("Slot Is Full!!!");
					else
						Car4.AddCar(4);
				} else if (Input2 == 5) {
					if (Car5.Name != null)
						System.out.println("Slot Is Full!!!");
					else
						Car5.AddCar(5);
				} else if (Input2 == 6) {
					if (Car6.Name != null)
						System.out.println("Slot Is Full!!!");
					else
						Car6.AddCar(6);
				} else {
					System.out.println("You Have Entered An Invalid Value!!!");
				}
				break;



			case 2:
				System.out.println("Select Option: \n\t(1) Display All Traits");
				Scanner Resp3 = new Scanner(System.in);
				System.out.println("\t(2) Display Select Traits");
				int Input3 = Resp3.nextInt();
				switch (Input3) {
					case 1:
						System.out.println("Available Cars: ");
						System.out.println("Car (1): " + Car1.display_select("Name") + "\t(2): " + Car2.display_select("Name") + "\t(3): " + Car3.display_select("Name"));
						System.out.println("Car (4): " + Car4.display_select("Name") + "\t(5): " + Car5.display_select("Name") + "\t(6): " + Car6.display_select("Name"));
						Scanner Resp4 = new Scanner(System.in);
						System.out.println("Please Select A Car: ");
						int Input4 = Resp4.nextInt();
						allDisp(Input4); 
						break;
					case 2:
						System.out.println("Available Cars: ");
						System.out.println("Car (1): " + Car1.display_select("Name") + "\t(2): " + Car2.display_select("Name") + "\t(3) " + Car3.display_select("Name"));
						System.out.println("Car (4): " + Car4.display_select("Name") + "\t(5): " + Car5.display_select("Name") + "\t(6) " + Car6.display_select("Name"));
						Scanner Resp5 = new Scanner(System.in);
						System.out.println("Please Select A Car: ");
						int Input5 = Resp5.nextInt();
						
						switch (Input5) {
							case 1:
								Car1.dispSelect();
								break;
							case 2:
								Car2.dispSelect();
								break;
							case 3:
								Car3.dispSelect();
								break;
							case 4:
								Car4.dispSelect();
								break;
							case 5:
								Car5.dispSelect();
								break;
							case 6:
								Car6.dispSelect();
						}

						break;
				} break;
				
			case 3:
				System.out.println("Available Cars: ");
				System.out.println("Car (1): " + Car1.display_select("Name") + "\t(2): " + Car2.display_select("Name") + "\t(3) " + Car3.display_select("Name"));
				System.out.println("Car (4): " + Car4.display_select("Name") + "\t(5): " + Car5.display_select("Name") + "\t(6) " + Car6.display_select("Name"));
				Scanner EdResp = new Scanner(System.in);
				System.out.println("Please Choose The Slot You Would Like To Edit: ");
				int Ansed = EdResp.nextInt();
				
				switch (Ansed) {
					case 1:
						Car1.edit();
						break;
					case 2:
						Car2.edit();
						break;
					case 3:
						Car3.edit();
						break;
					case 4:
						Car4.edit();
					case 5:
						Car5.edit();
					case 6:
						Car6.edit();
						break;
					default:
						System.out.println("You Have Entered An INVALID Slot Number!!!");
						break;
				}
				break;
				
			case 4:
				System.out.println("Available Slots: ");
				System.out.println("Car (1): " + Car1.display_select("Name") + "\t(2): " + Car2.display_select("Name") + "\t(3): " + Car3.display_select("Name"));
				System.out.println("Car (4): " + Car4.display_select("Name") + "\t(5): " + Car5.display_select("Name") + "\t(6): " + Car6.display_select("Name"));
				
				Scanner Resp6 = new Scanner(System.in);
				System.out.println("Entered The Slot To Be Cleared: ");
				int Input6 = Resp6.nextInt();
				
				switch (Input6) {
					case 1:
						Car1.Clear();
						break;
					case 2:
						Car2.Clear();
						break;
					case 3:
						Car3.Clear();
						break;
					case 4:
						Car4.Clear();
						break;
					case 5:
						Car5.Clear();
						break;
					case 6:
						Car5.Clear();
						break;
				}
				break;
				
			
				
			case 5:
				I1 += 1;
				break;
		}
				
	}		

	}
}

