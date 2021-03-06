package server;

import Helpers.Constants;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

class DataConnector {

    @SuppressWarnings("unchecked")
    List<Deposit> getData() {
        File dataFile = new File(Constants.DATA_FILE);
        ObjectMapper mapper = new ObjectMapper();
        LinkedList<Deposit> data;
        if (dataFile.exists()) {
            try {
                data = mapper.readValue(dataFile, new TypeReference<LinkedList<Deposit>>(){});
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
        return data;
    }

    boolean writeData(List<Deposit> data) {
        File dataFile = new File(Constants.DATA_FILE);
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(dataFile, data);
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
