package com.generated.code.repository.db;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;
import com.edgar.core.jdbc.RowUnmapper;
import com.generated.code.domain.CompanyConfig;
import java.sql.Timestamp;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
public class CompanyConfigDB
{

	private static String TABLE_NAME = "COMPANY_CONFIG";

	private static String TABLE_ALIAS = "cc";

	public static String getTableName()
	{
		return TABLE_NAME;
	}

	public static String getTableAlias()
	{
		return TABLE_NAME + " as " + TABLE_ALIAS;
	}

	public static String getAlias()
	{
		return TABLE_ALIAS;
	}

	public static String selectAllColumns(boolean ... useAlias)
	{
		return (useAlias[0] ? TABLE_ALIAS : TABLE_NAME) + ".*";
	}

	public enum COLUMNS
	{
		CONFIG_ID("config_id"),
		COMPANY_ID("company_id"),
		CONFIG_KEY("config_key"),
		CONFIG_VALUE("config_value"),
		DESCRIPTION("description"),
		CREATED_TIME("created_time"),
		UPDATED_TIME("updated_time"),
		;

		private String columnName;

		private COLUMNS (String columnName)
		{
			this.columnName = columnName;
		}

		public void setColumnName (String columnName)
		{
			this.columnName = columnName;
		}

		public String getColumnName ()
		{
			return this.columnName;
		}

		public String getColumnAlias ()
		{
			return TABLE_ALIAS + "." + this.columnName;
		}

		public String getColumnAliasAsName ()
		{
			return TABLE_ALIAS  + "." + this.columnName + " as " + TABLE_ALIAS + "_" + this.columnName;
		}

		public String getColumnAliasName ()
		{
			return TABLE_ALIAS + "_" + this.columnName;
		}

	}

	public CompanyConfigDB ()
	{

	}

	public static final RowMapper<CompanyConfig> ROW_MAPPER = new CompanyConfigRowMapper ();
	public static final class  CompanyConfigRowMapper implements RowMapper<CompanyConfig>
	{
		public CompanyConfig mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			CompanyConfig obj = new CompanyConfig();
			obj.setConfigId(rs.getInt(COLUMNS.CONFIG_ID.getColumnName()));
			obj.setCompanyId(rs.getInt(COLUMNS.COMPANY_ID.getColumnName()));
			obj.setConfigKey(rs.getString(COLUMNS.CONFIG_KEY.getColumnName()));
			obj.setConfigValue(rs.getString(COLUMNS.CONFIG_VALUE.getColumnName()));
			obj.setDescription(rs.getString(COLUMNS.DESCRIPTION.getColumnName()));
			obj.setCreatedTime(rs.getTimestamp(COLUMNS.CREATED_TIME.getColumnName()));
			obj.setUpdatedTime(rs.getTimestamp(COLUMNS.UPDATED_TIME.getColumnName()));
			return obj;
		}
	}

	public static final RowUnmapper<CompanyConfig> ROW_UNMAPPER = new CompanyConfigRowUnmapper ();
	public static final class CompanyConfigRowUnmapper implements RowUnmapper<CompanyConfig>
	{
		public Map<String, Object> mapColumns(CompanyConfig companyconfig)
		{
			Map<String, Object> mapping = new LinkedHashMap<String, Object>();
			mapping.put(COLUMNS.CONFIG_ID.getColumnName(), companyconfig.getConfigId());
			mapping.put(COLUMNS.COMPANY_ID.getColumnName(), companyconfig.getCompanyId());
			mapping.put(COLUMNS.CONFIG_KEY.getColumnName(), companyconfig.getConfigKey());
			mapping.put(COLUMNS.CONFIG_VALUE.getColumnName(), companyconfig.getConfigValue());
			mapping.put(COLUMNS.DESCRIPTION.getColumnName(), companyconfig.getDescription());
			if (companyconfig.getCreatedTime() != null)
				mapping.put(COLUMNS.CREATED_TIME.getColumnName(), new Timestamp (companyconfig.getCreatedTime().getTime()));
			if (companyconfig.getUpdatedTime() != null)
				mapping.put(COLUMNS.UPDATED_TIME.getColumnName(), new Timestamp (companyconfig.getUpdatedTime().getTime()));
			return mapping;
		}
	}

	public static final RowMapper<CompanyConfig> ALIAS_ROW_MAPPER = new CompanyConfigAliasRowMapper ();
	public static final class  CompanyConfigAliasRowMapper implements RowMapper<CompanyConfig>
	{
		public CompanyConfig mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			CompanyConfig obj = new CompanyConfig();
			obj.setConfigId(rs.getInt(COLUMNS.CONFIG_ID.getColumnAliasName()));
			obj.setCompanyId(rs.getInt(COLUMNS.COMPANY_ID.getColumnAliasName()));
			obj.setConfigKey(rs.getString(COLUMNS.CONFIG_KEY.getColumnAliasName()));
			obj.setConfigValue(rs.getString(COLUMNS.CONFIG_VALUE.getColumnAliasName()));
			obj.setDescription(rs.getString(COLUMNS.DESCRIPTION.getColumnAliasName()));
			obj.setCreatedTime(rs.getTimestamp(COLUMNS.CREATED_TIME.getColumnAliasName()));
			obj.setUpdatedTime(rs.getTimestamp(COLUMNS.UPDATED_TIME.getColumnAliasName()));
			return obj;
		}
	}

	public static StringBuffer getAllColumnAliases ()
	{
		StringBuffer strBuf = new StringBuffer ();
		int i = COLUMNS.values().length;
		for (COLUMNS c : COLUMNS.values())
		{
			strBuf.append (c.getColumnAliasAsName ());
			if (--i > 0)
				strBuf.append (", ");
		}
		return strBuf;
	}

	/* START Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

	/* END Do not remove/edit this line. CodeGenerator will preserve any code between start and end tags.*/

}