import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Student s = new Student(1,"Pallavi");
		try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("abc.txt"))){
			os.writeObject(s);
			System.out.println("Object serialized successfully");
		}
	}
}
