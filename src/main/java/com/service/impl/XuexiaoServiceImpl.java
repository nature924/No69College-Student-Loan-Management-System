package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.XuexiaoDao;
import com.entity.XuexiaoEntity;
import com.service.XuexiaoService;
import com.entity.vo.XuexiaoVO;
import com.entity.view.XuexiaoView;

@Service("xuexiaoService")
public class XuexiaoServiceImpl extends ServiceImpl<XuexiaoDao, XuexiaoEntity> implements XuexiaoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexiaoEntity> page = this.selectPage(
                new Query<XuexiaoEntity>(params).getPage(),
                new EntityWrapper<XuexiaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexiaoEntity> wrapper) {
		  Page<XuexiaoView> page =new Query<XuexiaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexiaoVO> selectListVO(Wrapper<XuexiaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexiaoVO selectVO(Wrapper<XuexiaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexiaoView> selectListView(Wrapper<XuexiaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexiaoView selectView(Wrapper<XuexiaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
