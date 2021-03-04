package automationFramework.utils

import automationFramework.cucumber.World
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.google.inject.Inject
import org.apache.commons.io.FileUtils


class CustomFunctions{

    @Inject World world

    yamlToJson(String filePath){
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory())
        try{
            JsonNode jsonNode = mapper.readTree(filePath)
            return (JsonNode) new ObjectMapper().readTree(jsonNode.toString())
        }catch(FileNotFoundException e){
            println ("failed to convert yaml -> json")
        }
        return null
    }

    void loadDataFile(){
        ObjectMapper mapper = new ObjectMapper()
        File runtimeData = new File(world.USER_DIR + world.RUNTIME_DATA_PATH)
        if(runtimeData.exists()){
            world.dataNode = mapper.readTree(FileUtils.readFileToString(runtimeData, Constants.DEFAULT_CHARSET))
        }
    }

}
