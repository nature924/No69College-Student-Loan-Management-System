package com.entity.view;

import com.entity.ShenqingdaikuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 申请贷款
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@TableName("shenqingdaikuan")
public class ShenqingdaikuanView  extends ShenqingdaikuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShenqingdaikuanView(){
	}
 
 	public ShenqingdaikuanView(ShenqingdaikuanEntity shenqingdaikuanEntity){
 	try {
			BeanUtils.copyProperties(this, shenqingdaikuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
