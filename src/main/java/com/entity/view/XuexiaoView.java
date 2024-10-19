package com.entity.view;

import com.entity.XuexiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 学校
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@TableName("xuexiao")
public class XuexiaoView  extends XuexiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XuexiaoView(){
	}
 
 	public XuexiaoView(XuexiaoEntity xuexiaoEntity){
 	try {
			BeanUtils.copyProperties(this, xuexiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
