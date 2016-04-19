/*******************************************************************************
 * Software Name : RCS IMS Stack
 *
 * Copyright (C) 2010 France Telecom S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/

package com.orangelabs.rcs.protocol.rtp.core;

/**
 * RTCP packet statistics receiver
 * 
 * @author jexa7410
 */
public class RtcpStatisticsReceiver {
	/**
	 * Number of RTCP packets received
	 */
	public int numRtcpPkts = 0;
	
	/**
	 * Number of RTCP bytes received
	 */
	public int numRtcpBytes = 0;

	/**
	 * Number of RTCP SR packets received
	 */
	public int numSrPkts = 0;
	
	/**
	 * Number of bad RTCP packets received
	 */
	public int numBadRtcpPkts = 0;
	
	/**
	 * Number of unknown RTCP packets received
	 */
	public int numUnknownTypes = 0;
	
	/**
	 * Number of malformed RTCP packets received
	 */
	public int numMalformedRtcpPkts = 0;
}
