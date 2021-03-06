package pnnl.goss.gridappsd.api;

import java.io.File;
import java.io.Serializable;

import pnnl.goss.gridappsd.dto.PowerSystemConfig;
import pnnl.goss.gridappsd.dto.RequestSimulation;

/**
 * This class implements subset of functionalities for Internal Functions
 * 405 Simulation Manager and 406 Power System Model Manager.
 * ConfigurationManager is responsible for:
 * - subscribing to configuration topics and 
 * - converting configuration message into simulation configuration files
 *   and power grid model files.
 * @author shar064
 *
 */

public interface ConfigurationManager {
	
	/**
	 * This method returns simulation file path with name.
	 * Return GridLAB-D file path with name for RC1.
	 * @param simulationId
	 * @param configRequest
	 * @return
	 * @throws Exception 
	 */
	File getSimulationFile(int simulationId, RequestSimulation powerSystemConfig) throws Exception;
	String getConfigurationProperty(String key);

}
