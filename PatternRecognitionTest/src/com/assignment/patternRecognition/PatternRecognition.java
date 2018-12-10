package com.assignment.patternRecognition;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/Pattern")
public class PatternRecognition {

	
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
	@Path("{points}")
	@Produces(MediaType.TEXT_PLAIN)
	public String addPointToSpace(@PathParam("points") String points)
	{
		return null;
		
	}
	
	
}
