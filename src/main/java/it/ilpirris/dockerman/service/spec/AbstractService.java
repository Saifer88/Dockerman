package it.ilpirris.dockerman.service.spec;

import org.json.JSONObject;

import it.ilpirris.dockerman.parameters.spec.Parameters;

public abstract class AbstractService {

	
	
	public JSONObject process(Parameters parameters, String[] targets)
	{
		return execute(parameters, targets);
	}
	
	protected abstract JSONObject execute(Parameters parameters, String[] targets);
}
