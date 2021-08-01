package task3;

import com.google.gson.Gson;
import task3.model.Root;

import java.io.FileReader;

public class GsonParser {

    public Root parse(){

        Gson gson = new Gson();

        try(FileReader reader = new FileReader("C:\\Programming\\Testperfomens\\src\\main\\java\\task3\\values.json")){

            Root root = gson.fromJson(reader, Root.class);

            return root;
        } catch (Exception e){
            System.out.println("Parsing error" + e.toString());
        }
        return null;
    }
}
