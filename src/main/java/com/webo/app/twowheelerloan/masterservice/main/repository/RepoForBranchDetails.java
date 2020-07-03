package com.webo.app.twowheelerloan.masterservice.main.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.webo.app.twowheelerloan.masterservice.main.model.BranchDetails;

@Repository
public interface RepoForBranchDetails extends JpaRepository<BranchDetails, Integer> {
	
	
	

}
