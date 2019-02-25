package com.pattern.application;

import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/pattern")
public class PatternRecognitionClass {

	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
		String output = "WelcomE" +msg;
		return Response.status(200).entity(output).build();
		
	}
	@GET
	@Path("/space")
	@Produces(MediaType.TEXT_PLAIN)
	public int getPointsInSpace() {
		
		return 0;	
	}
	
	@GET
	@Path("/lines/{n}")
	@Produces(MediaType.TEXT_PLAIN)
	public int getLineSegments(@PathParam("n") int n) {
		
		return 0;	
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addPointToSpace(@FormParam("x") String x, @FormParam("y") String y)
	{
		return Response.status(200).entity(" Product added successfuly!<br> X: "+x+"<br> Y: " + y).build(); 
		
	}
	
	
}
