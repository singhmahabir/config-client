/**
 *
 */
package singh.mahabir.cfg.client.endpoint;

/**
 * @author Mahabir Singh
 *
 */
//@XmlRootElement
public class LaneResponse {

    private final String rate;

    private final String laneCount;

    private final String tollStart;

    private final String tollstop;

    private final String environment;

    public LaneResponse(String rate, String laneCount, String tollStart, String tollstop, String environment) {
	this.rate = rate;
	this.laneCount = laneCount;
	this.tollStart = tollStart;
	this.tollstop = tollstop;
	this.environment = environment;
    }

    /**
     * @return the rate
     */
    public String getRate() {
	return rate;
    }

    /**
     * @return the laneCount
     */
    public String getLaneCount() {
	return laneCount;
    }

    /**
     * @return the tollStart
     */
    public String getTollStart() {
	return tollStart;
    }

    /**
     * @return the tollstop
     */
    public String getTollstop() {
	return tollstop;
    }

    /**
     * @return the environment
     */
    public String getEnvironment() {
	return environment;
    }
}
