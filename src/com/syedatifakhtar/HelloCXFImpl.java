package com.syedatifakhtar;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/")
public class HelloCXFImpl implements HelloCXF{

	@GET
	@Path("/sayHello/{name}")
	@Override
	public String sayHello(@PathParam("name") String name) {
		// TODO Auto-generated method stub
		System.out.println("Ok i was called!!You can celebrate now!");
		return "Hello " + name + " - I am dave!";
	}

}
