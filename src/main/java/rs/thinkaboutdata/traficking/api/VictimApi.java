package rs.thinkaboutdata.traficking.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rs.thinkaboutdata.traficking.domain.ContactPersonEntity;
import rs.thinkaboutdata.traficking.domain.VictimEntity;
import rs.thinkaboutdata.traficking.service.VictimService;


@RestController
public class VictimApi {

	@Autowired
	VictimService victimService;
	
	@RequestMapping(value = "/trafficker/{traffickerId}/victim", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VictimEntity> getAllVictims(@PathVariable Long traffickerId) {
		return victimService.getAllVictims(traffickerId);
	}
	
	@RequestMapping(value = "/trafficker/{traffickerId}/victim/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public VictimEntity getVictim(@PathVariable Long traffickerId, @PathVariable Long id) {
		return victimService.getVictim(traffickerId, id);
	}
	
	@RequestMapping(value = "/trafficker/{traffickerId}/victim", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addVictim(@PathVariable Long traffickerId, @RequestBody VictimEntity victimEntity) {
		victimService.addVictim(traffickerId, victimEntity);
	}
	
	@RequestMapping(value = "/trafficker/{traffickerId}/victim/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateVictim(@PathVariable Long traffickerId, @PathVariable Long id, @RequestBody VictimEntity victimEntity) {
		victimService.updateVictim(traffickerId, victimEntity);
	}
	
	@RequestMapping(value = "/trafficker/{traffickerId}/victim/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteVictim(@PathVariable Long id) {
		victimService.deleteVictim(id);
	}
	
	
	
	
	
	@RequestMapping(value = "/victim", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VictimEntity> getAllVictims() {
		return victimService.getAllVictims();
	}
	
	@RequestMapping(value = "/victim-name/{name}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VictimEntity> getVictimBn(@PathVariable String name) {
		return victimService.getVictimByName(name);
	}
	
	@RequestMapping(value = "/victim-gender/{gender}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<VictimEntity> getVictimBg(@PathVariable String gender) {
		return victimService.getVictimByGender(gender);
	}
	
	
	
	@RequestMapping(value = "/trafficker/{traffickerId}/victim/{id}/contact", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ContactPersonEntity setVictimContact(@PathVariable Long traffickerId, @PathVariable Long id) {
		VictimEntity victimEntity = victimService.getVictim(traffickerId, id);
		return victimEntity.getContactPerson();
	}

}
