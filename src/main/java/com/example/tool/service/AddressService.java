package com.example.tool.service;

import com.example.tool.model.Address;
import com.example.tool.model.Mail;
import com.example.tool.model.Phone;
import com.example.tool.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by sackmann on 14.08.2017.
 */
@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Long create(Address address){

        for(Mail mail: address.getCommunication().getMails()){
            mail.setAddress(address);
        }
        for(Phone phone: address.getCommunication().getPhones()){
            phone.setAddress(address);
        }

        return addressRepository.save(address).getId();
    }

    public Address read(Long id){
        return addressRepository.findOne(id);
    }
}
