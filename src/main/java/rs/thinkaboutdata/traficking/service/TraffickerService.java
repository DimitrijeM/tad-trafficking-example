package rs.thinkaboutdata.traficking.service;

import java.util.List;

import org.springframework.stereotype.Service;

import rs.thinkaboutdata.traficking.domain.TraffickerEntity;

@Service
public interface TraffickerService {
	
	public List<TraffickerEntity> getAllTraffickers();
	
	public void addTrafficker(TraffickerEntity traffickerEntity);
	
	public TraffickerEntity getTrafficker(Long id);
	
	public void deleteTrafficker(Long id);

}
