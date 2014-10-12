package com.syedatifakhtar;

import java.util.List;

import javax.jws.WebService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import org.springframework.beans.factory.annotation.Value;

import com.syedatifakhtar.dao.EeeyanDAO;
import com.syedatifakhtar.model.Event;

@WebService
@Path("/")
@Produces("application/json")
public class HelloCXFImpl implements HelloCXF{
	
	@Value("${testmessage}")
	private static String helloWorldMessage =  "EEEEEEEEEEEEEEEEEEEEEEEEYYYYYYYYYYYYYYYYYYYAN!!!!!!";
	
	private EeeyanDAO eeeyanDao;

	@GET
	@Path("/event/{eventID}")
	@Override
	public Event findEvent(@PathParam("eventID") int eventID) {
		
		System.out.println("Ok i was called!!You can celebrate now!");
		System.out.println(helloWorldMessage + "  Fetching details for Event ID: " + eventID + "\n");
		return eeeyanDao.getEvent(eventID);
	}
	@GET
	@Path("/events/")
	@Override
	public List<Event> listEvents() {
		return eeeyanDao.getEvents();
	}
	
	@POST
	@Path("/addEvent")
	@Consumes("application/json")
	@Override
	public void addEvent(Event event) {
		eeeyanDao.addEvent(event);
	}
	
	public EeeyanDAO getEeeyanDao() {
		return eeeyanDao;
	}

	public void setEeeyanDao(EeeyanDAO eeyanDao) {
		this.eeeyanDao = eeyanDao;
	}

}
