package com.misq.springframework.services;

import com.misq.springframework.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
