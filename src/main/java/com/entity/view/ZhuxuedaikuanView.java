package com.entity.view;

import com.entity.ZhuxuedaikuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 助学贷款
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@TableName("zhuxuedaikuan")
public class ZhuxuedaikuanView  extends ZhuxuedaikuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuxuedaikuanView(){
	}
 
 	public ZhuxuedaikuanView(ZhuxuedaikuanEntity zhuxuedaikuanEntity){
 	try {
			BeanUtils.copyProperties(this, zhuxuedaikuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
