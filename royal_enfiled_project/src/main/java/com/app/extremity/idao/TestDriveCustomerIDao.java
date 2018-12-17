package com.app.extremity.idao;

import org.springframework.data.repository.CrudRepository;

import com.app.extremity.model.TestDriveCustomer;

public interface TestDriveCustomerIDao  extends CrudRepository<TestDriveCustomer, String>
{

}
