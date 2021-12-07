package com.xworkz.cloneapp;

public class ShowRoomInitiator {

	public static void main(String[] args) throws CloneNotSupportedException {
	   ShowRoom room=new ShowRoom();
	   room.setName("HONDA");
       room.setOwner("Soichiro Honda");
       room.setStartedYear(1959);
       
       ShowRoom room1=(ShowRoom)room.clone();
       System.out.println(room);
	}

}
