package salesPerson;

import java.util.*;

class SalesPerson{
	
	public  void  askSalesPerson() {
		
		Scanner scSeller = new Scanner(System.in);
		System.out.println("Hi! What do you want to buy today?\n 1 - Pen\n 2 - Pencil\n 3 - Book\n Select Number");
		int item = scSeller.nextInt();
		//scSeller.close();
		switch (item){
		case 1 -> {
			String Pen = buyPen();
			System.out.println("Return Value from buyPen Method \n " + Pen);

		
		}
		case 2 -> {
			String Pencil = buyPencil();
			System.out.println("Return Value from buyPencil Method " + Pencil);

		}
		case 3 -> {
			String Book = buyBook();
			System.out.println("Return Value from buyBook Method " + Book);
		
		}
		
		
			default-> System.out.println("Sorry I don't have that item with me");
	}
		
	}

	private String buyBook() {
		Scanner scSeller = new Scanner(System.in);
		System.out.println("What's the Book you want to Purchase?\n40 Pages \n80 Pages\n 180 Pages");
		int pages = scSeller.nextInt();
		scSeller.close();
		switch (pages) {
		
		case 40 -> {
			System.out.println("Here you go! a 40 Page Book");
			String returnString = "Here you go! a 40 Page Book";
			//scBook.close();
			return returnString;
		}
		
		case 80 -> {
			System.out.println("Here you go! a 80 Page Book");
			String returnString = "Here you go! a 80 Page Book";
			return returnString;
		}
		
		case 180 -> {
			System.out.println("Here you go! a 180 Page Book");
			String returnString = "Here you go! a 180 Page Book";
			return returnString;
		}
		default-> {
			
			System.out.println("Sorry I don't have that item with me");
			String returnString = "Sorry I don't have that item with me";
			return returnString;
		
		}
		
	}
		
}
		

	private  String buyPencil() {
		Scanner scSeller = new Scanner(System.in);
		System.out.println("What's the Pencil you want to Purchase?\n HB \n 2B \n 3B");
		String cbn = scSeller.nextLine();
		scSeller.close();
		
		
		
		switch (cbn) {
	
		case "HB" -> {
		System.out.println("Here you go! an HB Pencil");
		String returnString = "Here you go! an HB Pencil";
		return returnString;
		
	}
	
		case "2B" ->{
		System.out.println("Here you go! a 2B Pencil");
		String returnString = "Here you go! a 2B Pencil";
		return returnString;
	}
	
		case "3B" ->{
		System.out.println("Here you go! a 3B Pencil");
		String returnString = "Here you go! a 3B Pencil";
		return returnString;
	}
		default-> {
		
		System.out.println("Sorry I don't have that item with me");
		String returnString = "Sorry I don't have that item with me";
		return returnString;
		
	
		}
		
	}
		
		
	}

	private  String buyPen() {
		Scanner scSeller = new Scanner(System.in);
		System.out.println("What's the Pen you want to Purchase?\n Paker \n Atlas \n Renolds");
		String cbn = scSeller.nextLine();
		scSeller.close();
		
		
		
		switch (cbn) {
	
		case "Parker" -> {
		System.out.println("Here you go! a Parker Pen");
		String returnString = "Here you go! a Paker Pen";
		return returnString;
		
	}
	
		case "Atlas" ->{
		System.out.println("Here you go! an Atlas Pen");
		String returnString = "Here you go! an Atlas Pen";
		return returnString;
	}
	
		case "Renolds" ->{
		System.out.println("Here you go! a Renolds Pen");
		String returnString = "Here you go! a Renolds Pen";
		return returnString;
		
	}
		default-> {
		
		System.out.println("Sorry I don't have that item with me");
		String returnString = "Sorry I don't have that item with me";
		return returnString;
		
		
		
	} 
		
		
		
		}
		
	}
	
	
}


