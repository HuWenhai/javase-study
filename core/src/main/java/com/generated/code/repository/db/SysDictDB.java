package com.generated.code.repository.db;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;
import com.edgar.core.jdbc.RowUnmapper;
import com.generated.code.domain.SysDict;
import java.sql.Timestamp;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
public class SysDictDB
{

	private static String TABLE_NAME = "SYS_DICT";

	private static String TABLE_ALIAS = "sd";

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
		DICT_CODE("dict_code"),
		DICT_NAME("dict_name"),
		PARENT_CODE("parent_code"),
		SORTED("sorted"),
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

	public SysDictDB ()
	{

	}

	public static final RowMapper<SysDict> ROW_MAPPER = new SysDictRowMapper ();
	public static final class  SysDictRowMapper implements RowMapper<SysDict>
	{
		public SysDict mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			SysDict obj = new SysDict();
			obj.setDictCode(rs.getString(COLUMNS.DICT_CODE.getColumnName()));
			obj.setDictName(rs.getString(COLUMNS.DICT_NAME.getColumnName()));
			obj.setParentCode(rs.getString(COLUMNS.PARENT_CODE.getColumnName()));
			obj.setSorted(rs.getInt(COLUMNS.SORTED.getColumnName()));
			obj.setCreatedTime(rs.getTimestamp(COLUMNS.CREATED_TIME.getColumnName()));
			obj.setUpdatedTime(rs.getTimestamp(COLUMNS.UPDATED_TIME.getColumnName()));
			return obj;
		}
	}

	public static final RowUnmapper<SysDict> ROW_UNMAPPER = new SysDictRowUnmapper ();
	public static final class SysDictRowUnmapper implements RowUnmapper<SysDict>
	{
		public Map<String, Object> mapColumns(SysDict sysdict)
		{
			Map<String, Object> mapping = new LinkedHashMap<String, Object>();
			mapping.put(COLUMNS.DICT_CODE.getColumnName(), sysdict.getDictCode());
			mapping.put(COLUMNS.DICT_NAME.getColumnName(), sysdict.getDictName());
			mapping.put(COLUMNS.PARENT_CODE.getColumnName(), sysdict.getParentCode());
			mapping.put(COLUMNS.SORTED.getColumnName(), sysdict.getSorted());
			if (sysdict.getCreatedTime() != null)
				mapping.put(COLUMNS.CREATED_TIME.getColumnName(), new Timestamp (sysdict.getCreatedTime().getTime()));
			if (sysdict.getUpdatedTime() != null)
				mapping.put(COLUMNS.UPDATED_TIME.getColumnName(), new Timestamp (sysdict.getUpdatedTime().getTime()));
			return mapping;
		}
	}

	public static final RowMapper<SysDict> ALIAS_ROW_MAPPER = new SysDictAliasRowMapper ();
	public static final class  SysDictAliasRowMapper implements RowMapper<SysDict>
	{
		public SysDict mapRow(ResultSet rs, int rowNum) throws SQLException 
		{
			SysDict obj = new SysDict();
			obj.setDictCode(rs.getString(COLUMNS.DICT_CODE.getColumnAliasName()));
			obj.setDictName(rs.getString(COLUMNS.DICT_NAME.getColumnAliasName()));
			obj.setParentCode(rs.getString(COLUMNS.PARENT_CODE.getColumnAliasName()));
			obj.setSorted(rs.getInt(COLUMNS.SORTED.getColumnAliasName()));
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