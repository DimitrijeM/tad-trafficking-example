package rs.thinkaboutdata.traficking.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import rs.thinkaboutdata.traficking.domain.TraffickerEntity;
import rs.thinkaboutdata.traficking.service.TraffickerService;


@RestController
public class TraffickerApi {

	
	@Autowired
	TraffickerService traffickerService;
	
	
	@RequestMapping(value = "/trafficker/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public TraffickerEntity getTrafficker(@PathVariable Long id) {
		return traffickerService.getTrafficker(id);
	}
	
	@RequestMapping(value = "/trafficker", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<TraffickerEntity> getAllTraffickers() {
		return traffickerService.getAllTraffickers();
	}
	
	@RequestMapping(value = "/trafficker", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public void addTrafficker(@RequestBody TraffickerEntity traffickerEntity) {
		traffickerService.addTrafficker(traffickerEntity);
	}
	
	@RequestMapping(value = "/trafficker/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
	public void updateTrafficker(@PathVariable Long id, @RequestBody TraffickerEntity traffickerEntity) {
		traffickerEntity.setId(id);
		traffickerService.addTrafficker(traffickerEntity);
	}
	
	
	@RequestMapping(value = "/trafficker/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
	public void deleteTrafficker(@PathVariable Long id) {
		traffickerService.deleteTrafficker(id);
	}
	
	
}
