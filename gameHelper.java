import java.io.* ; 
public class gamehelper {
	public string getuserinput(string prompt) {
		stringinputline = null;
		system.out.print(prompt + "  ");
		bufferedread is = new bufferedread(new imputstreamreader(system.in));
		inputline = is.readeline();
		if (inputline.length() == 0 ) return null;
	} catch (ioexception e) {
		system.out.println("ioexception: " + e );
	}
	return inputline;
}
}
