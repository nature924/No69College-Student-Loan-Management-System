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
 * 还贷信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@TableName("haidaixinxi")
public class HaidaixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HaidaixinxiEntity() {
		
	}
	
	public HaidaixinxiEntity(T t) {
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
	 * 还贷编号
	 */
					
	private String haidaibianhao;
	
	/**
	 * 贷款名称
	 */
					
	private String daikuanmingcheng;
	
	/**
	 * 银行名称
	 */
					
	private String yinxingmingcheng;
	
	/**
	 * 贷款金额
	 */
					
	private Float daikuanjine;
	
	/**
	 * 每月利息
	 */
					
	private Float meiyuelixi;
	
	/**
	 * 贷款月数
	 */
					
	private Integer daikuanyueshu;
	
	/**
	 * 还贷金额
	 */
					
	private Float haidaijine;
	
	/**
	 * 还贷时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date haidaishijian;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 还贷进度
	 */
					
	private String haidaijindu;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：还贷编号
	 */
	public void setHaidaibianhao(String haidaibianhao) {
		this.haidaibianhao = haidaibianhao;
	}
	/**
	 * 获取：还贷编号
	 */
	public String getHaidaibianhao() {
		return haidaibianhao;
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
	 * 设置：贷款金额
	 */
	public void setDaikuanjine(Float daikuanjine) {
		this.daikuanjine = daikuanjine;
	}
	/**
	 * 获取：贷款金额
	 */
	public Float getDaikuanjine() {
		return daikuanjine;
	}
	/**
	 * 设置：每月利息
	 */
	public void setMeiyuelixi(Float meiyuelixi) {
		this.meiyuelixi = meiyuelixi;
	}
	/**
	 * 获取：每月利息
	 */
	public Float getMeiyuelixi() {
		return meiyuelixi;
	}
	/**
	 * 设置：贷款月数
	 */
	public void setDaikuanyueshu(Integer daikuanyueshu) {
		this.daikuanyueshu = daikuanyueshu;
	}
	/**
	 * 获取：贷款月数
	 */
	public Integer getDaikuanyueshu() {
		return daikuanyueshu;
	}
	/**
	 * 设置：还贷金额
	 */
	public void setHaidaijine(Float haidaijine) {
		this.haidaijine = haidaijine;
	}
	/**
	 * 获取：还贷金额
	 */
	public Float getHaidaijine() {
		return haidaijine;
	}
	/**
	 * 设置：还贷时间
	 */
	public void setHaidaishijian(Date haidaishijian) {
		this.haidaishijian = haidaishijian;
	}
	/**
	 * 获取：还贷时间
	 */
	public Date getHaidaishijian() {
		return haidaishijian;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：还贷进度
	 */
	public void setHaidaijindu(String haidaijindu) {
		this.haidaijindu = haidaijindu;
	}
	/**
	 * 获取：还贷进度
	 */
	public String getHaidaijindu() {
		return haidaijindu;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
