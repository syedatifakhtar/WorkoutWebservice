package com.syedatifakhtar.dao;

import java.util.HashMap;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import com.syedatifakhtar.model.Event;




public class EeeyanDAO {

	public SessionFactory getMySessionFactory() {
		return mySessionFactory;
	}

	public void setMySessionFactory(SessionFactory mySessionFactory) {
		this.mySessionFactory = mySessionFactory;
	}

	@Autowired
	@Qualifier("mySessionFactory")
	private SessionFactory mySessionFactory;
	
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
	
	@Transactional
	public List<Event> getEvents() {
		List<Event> events= null;
		events=getMySessionFactory().getCurrentSession().createQuery("FROM Event").list();
		return events;
	}
	@Transactional
	public Event getEvent(int id) {
		Event event;
		event=(Event) getMySessionFactory().getCurrentSession().get(Event.class, id);
		return event;
	}
	
	@Transactional
	public Event addEvent(Event event) {
		getMySessionFactory().getCurrentSession().save(event);
		return event;
	}
}
