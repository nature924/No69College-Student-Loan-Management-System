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


import com.dao.ShenqingdaikuanDao;
import com.entity.ShenqingdaikuanEntity;
import com.service.ShenqingdaikuanService;
import com.entity.vo.ShenqingdaikuanVO;
import com.entity.view.ShenqingdaikuanView;

@Service("shenqingdaikuanService")
public class ShenqingdaikuanServiceImpl extends ServiceImpl<ShenqingdaikuanDao, ShenqingdaikuanEntity> implements ShenqingdaikuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShenqingdaikuanEntity> page = this.selectPage(
                new Query<ShenqingdaikuanEntity>(params).getPage(),
                new EntityWrapper<ShenqingdaikuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShenqingdaikuanEntity> wrapper) {
		  Page<ShenqingdaikuanView> page =new Query<ShenqingdaikuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShenqingdaikuanVO> selectListVO(Wrapper<ShenqingdaikuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShenqingdaikuanVO selectVO(Wrapper<ShenqingdaikuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShenqingdaikuanView> selectListView(Wrapper<ShenqingdaikuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShenqingdaikuanView selectView(Wrapper<ShenqingdaikuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
