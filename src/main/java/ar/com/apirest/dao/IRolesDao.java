/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.apirest.dao;

import ar.com.apirest.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author jorge
 */
@Repository
public interface IRolesDao extends JpaRepository<Roles, Integer>{
    
    
    
}
