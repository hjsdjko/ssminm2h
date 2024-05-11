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


import com.dao.KaoshiziliaoDao;
import com.entity.KaoshiziliaoEntity;
import com.service.KaoshiziliaoService;
import com.entity.vo.KaoshiziliaoVO;
import com.entity.view.KaoshiziliaoView;

@Service("kaoshiziliaoService")
public class KaoshiziliaoServiceImpl extends ServiceImpl<KaoshiziliaoDao, KaoshiziliaoEntity> implements KaoshiziliaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshiziliaoEntity> page = this.selectPage(
                new Query<KaoshiziliaoEntity>(params).getPage(),
                new EntityWrapper<KaoshiziliaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshiziliaoEntity> wrapper) {
		  Page<KaoshiziliaoView> page =new Query<KaoshiziliaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshiziliaoVO> selectListVO(Wrapper<KaoshiziliaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshiziliaoVO selectVO(Wrapper<KaoshiziliaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshiziliaoView> selectListView(Wrapper<KaoshiziliaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshiziliaoView selectView(Wrapper<KaoshiziliaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
