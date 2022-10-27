package myFirstProgramme;

public class Friend {
	String name ;
	static int numberOfFreinds ;
	Friend(String name){
		this.name = name ; 
		numberOfFreinds++ ;
	}
	
	static void displayFriends() {
		System.out.println("you have "+numberOfFreinds+" friends");
	}
	
	
	
}

//public class Main {
//
//	public static void main(String[] args) { 
//		
//		Friend friend1 = new Friend("khalid");
//		Friend friend2 = new Friend("dfh");
//		Friend friend3 = new Friend("khazxflid");
//		Friend friend4 = new Friend("khalidxzdv");
//		
//		Friend.displayFriends()	;
//		
//		}
//}
