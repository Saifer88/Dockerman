package it.ilpirris.dockerman.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

	@RequestMapping
	public String test() throws IOException, InterruptedException {

		String command = "docker images";

		Process proc = Runtime.getRuntime().exec(command);

		BufferedReader reader = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		String line = "";
		Thread.sleep(500);
		while (reader.ready()) {
			line = line + reader.readLine() + "<hr>";
		}

		return line;
	}
	
	@RequestMapping("/images")
	public Object regetAll()
	{
		URL url = new URL("")
	}

}
