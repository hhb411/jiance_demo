package com.sh.jiance.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sh.jiance.model.Station;
import com.sh.jiance.service.StationService;

@Controller
@RequestMapping("/station")
public class StationController {
	@Autowired
	private StationService stationService;
	
	@RequestMapping("")
	public String stationIndex(Model model) {
//		List<Station> stationList = stationService.findByWhere(null);
		List<Station> stationList = new ArrayList<Station>();
		Station station = new Station();
		station.setStationNo("54734");
		stationList.add(station);

		model.addAttribute(stationList);
		return "station/stationIndex";
	}
	
	@RequestMapping("/findByWhere")
	@ResponseBody
	public List<Station> findByWhere(Station station) {
		return stationService.findByWhere(station);
	}
}
