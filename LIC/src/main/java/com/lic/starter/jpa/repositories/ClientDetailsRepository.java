package com.lic.starter.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.starter.jpa.entities.ClientDetails;

@Repository
public interface ClientDetailsRepository extends JpaRepository<ClientDetails,Integer> {

}
