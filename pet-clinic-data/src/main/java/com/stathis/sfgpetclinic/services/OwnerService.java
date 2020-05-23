package com.stathis.sfgpetclinic.services;

import com.stathis.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
