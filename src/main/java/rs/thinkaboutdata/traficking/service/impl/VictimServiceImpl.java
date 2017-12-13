package rs.thinkaboutdata.traficking.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rs.thinkaboutdata.traficking.dao.VictimRepository;
import rs.thinkaboutdata.traficking.domain.TraffickerEntity;
import rs.thinkaboutdata.traficking.domain.VictimEntity;
import rs.thinkaboutdata.traficking.service.VictimService;

@Service
public class VictimServiceImpl implements VictimService {
	
	@Autowired
	VictimRepository victimRepository;
	
	public List<VictimEntity> getAllVictims(Long traffickerId){
		ArrayList<VictimEntity> allVictims = new ArrayList<>();
		
		Iterable<VictimEntity> victims = victimRepository.findByTraffickerId(traffickerId);
		for (VictimEntity victimEntity : victims) {
			allVictims.add(victimEntity);
		}
		
		return allVictims;
	}
	
	
	public void addVictim(Long traffickerId, VictimEntity victimEntity) {
		victimEntity.setTrafficker(new TraffickerEntity(traffickerId));
		victimRepository.save(victimEntity);
	}

	@Override
	public VictimEntity getVictim(Long traffickerId, Long id) {
		return victimRepository.findOne(id);
	}
	
	@Override
	public void updateVictim(Long traffickerId, VictimEntity victimEntity) {
		victimEntity.setTrafficker(new TraffickerEntity(traffickerId));
		victimRepository.save(victimEntity);
	}
	
	
	@Override
	public void deleteVictim(Long id) {
		victimRepository.delete(id);
	}
	
	
	@Override
	public List<VictimEntity> getVictimByName(String name) {
		return victimRepository.findByFirstName(name);
	}
	
	@Override
	public List<VictimEntity> getVictimByGender(String gender) {
		return victimRepository.findByGender(gender);
	}
	
	@Override
	public List<VictimEntity> getAllVictims(){
		ArrayList<VictimEntity> allVictims = new ArrayList<>();
		
		Iterable<VictimEntity> victims = victimRepository.findAll();
		for (VictimEntity victimEntity : victims) {
			allVictims.add(victimEntity);
		}
		
		return allVictims;
	}

}
	
