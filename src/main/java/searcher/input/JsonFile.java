package searcher.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.List;

import org.json.JSONArray;

public class JsonFile implements InputClass {

	private String path = null;
	
	public JsonFile(String path) {
		this.path = path;
	}
	
	@Override
	public List<String> getInput() throws Exception {
		// TODO Auto-generated method stub
		
		BufferedReader bReader = new BufferedReader(new FileReader(new File(this.path)));
		String line = null;
		String lines = "";
		while ((line = bReader.readLine()) != null)
			lines += line + System.lineSeparator();
		
		bReader.close();
		
		JSONArray jsonArray = new JSONArray(lines);
		System.out.println(jsonArray);
		
		return null;
	}
	
	public static void main(String[] args) {
		try {
			JsonFile jsonFile = new JsonFile("test.json");
			jsonFile.getInput();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("aaaaaaaaaaaaaaaaaaaa");
		}
	}

}
