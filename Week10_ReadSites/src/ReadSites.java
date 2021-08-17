import java.net.*;
import java.io.*;

// still need java.io.* as we still use streams [openStream] and readLine methods

public class ReadSites {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.println("==================" +  args[i] + "=================");
			try {
				URL url = new URL("http://" + args[i]);
				
				InputStream is = url.openStream();
				// openStream may throw IOException; and returns input-stream [so byte 
				// based not char based]
				
				// we wrap is by an InputStreamReader
				// recall for readers, this readers returns char based
				InputStreamReader isr = new InputStreamReader(is);
				// wrapped by buffered-reader (instead of going to resource on web for each and every access
				// char) its more efficient to use bufferedReader
				BufferedReader br = new BufferedReader(isr);
				
				String theLine;
				// as long as there are things to be read on that web-site (not returned null) keep printing
				while ((theLine = br.readLine()) != null) {
					System.out.println(theLine);
				}
				
				br.close();
			} catch (MalformedURLException e) {
				System.err.println(e);
			} catch (IOException e) {
				System.err.println(e);
			}
		}
	}
}