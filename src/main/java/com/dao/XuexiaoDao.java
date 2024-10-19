package com.dao;

import com.entity.XuexiaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexiaoVO;
import com.entity.view.XuexiaoView;


/**
 * 学校
 * 
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
public interface XuexiaoDao extends BaseMapper<XuexiaoEntity> {
	
	List<XuexiaoVO> selectListVO(@Param("ew") Wrapper<XuexiaoEntity> wrapper);
	
	XuexiaoVO selectVO(@Param("ew") Wrapper<XuexiaoEntity> wrapper);
	
	List<XuexiaoView> selectListView(@Param("ew") Wrapper<XuexiaoEntity> wrapper);

	List<XuexiaoView> selectListView(Pagination page,@Param("ew") Wrapper<XuexiaoEntity> wrapper);
	
	XuexiaoView selectView(@Param("ew") Wrapper<XuexiaoEntity> wrapper);
	

}
