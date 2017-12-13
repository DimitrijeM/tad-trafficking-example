package rs.thinkaboutdata.traficking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.thinkaboutdata.traficking.dao.TraffickerRepository;
import rs.thinkaboutdata.traficking.domain.TraffickerEntity;
import rs.thinkaboutdata.traficking.service.TraffickerService;

@Service
public class TraffickerServiceImpl implements TraffickerService {
	
	@Autowired
	TraffickerRepository traffickerRepository;
	
	public List<TraffickerEntity> getAllTraffickers(){
		ArrayList<TraffickerEntity> allTraffickers = new ArrayList<>();
		
		Iterable<TraffickerEntity> traffickers = traffickerRepository.findAll();
		for (TraffickerEntity traffickerEntity : traffickers) {
			allTraffickers.add(traffickerEntity);
		}
		
		return allTraffickers;
	}
	
	
	public void addTrafficker(TraffickerEntity traffickerEntity) {
		traffickerRepository.save(traffickerEntity);
	}

	@Override
	public TraffickerEntity getTrafficker(Long id) {
		return traffickerRepository.findOne(id);
	}
	
	
	@Override
	public void deleteTrafficker(Long id) {
		traffickerRepository.delete(id);
	}

}
