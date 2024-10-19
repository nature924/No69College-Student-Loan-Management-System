package com.entity.model;

import com.entity.XuexiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 学校
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public class XuexiaoModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 密码
	 */
	
	private String mima;
		
	/**
	 * 学校地址
	 */
	
	private String xuexiaodizhi;
		
	/**
	 * 学校电话
	 */
	
	private String xuexiaodianhua;
		
	/**
	 * 学校简介
	 */
	
	private String xuexiaojianjie;
				
	
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
	 * 设置：学校地址
	 */
	 
	public void setXuexiaodizhi(String xuexiaodizhi) {
		this.xuexiaodizhi = xuexiaodizhi;
	}
	
	/**
	 * 获取：学校地址
	 */
	public String getXuexiaodizhi() {
		return xuexiaodizhi;
	}
				
	
	/**
	 * 设置：学校电话
	 */
	 
	public void setXuexiaodianhua(String xuexiaodianhua) {
		this.xuexiaodianhua = xuexiaodianhua;
	}
	
	/**
	 * 获取：学校电话
	 */
	public String getXuexiaodianhua() {
		return xuexiaodianhua;
	}
				
	
	/**
	 * 设置：学校简介
	 */
	 
	public void setXuexiaojianjie(String xuexiaojianjie) {
		this.xuexiaojianjie = xuexiaojianjie;
	}
	
	/**
	 * 获取：学校简介
	 */
	public String getXuexiaojianjie() {
		return xuexiaojianjie;
	}
			
}
