package com.test;

import java.util.HashMap;
import java.util.Iterator;

import javax.ws.rs.*;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;

@Path("/album")
public class Album {

	private HashMap<String, Track> album;

	public Album() {

		album = new HashMap<String, Track>();
		init();
	}

	// Initializing album with dummy entries
	private void init() {
		
		album.put("1", new Track("1", "Like a Rolling Stone", "Bob Dylan", "2012"));
		album.put("2", new Track("2", "Respect", "Aretha Franklin", "2012"));
		album.put("3", new Track("3", "My Generation", "The Who", "2010"));
		
	}

	@GET
	@Path("/track/{id}")
	public Response getTrack(@PathParam("id") String id) {
		Track track = album.get(id);

		return Response
				.status(200)
				.entity(track.getTrackId() + ", " + track.getName() + ", "
						+ track.getSinger() + ", " + track.getYear()).build();
//		return Response.ok(track).build();
	}

	@POST
	@Path("/track/add")
	public Response addTrack(
			@FormParam("id") String id,
			@FormParam("name") String name,
			@FormParam("singer") String singer,
			@FormParam("year") String year) {
		album.put(id, new Track(id, name, singer, year));

		return Response.status(200).entity("New Track Added: " + name).build();
	}

	@GET
	@Path("/query")
	public Response queryByYear(@QueryParam("year") String year) {

		String resultList = "";

		Iterator iter = album.keySet().iterator();
		while (iter.hasNext()) {
			String key = (String) iter.next();
			Track tr = (Track) album.get(key);

			if (tr.getYear().equalsIgnoreCase(year)) {
				resultList += tr.getName() + ", ";
			}

		}

		return Response.status(200).entity(resultList).build();
	}

}