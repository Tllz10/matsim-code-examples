/* *********************************************************************** *
 * project: org.matsim.*
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2017 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** */

package org.matsim.codeexamples.network;

import org.matsim.api.core.v01.network.Link;
import org.matsim.api.core.v01.network.Network;
import org.matsim.core.network.NetworkUtils;
import org.matsim.core.network.io.MatsimNetworkReader;
import org.matsim.core.network.io.NetworkWriter;

/**
 * @author  jbischoff
 * This provides an example script how to read a MATSim network and modify some values for each link.
 * In this case, we are reducing the capacity of each link by 50%.
 */

public class RunModifyNetworkExample {

	public static void main(String[] args) {
		
		// read in the network
		Network network = NetworkUtils.createNetwork();
		new MatsimNetworkReader(network).readFile("path-to-network.xml");
		
		// iterate through all links
		 for (Link link : network.getLinks().values()) {
            // 直接设置 freespeed = 10 m/s
            link.setFreespeed(10.0);  // 单位：米/秒（m/s）
        }
			//set new capacity
			l.setCapacity(newCapacity);
		}
		new NetworkWriter(network).write("path-to-modified-network.xml");
	}
}
