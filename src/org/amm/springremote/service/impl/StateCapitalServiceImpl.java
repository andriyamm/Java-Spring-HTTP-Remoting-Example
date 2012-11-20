package org.amm.springremote.service.impl;

import java.util.Map;

import org.amm.springremote.service.StateCapitalService;

/**
 * Implementation of functionality to be run after being called by client via
 * HTTP.
 */
public class StateCapitalServiceImpl implements StateCapitalService {


	private static final long serialVersionUID = 348896069995661965L;
	
	Map<String, String> statesAndCapitals = null;

	public StateCapitalServiceImpl() {
	}

	/**
	 * Set my states to state capitals mapping.
	 * 
	 * @param statesAndCapitals
	 *            States to state capitals mapping.
	 */
	public void setStatesAndCapitals(final Map<String, String> statesAndCapitals) {
		this.statesAndCapitals = statesAndCapitals;
	}

	/**
	 * Provide capital of state whose name is provided.
	 * 
	 * @param stateName
	 *            Name of state whose capital is desired.
	 * @return Capital of the specified state; null if not found.
	 */
	public String getCapital(final String stateName) {
		return this.statesAndCapitals.get(stateName);
	}
}