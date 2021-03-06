package sdkmodels.models;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.joda.time.DateTime;
import play.libs.Json;
import sdkmodels.utils.Constants;

/**
 * Created by alexis on 5/3/16.
 */
public class DateRange {
    private DateTime from;
    private DateTime to;

    public DateRange() {}

    /**
     * Constructs an ATDataRange object
     * @param date1 The earliest date
     * @param date2 The latest date
     */
    public DateRange(DateTime date1, DateTime date2) {
        from = date1;
        to = date2;
    }

    /**
     *
     * @return a DateTime of the earliest date in range
     */
    public DateTime getFrom() {
        return from;
    }

    /**
     * Sets the earliest date in range
     * @param date DateTime
     */
    public void setFrom(DateTime date) {
        from = date;
    }

    /**
     *
     * @return a DateTime of the latest date in range
     */
    public DateTime getTo() {
        return to;
    }

    /**
     * Sets the latest date in range
     * @param date DateTime
     */
    public void setTo(DateTime date) {
        to = date;
    }

    public ObjectNode toJSON() {
        ObjectNode json = Json.newObject();
        if ( from != null ) {
            json.put("from", Constants.AppTreeDateFormat.print(from));
        }
        if ( to != null ) {
            json.put("to", Constants.AppTreeDateFormat.print(to));
        }
        return json;
    }
}
