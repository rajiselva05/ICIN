package com.icinbank.onlinebanking.Repository;

import com.icinbank.onlinebanking.Entity.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentDao extends CrudRepository<Appointment, Long> {
    List<Appointment> findAll();
}