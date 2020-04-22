package com.fanfeifan.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fanfeifan.beans.Camp;
import com.fanfeifan.beans.Heros;
import com.fanfeifan.mapper.HerosMapper;

@Service
public class HerosServiceImpl implements HerosService {

	@Resource
	private HerosMapper hMapper;

	@Override
	public List<Heros> queryAll(Map<String, Object> map) {

		return hMapper.queryAll(map);
	}

	@Override
	public List<Camp> queryCamp() {

		return hMapper.queryCamp();
	}

	@Override
	public void addHeros(Heros heros) {

	}

	@Override
	public Heros queryById(Integer id) {

		return hMapper.queryById(id);
	}

	@Override
	public void updateHeros(Integer id) {

	}

}
