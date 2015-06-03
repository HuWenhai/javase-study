package com.generated.code.repository;

import com.edgar.core.jdbc.JdbcRepository;
import com.generated.code.domain.Test2Table;
import com.generated.code.repository.db.Test2TableDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
@Repository
public class Test2TableRepository extends JdbcRepository<Test2Table, Test2Table.PKey>
{

	final static Logger logger = LoggerFactory.getLogger(Test2TableRepository.class);

	public Test2TableRepository()
	{
		super (Test2TableDB.ROW_MAPPER, Test2TableDB.ROW_UNMAPPER);
	}

    @Override
    public int deleteByPrimaryKey(Test2Table.PKey pKey) {
        return 0;
    }



	/* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

}

