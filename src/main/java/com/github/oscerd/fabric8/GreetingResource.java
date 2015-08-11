/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.oscerd.fabric8;

import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greet")
public class GreetingResource {

	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)
	public JsonObject greet(@PathParam("name") String name) {
		String env = System.getenv().get("HOSTNAME");
		return Json.createObjectBuilder().add("name", name).add("environment", env).build();
	}

}
