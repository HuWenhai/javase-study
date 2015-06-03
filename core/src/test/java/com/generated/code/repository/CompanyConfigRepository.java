package com.generated.code.repository;

import com.edgar.core.jdbc.JdbcRepository;
import com.generated.code.domain.CompanyConfig;
import com.generated.code.repository.db.CompanyConfigDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
@Repository
public class CompanyConfigRepository extends JdbcRepository<CompanyConfig, Integer>
{

	final static Logger logger = LoggerFactory.getLogger(CompanyConfigRepository.class);

	public CompanyConfigRepository()
	{
		super (CompanyConfigDB.ROW_MAPPER, CompanyConfigDB.ROW_UNMAPPER);
	}

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return deleteByPrimaryKey(CompanyConfigDB.DELETE_BY_PK_SQL, id);
    }



	/* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

}

