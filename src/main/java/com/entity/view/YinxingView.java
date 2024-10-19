package com.entity.view;

import com.entity.YinxingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 银行
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@TableName("yinxing")
public class YinxingView  extends YinxingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YinxingView(){
	}
 
 	public YinxingView(YinxingEntity yinxingEntity){
 	try {
			BeanUtils.copyProperties(this, yinxingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
