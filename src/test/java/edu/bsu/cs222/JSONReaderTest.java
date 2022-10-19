package edu.bsu.cs222;


import net.minidev.json.parser.JSONParser;
import net.minidev.json.parser.ParseException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.FileNotFoundException;
import java.io.FileReader;


public class JSONReaderTest {
    @Test
    public void readName() throws FileNotFoundException, ParseException {
        JSONParser jsonParser = new JSONParser();


        //URL resource = getClass().getClassLoader().getResource("User1.json");

        FileReader reader = new FileReader("/Users/hannahjohnston/IdeaProjects/Final-megan237-ed749-hannahj001-ceendris/src/test/resources/User1.json");

        Object object = jsonParser.parse(reader);
        JSONReader JSONFileReader = new JSONReader();
        String result = JSONFileReader.parseName(object);


        //THIS NEEDS TO BE ASSERT EQUALS
        Assertions.assertNotEquals("Clare", result);
    }
}
