package com.devdays103.impl;

import com.devdays103.api.AddressbookService;
import com.devdays103.dto.ContactDTO;
import org.ops4j.pax.cdi.api.OsgiServiceProvider;

import javax.inject.Singleton;
import java.util.logging.Level;
import java.util.logging.Logger;

@Singleton
@OsgiServiceProvider(classes = {AddressbookService.class})
public class AddressbookServiceImpl implements AddressbookService {
	/** JUL reference */
	private final static Logger LOGGER = Logger.getLogger(AddressbookServiceImpl.class.getName());

	public void createContact(ContactDTO contactDTO) {
		LOGGER.log(Level.INFO, "Contact created.");
	}
}
