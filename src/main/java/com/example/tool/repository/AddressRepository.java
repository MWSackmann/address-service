package com.example.tool.repository;

import com.example.tool.model.Address;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by sackmann on 14.08.2017.
 */
public interface AddressRepository extends CrudRepository<Address, Long> {
}
