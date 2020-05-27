package com.stathis.sfgpetclinic.repositories;

import com.stathis.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
