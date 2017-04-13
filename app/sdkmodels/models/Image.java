package sdkmodels.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.node.ObjectNode;
import play.libs.Json;
import play.mvc.Http;

/**
 * Created by alexis on 5/3/16.
 */
public class Image {
    public String imageURL;
    public String uploadKey;
    public @JsonIgnore
    Http.MultipartFormData.FilePart filePart;

    public Object toJSON() {
        ObjectNode json = Json.newObject();
        if ( imageURL != null ) {
            json.put("imageURL", imageURL);
        }
        if ( uploadKey != null ) {
            json.put("uploadKey", uploadKey);
        }
        return json;
    }
}
