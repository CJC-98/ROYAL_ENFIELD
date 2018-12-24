package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.Color;

public interface ColorDaoI extends CrudRepository<Color, String> {

}
