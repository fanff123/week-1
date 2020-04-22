package com.fanfeifan.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpRequestHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.fanfeifan.beans.Camp;
import com.fanfeifan.beans.Heros;
import com.fanfeifan.service.HerosService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class HerosController {

	@Resource
	private HerosService hService;

	public String list(@RequestParam(defaultValue = "1") Integer pageNum, Model model, Integer cid, Integer status,
			Double startPrice, Double endPrice) {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("cid", cid);
		map.put("status", status);
		map.put("startPrice", startPrice);
		map.put("endPrice", endPrice);

		PageHelper.startPage(pageNum, 3);
		List<Heros> list = hService.queryAll(map);
		PageInfo<Heros> info = new PageInfo<>(list);
		model.addAttribute("info", info);

		List<Camp> camplist = hService.queryCamp();
		model.addAttribute("camplist", camplist);

		model.addAttribute("map", map);
		return "list";
	}

	@RequestMapping("queryCamp")
	@ResponseBody
	public List<Camp> queryCamp() {
		List<Camp> list = hService.queryCamp();
		return list;
	}

	@RequestMapping("addHeros")
	@ResponseBody
	public String addHeros(Heros heros,MultipartFile file){
		try {
			hService.addHeros(heros);
			return "redirct:queryAll";
		} catch (Exception e) {
			return "add";
		}
	}
	
	@RequestMapping("queryById")
	public String queryById(Integer id, Model model){
		Heros heros = hService.queryById(id);
		model.addAttribute("heros", heros);
		return "show";
		
	}
	
	@RequestMapping("updateHeros")
	@ResponseBody
	public boolean updateHeros(Integer id){
		try {
			hService.updateHeros(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
