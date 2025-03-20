import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class Deserializable implements Serializable{
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try(ObjectInputStream is = new ObjectInputStream(new FileInputStream("abc.txt"))){
				Student s = (Student) is.readObject();
				System.out.println(s);
			}
		}

}
