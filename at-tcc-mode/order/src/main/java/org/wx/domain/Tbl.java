package org.wx.domain;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import lombok.Data;

@Data
@TableName("order_tbl")
public class Tbl {
/**
	 * 主键
	 */
	@TableId(value = "id", type = IdType.AUTO)
	private Long id;

	/**
	 * 
	 */
	@TableField("user_id")
	private Long userId;

	/**
	 * 
	 */
	@TableField("commodity_code")
	private String commodityCode;

	/**
	 * 
	 */
	@TableField("count")
	private Integer count;

	/**
	 * 
	 */
	@TableField("money")
	private Integer money;


}