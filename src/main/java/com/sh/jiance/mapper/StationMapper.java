package com.sh.jiance.mapper;

import java.util.List;

import com.sh.jiance.model.Station;

public interface StationMapper {
	public List<Station> findByWhere(Station station);
}
