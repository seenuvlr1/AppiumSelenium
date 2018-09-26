import java.io.File;

public class KnowmyPath {

	static void method()
	{
		File classpathRoot = new File(System.getProperty("user.dir"));
		System.out.println(classpathRoot);
		//File appDir = new File(classpathRoot, "app/build/outputs/apk/");
		System.out.println(classpathRoot);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method();
		
	}

}
