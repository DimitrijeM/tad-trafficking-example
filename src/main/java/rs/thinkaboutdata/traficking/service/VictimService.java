package rs.thinkaboutdata.traficking.service;

import java.util.List;

import org.springframework.stereotype.Service;
import rs.thinkaboutdata.traficking.domain.VictimEntity;

@Service
public interface VictimService {	
	
	public List<VictimEntity> getAllVictims(Long traffickerId);
	
	public void addVictim(Long traffickerId, VictimEntity victimEntity);
	
	public VictimEntity getVictim(Long traffickerId, Long id);
	
	public void updateVictim(Long traffickerId, VictimEntity victimEntity);
	
	public void deleteVictim(Long id);
	
	
	public List<VictimEntity> getVictimByName(String name);
	public List<VictimEntity> getVictimByGender(String gender);
	public List<VictimEntity> getAllVictims();

//	public List<VictimEntity> getVictimByTrafficker(String traffickerId);


}
