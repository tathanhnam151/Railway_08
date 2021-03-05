public class Program {
	public static void main(String[] args) {

		// Insert departments

		Department department1 = new Department();
		department1.id = 1;
		department1.name = "Sale";

		Department department2 = new Department();
		department2.id = 2;
		department2.name = "Marketing";

		Department department3 = new Department();
		department3.id = 3;
		department3.name = "Logistics";

		// Insert positions
		Position positionManager = new Position();
		positionManager.id = 1;
		positionManager.name = "Manager";

		Position positionSupervisor = new Position();
		positionSupervisor.id = 2;
		positionSupervisor.name = "Supervisor";

		Position positionAssistant = new Position();
		positionAssistant.id = 3;
		positionAssistant.name = "Assistant";

		Position positionDev = new Position();
		positionDev.id = 4;
		positionDev.name = "Developer";

		// Insert accounts
		Account acc1 = new Account();
		acc1.id = 1;
		acc1.username = "namta2611";
		acc1.fullName = "Ta Thanh Nam";
		acc1.email = "namta2611@gmail.com";
		acc1.department = department1;
		acc1.position = positionManager;

		Account acc2 = new Account();
		acc2.id = 2;
		acc2.username = "nguyentran151";
		acc2.fullName = "Tran An Nguyen";
		acc2.email = "nguyentran151@gmail.com";
		acc2.department = department2;
		acc2.position = positionSupervisor;

		Account acc3 = new Account();
		acc3.id = 3;
		acc3.username = "hongbui0510";
		acc3.fullName = "Bui Hong";
		acc3.email = "hongbui0510@gmail.com";
		acc3.department = department3;
		acc3.position = positionManager;

		Account acc4 = new Account();
		acc4.id = 4;
		acc4.username = "huytran2002";
		acc4.fullName = "Tran Quang Huy";
		acc4.email = "huytran2002@gmail.com";
		acc4.department = department2;
		acc4.position = positionAssistant;

		// Insert groups
		Group group1 = new Group();
		group1.id = 1;
		group1.name = "Group1";
		group1.creator = acc1;

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "Group2";
		group2.creator = acc2;

		Group group3 = new Group();
		group3.id = 3;
		group3.name = "Group3";
		group3.creator = acc3;

		// Insert question categories
		CategoryQuestion cate1 = new CategoryQuestion();
		cate1.id = 1;
		cate1.name = "Java";

		CategoryQuestion cate2 = new CategoryQuestion();
		cate2.id = 2;
		cate2.name = "SQL";

		// Insert question types
		TypeQuestion essayType = new TypeQuestion();
		essayType.id = 1;
		essayType.name = "Essay";

		TypeQuestion choiceType = new TypeQuestion();
		choiceType.id = 1;
		choiceType.name = "Essay";

		// Insert group to account
		Group[] groupOfAccount1 = { group1 };
		acc1.groups = groupOfAccount1;

		Group[] groupOfAccount2 = { group3 };
		acc2.groups = groupOfAccount2;

		Group[] groupOfAccount3 = { group1 };
		acc3.groups = groupOfAccount3;

		// Insert accounts to group
		Account[] accountOfGroups1 = { acc1, acc2, acc3 };
		group1.accounts = accountOfGroups1;

		// Insert question
		Question q1 = new Question();
		q1.id = 1;
		q1.category = cate1;
		q1.content = "Question about Java";
		q1.creator = acc1;
		q1.type = essayType;
		
		//Others
		Account[] accounts = { acc1, acc2, acc3, acc4 };

		// Question 1
		if (acc2.department == null) {
			System.out.println("This employee is not in any department yet");
		} else {
			System.out.println("This employee's department is " + acc2.department.name);
		}

		// Question 3
		System.out.println(acc2.department == null ? "This employee is not in any department yet" : "This employee's department is " + acc2.department.name);
			
		// Question 4
		System.out.println(acc1.position == positionDev ? "This person is a Developer" : "This is not a developer");
		
		// Question 5
		int x = group1.accounts.length;
		switch (x) {
		case 1:
			System.out.println("This group has 1 member");
			break;
		case 2:
			System.out.println("This group has 2 members");
			break;
		case 3:
			System.out.println("This group has 3 members");
		}
		
		// Question 6
		int y = acc2.groups.length;
		switch (y) {
		case 0:
			System.out.println("This member is not in a group yet");
			break;
		case 1:
			System.out.println("Group: " + acc2.groups[0].id);
			break;
		case 2:
			System.out.println("Group: " + acc2.groups[0].id + ", " + acc2.groups[1].id);
			break;
		case 3:
			System.out.println("Many groups");
			break;
		}

		// Question 7
		String z = acc2.position.name;
		switch (z) {
		case "Developer":
			System.out.println("This person is a Developer");
		default:
			System.out.println("This person is not a Developer");
		}
		
	
		// Question 14	
		for (int i = 0; i < accounts.length; i++) {
		if (accounts[i].id < 4) {
			System.out.println("Thong tin account thu " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
				}
			}

		// Question 15
		for (int i = 2; i <= 20; i = i + 2) {
			System.out.println(i);
			}
			
		// Question 8
		for (Account account: accounts) {
			System.out.println("Information of account number " + account.id);
			System.out.println("Email: " + account.email);
			System.out.println("Full name: " + account.email);
			System.out.println("Department: " + account.department.name);
		}
		
		// Question 9
		Department[] departments = { department1, department2, department3 };
		for (Department department : departments) {
			System.out.println("ID Department: " + department.id);
			System.out.println("Name Department: " + department.name);
		}	
		// Question 10
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Thong tin account thu " + (i + 1) + " la:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
		}
		
		// Question 11
		for (Department department : departments) {
			System.out.println("Information of deparment number " + department.id);
			System.out.println("ID: " + department.id);
			System.out.println("Name: " + department.name);
			}
		
		// Question 12
		for (int i = 0; i < 2; i++) {
			System.out.println("Information of department number " + (i + 1) + " is:");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}
		
		// Question 13	
		for (int i = 0; i < accounts.length; i++) {
			if (i != 1) {
				System.out.println("Thong tin account thu " + (i + 1) + " la:");
				System.out.println("Email: " + accounts[i].email);
				System.out.println("Fullname: " + accounts[i].fullName);
				System.out.println("Department: " + accounts[i].department.name);
			}
		}
		
		//Question 16.10
		int i = 0;
		while (i < accounts.length) {
			System.out.println("Thong tin account thu " + (i + 1) + " la:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
			i++;
		}
		
		//Question 16.11
		i = 0;
		while (i < departments.length) {
			System.out.println("Information of department number " + (i + 1) + " is:");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
			i++;
		}
		
		//Question 16.12
		i = 0;
		while (i < 2) {
			System.out.println("Information of department number " + (i + 1) + " is:");
			System.out.println("ID: " + departments[i].id);
			System.out.println("Name: " + departments[i].name);
		}
		
		//Question 16.13
		i = 0;
		while (i < accounts.length) {
			if (i == 1) {
				i++;
				continue;
			}
			System.out.println("Thong tin account thu " + (i + 1) + " la:");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
		}
		
		//Question 16.14
		i = 0;
		while (i < accounts.length) {
			if (accounts[i].id > 4) {
				i++;
				continue;
			}
			System.out.println("Thong tin account thu " + (i + 1) + " là :");
			System.out.println("Email: " + accounts[i].email);
			System.out.println("Fullname: " + accounts[i].fullName);
			System.out.println("Department: " + accounts[i].department.name);
		}
		
		
		
	}
}


