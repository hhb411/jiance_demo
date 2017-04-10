package com.sh.jiance.service;

import java.util.List;

import com.sh.jiance.model.Station;

public interface StationService {
	public List<Station> findByWhere(Station station);
}
