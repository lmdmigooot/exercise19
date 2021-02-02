package org.fujitsu.training.codesA;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

	List hotelsEntered = new ArrayList();
	
	 public void addHotel(String hotelName, byte room, Double roomWidth, Double roomHeight) {
		 StringBuilder input = new StringBuilder("");
		 input.append(hotelName+" ");
		 input.append(room+" ");
		 input.append(roomWidth+" ");
		 input.append(roomHeight);
		 hotelsEntered.add(input);
	 }
	 
	 public void showHotel() {
		 for (int i = 0; i < hotelsEntered.size(); i++) {
				System.out.println(hotelsEntered.get(i) + " ");
			}
	 }

}
