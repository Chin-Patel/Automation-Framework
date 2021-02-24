package automationFramework.utils

import automationFramework.cucumber.World
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import com.google.inject.Inject


class CustomFunctions{



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

}
