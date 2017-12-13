package rs.thinkaboutdata.traficking.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import rs.thinkaboutdata.traficking.domain.VictimEntity;

public interface VictimRepository extends CrudRepository<VictimEntity, Long>{
	
	
//	getAllVictim()
//	getVictim(Long id)
//	updateVictim(Victim t)
//	deleteVictim(Long id)
	
	public List<VictimEntity> findByFirstName(String name);
	
	public List<VictimEntity> findByGender(String gender);
	
//	public List<VictimEntity> findVictimsByTrafficker(Long traffickerId);
	
	public List<VictimEntity> findByTraffickerId(Long traffickerId); 
	
}
