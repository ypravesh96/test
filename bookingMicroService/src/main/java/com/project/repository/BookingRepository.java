package com.project.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.modal.Booking;

public interface BookingRepository extends MongoRepository<Booking,String> {

}
