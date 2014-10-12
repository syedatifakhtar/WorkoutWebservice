package com.syedatifakhtar;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.syedatifakhtar.model.Event;

@WebService
interface HelloCXF {
	
	@WebMethod
	Event findEvent(int id);

	@WebMethod
	List<Event> listEvents();
	
	@WebMethod
	void addEvent(Event event);
}
