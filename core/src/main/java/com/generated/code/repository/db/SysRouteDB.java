package com.generated.code.repository.db;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;
import com.edgar.core.jdbc.RowUnmapper;
import com.generated.code.domain.SysRoute;
import java.sql.Timestamp;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
public class SysRouteDB
{

	private static String TABLE_NAME = "SYS_ROUTE";

	private static String TABLE_ALIAS = "sr";

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
		ROUTE_ID("route_id"),
		NAME("name"),
		URL("url"),
		IS_ROOT("is_root"),
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

	public SysRouteDB ()
	{

	}

	public static final RowMapper<SysRoute> ROW_MAPPER = new SysRouteRowMapper ();
	public static final class  SysRouteRowMapper implements RowMapper<SysRoute>
	{
		public SysRoute mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			SysRoute obj = new SysRoute();
			obj.setRouteId(rs.getInt(COLUMNS.ROUTE_ID.getColumnName()));
			obj.setName(rs.getString(COLUMNS.NAME.getColumnName()));
			obj.setUrl(rs.getString(COLUMNS.URL.getColumnName()));
			obj.setIsRoot(rs.getBoolean(COLUMNS.IS_ROOT.getColumnName()));
			obj.setCreatedTime(rs.getTimestamp(COLUMNS.CREATED_TIME.getColumnName()));
			obj.setUpdatedTime(rs.getTimestamp(COLUMNS.UPDATED_TIME.getColumnName()));
			return obj;
		}
	}

	public static final RowUnmapper<SysRoute> ROW_UNMAPPER = new SysRouteRowUnmapper ();
	public static final class SysRouteRowUnmapper implements RowUnmapper<SysRoute>
	{
		public Map<String, Object> mapColumns(SysRoute sysroute)
		{
			Map<String, Object> mapping = new LinkedHashMap<String, Object>();
			mapping.put(COLUMNS.ROUTE_ID.getColumnName(), sysroute.getRouteId());
			mapping.put(COLUMNS.NAME.getColumnName(), sysroute.getName());
			mapping.put(COLUMNS.URL.getColumnName(), sysroute.getUrl());
			mapping.put(COLUMNS.IS_ROOT.getColumnName(), sysroute.getIsRoot());
			if (sysroute.getCreatedTime() != null)
				mapping.put(COLUMNS.CREATED_TIME.getColumnName(), new Timestamp (sysroute.getCreatedTime().getTime()));
			if (sysroute.getUpdatedTime() != null)
				mapping.put(COLUMNS.UPDATED_TIME.getColumnName(), new Timestamp (sysroute.getUpdatedTime().getTime()));
			return mapping;
		}
	}

	public static final RowMapper<SysRoute> ALIAS_ROW_MAPPER = new SysRouteAliasRowMapper ();
	public static final class  SysRouteAliasRowMapper implements RowMapper<SysRoute>
	{
		public SysRoute mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			SysRoute obj = new SysRoute();
			obj.setRouteId(rs.getInt(COLUMNS.ROUTE_ID.getColumnAliasName()));
			obj.setName(rs.getString(COLUMNS.NAME.getColumnAliasName()));
			obj.setUrl(rs.getString(COLUMNS.URL.getColumnAliasName()));
			obj.setIsRoot(rs.getBoolean(COLUMNS.IS_ROOT.getColumnAliasName()));
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