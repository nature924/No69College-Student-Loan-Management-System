package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.FangdaixinxiEntity;
import com.entity.view.FangdaixinxiView;

import com.service.FangdaixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 放贷信息
 * 后端接口
 * @author 
 * @email 
 * @date 2022-07-25 20:12:45
 */
@RestController
@RequestMapping("/fangdaixinxi")
public class FangdaixinxiController {
    @Autowired
    private FangdaixinxiService fangdaixinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,FangdaixinxiEntity fangdaixinxi,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yinxing")) {
			fangdaixinxi.setYinxingmingcheng((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			fangdaixinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<FangdaixinxiEntity> ew = new EntityWrapper<FangdaixinxiEntity>();

		PageUtils page = fangdaixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangdaixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,FangdaixinxiEntity fangdaixinxi, 
		HttpServletRequest request){
        EntityWrapper<FangdaixinxiEntity> ew = new EntityWrapper<FangdaixinxiEntity>();

		PageUtils page = fangdaixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, fangdaixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( FangdaixinxiEntity fangdaixinxi){
       	EntityWrapper<FangdaixinxiEntity> ew = new EntityWrapper<FangdaixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( fangdaixinxi, "fangdaixinxi")); 
        return R.ok().put("data", fangdaixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(FangdaixinxiEntity fangdaixinxi){
        EntityWrapper< FangdaixinxiEntity> ew = new EntityWrapper< FangdaixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( fangdaixinxi, "fangdaixinxi")); 
		FangdaixinxiView fangdaixinxiView =  fangdaixinxiService.selectView(ew);
		return R.ok("查询放贷信息成功").put("data", fangdaixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        FangdaixinxiEntity fangdaixinxi = fangdaixinxiService.selectById(id);
        return R.ok().put("data", fangdaixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        FangdaixinxiEntity fangdaixinxi = fangdaixinxiService.selectById(id);
        return R.ok().put("data", fangdaixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody FangdaixinxiEntity fangdaixinxi, HttpServletRequest request){
    	fangdaixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangdaixinxi);
        fangdaixinxiService.insert(fangdaixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody FangdaixinxiEntity fangdaixinxi, HttpServletRequest request){
    	fangdaixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(fangdaixinxi);
        fangdaixinxiService.insert(fangdaixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody FangdaixinxiEntity fangdaixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(fangdaixinxi);
        fangdaixinxiService.updateById(fangdaixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        fangdaixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<FangdaixinxiEntity> wrapper = new EntityWrapper<FangdaixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yinxing")) {
			wrapper.eq("yinxingmingcheng", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = fangdaixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
