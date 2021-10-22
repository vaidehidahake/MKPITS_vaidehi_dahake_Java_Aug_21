    import java.io.*;
    class InputStreamReaderEx
    {
	        public static void main(String[] args)
	        {
	            try
	            {
	                InputStream stream = new FileInputStream("G:\\text1.txt");
	                Reader reader = new InputStreamReader(stream);
	                int data = reader.read();
	                while (data != -1)
	                {
	                    System.out.print((char) data);
	                    data = reader.read();
	                }
	            }
	            catch (Exception e)
	            {
	                e.printStackTrace();
	            }
	        }
	    }

