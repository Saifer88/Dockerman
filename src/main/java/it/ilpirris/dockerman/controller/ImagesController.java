package it.ilpirris.dockerman.controller;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.ilpirris.dockerman.controller.spec.AbstractController;
import it.ilpirris.dockerman.service.ImagesService;


@RestController
@RequestMapping("/images")
public class ImagesController extends AbstractController{
	

	@Autowired
	ImagesService imagesService;
	
	@RequestMapping
	public JSONObject getAll()
	{
		return imagesService.process(null, null);
	}
	
	

}
