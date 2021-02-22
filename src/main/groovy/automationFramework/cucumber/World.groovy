import automationFramework.utils.CustomFunctions
import com.fasterxml.jackson.databind.JsonNode


public class World{
    CustomFunctions customFunctions = new CustomFunctions()
    JsonNode dataNode = null
    JsonNode envNode = null
    JsonNode configNode = null
    public World(){
        println("Instantiating World")


    }

}

