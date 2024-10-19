package com.entity.model;

import com.entity.ShenqingdaikuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 申请贷款
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public class ShenqingdaikuanModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 申请编号
	 */
	
	private String shenqingbianhao;
		
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
	 * 申请资料
	 */
	
	private String shenqingziliao;
		
	/**
	 * 申请时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shenqingshijian;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：申请编号
	 */
	 
	public void setShenqingbianhao(String shenqingbianhao) {
		this.shenqingbianhao = shenqingbianhao;
	}
	
	/**
	 * 获取：申请编号
	 */
	public String getShenqingbianhao() {
		return shenqingbianhao;
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
	 * 设置：申请资料
	 */
	 
	public void setShenqingziliao(String shenqingziliao) {
		this.shenqingziliao = shenqingziliao;
	}
	
	/**
	 * 获取：申请资料
	 */
	public String getShenqingziliao() {
		return shenqingziliao;
	}
				
	
	/**
	 * 设置：申请时间
	 */
	 
	public void setShenqingshijian(Date shenqingshijian) {
		this.shenqingshijian = shenqingshijian;
	}
	
	/**
	 * 获取：申请时间
	 */
	public Date getShenqingshijian() {
		return shenqingshijian;
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
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
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
			
}
