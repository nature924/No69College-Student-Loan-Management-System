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
 * 助学贷款
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@TableName("zhuxuedaikuan")
public class ZhuxuedaikuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhuxuedaikuanEntity() {
		
	}
	
	public ZhuxuedaikuanEntity(T t) {
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
	 * 学校名称
	 */
					
	private String xuexiaomingcheng;
	
	/**
	 * 贷款编号
	 */
					
	private String daikuanbianhao;
	
	/**
	 * 贷款名称
	 */
					
	private String daikuanmingcheng;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 银行名称
	 */
					
	private String yinxingmingcheng;
	
	/**
	 * 银行电话
	 */
					
	private String yinxingdianhua;
	
	/**
	 * 贷款金额
	 */
					
	private String daikuanjine;
	
	/**
	 * 还款方式
	 */
					
	private String haikuanfangshi;
	
	/**
	 * 贷款时长
	 */
					
	private String daikuanshizhang;
	
	/**
	 * 年利率
	 */
					
	private String nianlilv;
	
	/**
	 * 适用条件
	 */
					
	private String shiyongtiaojian;
	
	/**
	 * 还款流程
	 */
					
	private String haikuanliucheng;
	
	
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
	 * 设置：学校名称
	 */
	public void setXuexiaomingcheng(String xuexiaomingcheng) {
		this.xuexiaomingcheng = xuexiaomingcheng;
	}
	/**
	 * 获取：学校名称
	 */
	public String getXuexiaomingcheng() {
		return xuexiaomingcheng;
	}
	/**
	 * 设置：贷款编号
	 */
	public void setDaikuanbianhao(String daikuanbianhao) {
		this.daikuanbianhao = daikuanbianhao;
	}
	/**
	 * 获取：贷款编号
	 */
	public String getDaikuanbianhao() {
		return daikuanbianhao;
	}
	/**
	 * 设置：贷款名称
	 */
	public void setDaikuanmingcheng(String daikuanmingcheng) {
		this.daikuanmingcheng = daikuanmingcheng;
	}
	/**
	 * 获取：贷款名称
	 */
	public String getDaikuanmingcheng() {
		return daikuanmingcheng;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
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
	 * 设置：贷款金额
	 */
	public void setDaikuanjine(String daikuanjine) {
		this.daikuanjine = daikuanjine;
	}
	/**
	 * 获取：贷款金额
	 */
	public String getDaikuanjine() {
		return daikuanjine;
	}
	/**
	 * 设置：还款方式
	 */
	public void setHaikuanfangshi(String haikuanfangshi) {
		this.haikuanfangshi = haikuanfangshi;
	}
	/**
	 * 获取：还款方式
	 */
	public String getHaikuanfangshi() {
		return haikuanfangshi;
	}
	/**
	 * 设置：贷款时长
	 */
	public void setDaikuanshizhang(String daikuanshizhang) {
		this.daikuanshizhang = daikuanshizhang;
	}
	/**
	 * 获取：贷款时长
	 */
	public String getDaikuanshizhang() {
		return daikuanshizhang;
	}
	/**
	 * 设置：年利率
	 */
	public void setNianlilv(String nianlilv) {
		this.nianlilv = nianlilv;
	}
	/**
	 * 获取：年利率
	 */
	public String getNianlilv() {
		return nianlilv;
	}
	/**
	 * 设置：适用条件
	 */
	public void setShiyongtiaojian(String shiyongtiaojian) {
		this.shiyongtiaojian = shiyongtiaojian;
	}
	/**
	 * 获取：适用条件
	 */
	public String getShiyongtiaojian() {
		return shiyongtiaojian;
	}
	/**
	 * 设置：还款流程
	 */
	public void setHaikuanliucheng(String haikuanliucheng) {
		this.haikuanliucheng = haikuanliucheng;
	}
	/**
	 * 获取：还款流程
	 */
	public String getHaikuanliucheng() {
		return haikuanliucheng;
	}

}
