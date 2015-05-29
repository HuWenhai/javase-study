package com.generated.code.repository.db;

import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.util.LinkedHashMap;
import java.util.Map;
import com.edgar.core.jdbc.RowUnmapper;
import com.generated.code.domain.I18nMessage;
import java.sql.Timestamp;

/**
 * This class is generated by Spring Data Jdbc code generator.
 *
 * @author Spring Data Jdbc Code Generator
 */
public class I18nMessageDB
{

	private static String TABLE_NAME = "I18N_MESSAGE";

	private static String TABLE_ALIAS = "im";

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
		I18N_ID("i18n_id"),
		I18N_KEY("i18n_key"),
		I18N_VALUE_EN("i18n_value_en"),
		I18N_VALUE_ZH_CN("i18n_value_zh_cn"),
		I18N_VALUE_ZH_TW("i18n_value_zh_tw"),
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

	public I18nMessageDB ()
	{

	}

	public static final RowMapper<I18nMessage> ROW_MAPPER = new I18nMessageRowMapper ();
	public static final class  I18nMessageRowMapper implements RowMapper<I18nMessage>
	{
		public I18nMessage mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			I18nMessage obj = new I18nMessage();
			obj.setI18nId(rs.getInt(COLUMNS.I18N_ID.getColumnName()));
			obj.setI18nKey(rs.getString(COLUMNS.I18N_KEY.getColumnName()));
			obj.setI18nValueEn(rs.getString(COLUMNS.I18N_VALUE_EN.getColumnName()));
			obj.setI18nValueZhCn(rs.getString(COLUMNS.I18N_VALUE_ZH_CN.getColumnName()));
			obj.setI18nValueZhTw(rs.getString(COLUMNS.I18N_VALUE_ZH_TW.getColumnName()));
			obj.setIsRoot(rs.getBoolean(COLUMNS.IS_ROOT.getColumnName()));
			obj.setCreatedTime(rs.getTimestamp(COLUMNS.CREATED_TIME.getColumnName()));
			obj.setUpdatedTime(rs.getTimestamp(COLUMNS.UPDATED_TIME.getColumnName()));
			return obj;
		}
	}

	public static final RowUnmapper<I18nMessage> ROW_UNMAPPER = new I18nMessageRowUnmapper ();
	public static final class I18nMessageRowUnmapper implements RowUnmapper<I18nMessage>
	{
		public Map<String, Object> mapColumns(I18nMessage i18nmessage)
		{
			Map<String, Object> mapping = new LinkedHashMap<String, Object>();
			mapping.put(COLUMNS.I18N_ID.getColumnName(), i18nmessage.getI18nId());
			mapping.put(COLUMNS.I18N_KEY.getColumnName(), i18nmessage.getI18nKey());
			mapping.put(COLUMNS.I18N_VALUE_EN.getColumnName(), i18nmessage.getI18nValueEn());
			mapping.put(COLUMNS.I18N_VALUE_ZH_CN.getColumnName(), i18nmessage.getI18nValueZhCn());
			mapping.put(COLUMNS.I18N_VALUE_ZH_TW.getColumnName(), i18nmessage.getI18nValueZhTw());
			mapping.put(COLUMNS.IS_ROOT.getColumnName(), i18nmessage.getIsRoot());
			if (i18nmessage.getCreatedTime() != null)
				mapping.put(COLUMNS.CREATED_TIME.getColumnName(), new Timestamp (i18nmessage.getCreatedTime().getTime()));
			if (i18nmessage.getUpdatedTime() != null)
				mapping.put(COLUMNS.UPDATED_TIME.getColumnName(), new Timestamp (i18nmessage.getUpdatedTime().getTime()));
			return mapping;
		}
	}

	public static final RowMapper<I18nMessage> ALIAS_ROW_MAPPER = new I18nMessageAliasRowMapper ();
	public static final class  I18nMessageAliasRowMapper implements RowMapper<I18nMessage>
	{
		public I18nMessage mapRow(ResultSet rs, int rowNum) throws SQLException
		{
			I18nMessage obj = new I18nMessage();
			obj.setI18nId(rs.getInt(COLUMNS.I18N_ID.getColumnAliasName()));
			obj.setI18nKey(rs.getString(COLUMNS.I18N_KEY.getColumnAliasName()));
			obj.setI18nValueEn(rs.getString(COLUMNS.I18N_VALUE_EN.getColumnAliasName()));
			obj.setI18nValueZhCn(rs.getString(COLUMNS.I18N_VALUE_ZH_CN.getColumnAliasName()));
			obj.setI18nValueZhTw(rs.getString(COLUMNS.I18N_VALUE_ZH_TW.getColumnAliasName()));
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