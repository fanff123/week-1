package com.fanfeifan.service;

import java.util.List;
import java.util.Map;

import com.fanfeifan.beans.Camp;
import com.fanfeifan.beans.Heros;

public interface HerosService {

	public List<Heros> queryAll(Map<String, Object> map);

	public List<Camp> queryCamp();

	public void addHeros(Heros heros);

	public Heros queryById(Integer id);

	public void updateHeros(Integer id);
}
