package com.example.shopTeen.repository;





import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.shopTeen.entity.Topic;





@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer>{
	 
	
		
		
}
