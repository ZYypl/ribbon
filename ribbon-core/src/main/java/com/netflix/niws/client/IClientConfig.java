package com.netflix.niws.client;

import java.util.Map;

import com.netflix.niws.client.NiwsClientConfig.NiwsClientConfigKey;

public interface IClientConfig {

	public abstract String getClientName();

	public abstract void loadProperties(String restClientName);

	/**
	 *  Get the underlying properties cache. Directly adding or changing properties
	 *  in the returned properties may cause inconsistencies with dynamic properties.
	 *  Instead, use {@link #setProperty(NiwsClientConfigKey, Object)} to set property.
	 */
	public abstract Map<String, Object> getProperties();

	public abstract void setProperty(IClientConfigKey key, Object value);

	public abstract Object getProperty(IClientConfigKey key);

	public abstract Object getProperty(IClientConfigKey key, Object defaultVal);

	public abstract boolean containsProperty(IClientConfigKey key);
	
	public String resolveDeploymentContextbasedVipAddresses();

}
