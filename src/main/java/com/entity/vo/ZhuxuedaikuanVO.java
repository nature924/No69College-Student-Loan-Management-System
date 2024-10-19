package com.entity.vo;

import com.entity.ZhuxuedaikuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 助学贷款
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public class ZhuxuedaikuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
