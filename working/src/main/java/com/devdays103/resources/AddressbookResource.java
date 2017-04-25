package com.devdays103.resources;

import com.devdays103.api.AddressbookService;
import com.devdays103.dto.ContactDTO;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Singleton
@Path("/addressbook")
public class AddressbookResource {

	@Inject
	AddressbookService addressbookService;

	ObjectMapper mapper = new ObjectMapper();

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createContact(@Valid ContactDTO contactDTO) throws JsonProcessingException {
//		/** Custom business validation **/
//		/** Check no other person with the same SSN is registered */
//		/** DB call here... */
//		Set<ValidationError> errors = new HashSet<>();
//		if (contactDTO.getSsn().equals("123")) {
//			errors.add(new ValidationError("ssn", "A person with the same SSN is already registered."));
//		}
//
//		if (contactDTO.getAge() == 0 && contactDTO.getYear() == 0) {
//			errors.add(new ValidationError("age", "Age or year should be filed-in."));
//			errors.add(new ValidationError("year", "Age or year should be filed-in."));
//		}
//
//		if (!errors.isEmpty()) {
//			return Response.status(Response.Status.BAD_REQUEST).entity(mapper.writeValueAsString(errors)).build();
//		}

		addressbookService.createContact(contactDTO);
		return Response.ok().build();
	}
}
