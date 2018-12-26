package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;import org.springframework.stereotype.Repository;

import com.app.extremity.model.Feedback;

public interface FeedbackIDao extends CrudRepository<Feedback, Integer>{

}
