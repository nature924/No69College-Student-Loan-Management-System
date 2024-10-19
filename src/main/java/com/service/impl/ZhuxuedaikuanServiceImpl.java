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


import com.dao.ZhuxuedaikuanDao;
import com.entity.ZhuxuedaikuanEntity;
import com.service.ZhuxuedaikuanService;
import com.entity.vo.ZhuxuedaikuanVO;
import com.entity.view.ZhuxuedaikuanView;

@Service("zhuxuedaikuanService")
public class ZhuxuedaikuanServiceImpl extends ServiceImpl<ZhuxuedaikuanDao, ZhuxuedaikuanEntity> implements ZhuxuedaikuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuxuedaikuanEntity> page = this.selectPage(
                new Query<ZhuxuedaikuanEntity>(params).getPage(),
                new EntityWrapper<ZhuxuedaikuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuxuedaikuanEntity> wrapper) {
		  Page<ZhuxuedaikuanView> page =new Query<ZhuxuedaikuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuxuedaikuanVO> selectListVO(Wrapper<ZhuxuedaikuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuxuedaikuanVO selectVO(Wrapper<ZhuxuedaikuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuxuedaikuanView> selectListView(Wrapper<ZhuxuedaikuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuxuedaikuanView selectView(Wrapper<ZhuxuedaikuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
