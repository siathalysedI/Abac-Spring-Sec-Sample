package com.rvdv.cross.abac.security.sampleattributeprotection.service.impl;

public class InMemorySequence {
	private Integer currentValue = new Integer(0);
	public Integer increment() {
		synchronized(this) {
			currentValue = currentValue + 1;
			return currentValue;
		}
	}
}
