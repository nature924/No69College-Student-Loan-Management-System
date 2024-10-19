package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 银行
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@TableName("yinxing")
public class YinxingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YinxingEntity() {
		
	}
	
	public YinxingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 银行名称
	 */
					
	private String yinxingmingcheng;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 银行地址
	 */
					
	private String yinxingdizhi;
	
	/**
	 * 银行电话
	 */
					
	private String yinxingdianhua;
	
	/**
	 * 银行简介
	 */
					
	private String yinxingjianjie;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：银行名称
	 */
	public void setYinxingmingcheng(String yinxingmingcheng) {
		this.yinxingmingcheng = yinxingmingcheng;
	}
	/**
	 * 获取：银行名称
	 */
	public String getYinxingmingcheng() {
		return yinxingmingcheng;
	}
	/**
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：银行地址
	 */
	public void setYinxingdizhi(String yinxingdizhi) {
		this.yinxingdizhi = yinxingdizhi;
	}
	/**
	 * 获取：银行地址
	 */
	public String getYinxingdizhi() {
		return yinxingdizhi;
	}
	/**
	 * 设置：银行电话
	 */
	public void setYinxingdianhua(String yinxingdianhua) {
		this.yinxingdianhua = yinxingdianhua;
	}
	/**
	 * 获取：银行电话
	 */
	public String getYinxingdianhua() {
		return yinxingdianhua;
	}
	/**
	 * 设置：银行简介
	 */
	public void setYinxingjianjie(String yinxingjianjie) {
		this.yinxingjianjie = yinxingjianjie;
	}
	/**
	 * 获取：银行简介
	 */
	public String getYinxingjianjie() {
		return yinxingjianjie;
	}

}
