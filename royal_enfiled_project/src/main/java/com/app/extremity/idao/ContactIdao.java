package com.app.extremity.idao;



import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Contact;


public interface ContactIdao extends CrudRepository<Contact, String>{

}
