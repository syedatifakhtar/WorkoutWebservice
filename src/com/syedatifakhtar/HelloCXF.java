package com.syedatifakhtar;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.syedatifakhtar.model.Event;

@WebService
interface HelloCXF {
	
	@WebMethod
	Event findEvent(String id);

}
