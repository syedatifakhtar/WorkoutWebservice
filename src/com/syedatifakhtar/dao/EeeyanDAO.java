package com.syedatifakhtar.dao;

import java.util.ArrayList;
import java.util.HashMap;

import com.syedatifakhtar.model.Event;

public class EeeyanDAO {

	private HashMap<Integer,Event> mapOfEeeyanEvents;
	
	public EeeyanDAO() {
		dummyInit();
	}
	
	//Initialize with dummy events d'oh!
	public void dummyInit() {
		mapOfEeeyanEvents	=	new HashMap<Integer,Event>();
		
		Event event	=	new Event();
		event.setId("1");
		event.setName("Eeeeyan brigade performing live at Hard Rock!!!");
		mapOfEeeyanEvents.put(1, event);
		
		event	=	new Event();
		event.setId("2");
		event.setName("The Eeeeyans at Hauz Khaas Social");
		mapOfEeeyanEvents.put(2, event);
		
		event	=	new Event();
		event.setId("3");
		event.setName("Rajus absinthe Oktoberfest");
		mapOfEeeyanEvents.put(3, event);
		
	}
	
	public Event getEvent(int id) {
		return mapOfEeeyanEvents.get(id);
	}
}
