package automationFramework.utils

import automationFramework.cucumber.World
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.google.inject.Inject


class CustomFunctions{

    @Inject
    World world

    public yamlToJson(String filePath){
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
        final RUNTIME_DATA_PATH = "/src/test/resources"
        ObjectMapper mapper = new ObjectMapper()
        File runtimeData = new File(world.USER_DIR + RUNTIME_DATA_PATH)
        if(runtimeData.exists()){

        }
    }

}
