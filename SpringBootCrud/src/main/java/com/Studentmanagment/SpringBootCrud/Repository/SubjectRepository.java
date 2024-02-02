package com.Studentmanagment.SpringBootCrud.Repository;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Studentmanagment.SpringBootCrud.Bean.Subject;


@Repository
public interface SubjectRepository extends CrudRepository<Subject,String> {
	

}