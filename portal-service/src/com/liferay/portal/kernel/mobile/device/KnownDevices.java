/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.kernel.mobile.device;

import java.util.Map;
import java.util.Set;

/**
 * @author Milen Dyankov
 * @author Michael C. Han
 */
public interface KnownDevices {

	public Map<Capability, Set<String>> getDeviceIds();

	public Set<VersionableName> getBrands();

	public Set<VersionableName> getOperatingSystems();

	public Set<VersionableName> getBrowsers();

	public Set<String> getPointingMethods();

	public void reload() throws Exception;

}