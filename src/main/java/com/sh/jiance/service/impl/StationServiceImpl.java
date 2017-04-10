package com.sh.jiance.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sh.jiance.mapper.StationMapper;
import com.sh.jiance.model.Station;
import com.sh.jiance.service.StationService;

@Service("stationService")
public class StationServiceImpl implements StationService {
    @Autowired
	private StationMapper stationMapper;
	
	@Override
	public List<Station> findByWhere(Station station) {
		List<Station> stationList = stationMapper.findByWhere(station);
		return stationList;
	}

}
