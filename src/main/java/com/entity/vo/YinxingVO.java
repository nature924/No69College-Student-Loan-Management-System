package com.entity.vo;

import com.entity.YinxingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 银行
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public class YinxingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
