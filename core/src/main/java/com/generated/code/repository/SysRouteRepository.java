package com.generated.code.repository;

import com.edgar.core.jdbc.JdbcRepository;
import org.springframework.stereotype.Repository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import com.generated.code.repository.db.SysRouteDB;
import com.generated.code.domain.SysRoute;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
@Repository
public class SysRouteRepository extends JdbcRepository<SysRoute, Integer>
{

	final static Logger logger = LoggerFactory.getLogger (SysRouteRepository.class);

	public SysRouteRepository()
	{
		super (SysRouteDB.ROW_MAPPER, SysRouteDB.ROW_UNMAPPER);
	}



	/* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

}

