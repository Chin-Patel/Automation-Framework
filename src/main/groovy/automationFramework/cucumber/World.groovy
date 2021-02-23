package automationFramework.cucumber
import automationFramework.utils.CustomFunctions
import com.fasterxml.jackson.databind.JsonNode
import com.google.inject.Singleton
import org.apache.commons.io.FileUtils

@Singleton
class World{
    public final CustomFunctions customFunctions = new CustomFunctions()
    public final String USER_DIR = System.getProperty("user.dir")
    public final String env = System.getProperty("env")
    JsonNode dataNode = null
    JsonNode envNode = null
    JsonNode configNode = null
    public World(){
        println("Instantiating World")
        println("Testing in environment: ${env}")
        println("Loading test data")
        String dataFilePath = USER_DIR + "/src/test/resources/testdata/" + env + "/data.yml"
        dataNode = customFunctions.yamlToJson(FileUtils.readFileToString(new File(dataFilePath), "UTF-8"))
        println("Loaded Data")

    }

}

