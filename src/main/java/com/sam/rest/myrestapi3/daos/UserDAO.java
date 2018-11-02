package com.sam.rest.myrestapi3.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sam.rest.myrestapi3.beans.Users;

/**
 * @author 446407
 *
 */
@Repository
public interface UserDAO extends JpaRepository<Users,Integer>{
	
}
