
package singh.mahabir.cfg.client.endpoint;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Mahabir Singh
 *
 */
/*
 * @RefreshScope is used to update the bean attribute at runtime if properties
 * changed in config file
 */
//@RefreshScope
@RestController
public class RateRestController {
    // ****************************************************************************************************************
    // ******************************************** Public Fields
    // *****************************************************
    // ****************************************************************************************************************

    @Value("${rate}")
    private String rate;

    @Value("${lanecount}")
    private String laneCount;

    @Value("${tollstart}")
    private String tollStart;

    @Value("${tollstop}")
    private String tollStop;

    @Value("${environment}")
    private String environment;

    /**
     * encoded value
     */
    @Value("${connstring}")
    private String cipher;

    // ****************************************************************************************************************
    // ****************************************** Non Public Fields
    // ***************************************************
    // ****************************************************************************************************************

    // ****************************************************************************************************************
    // ******************************************** Public Methods
    // ****************************************************
    // ****************************************************************************************************************

    @GetMapping(path = "/rate", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<LaneResponse> getMessage() {
//	return "rate: " + rate + "\n" + "laneCount: " + laneCount + "\n" + "tollstart " + tollStart;
	return ResponseEntity.ok(new LaneResponse(rate, laneCount, tollStart, tollStop, environment));
    }

    @GetMapping(path = "/cipher", produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    public ResponseEntity<String> ciphervalue() {
	return ResponseEntity.ok(cipher);
    }

    // ****************************************************************************************************************
    // ****************************************** Non Public Methods
    // **************************************************
    // ****************************************************************************************************************
}
