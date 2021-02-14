package com.behaviosec.license.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.behaviosec.license.model.Organization;

@Repository
public interface OrganizationRedisRepository extends CrudRepository<Organization,String>  {
}
