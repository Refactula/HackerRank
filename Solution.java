import java.io.*;

public class Solution {

	//region Commons
	StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in))){{wordChars(21, 256);}};
	PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
	double readDouble(){try{in.nextToken();return in.nval;}catch(IOException e){throw new RuntimeException(e);}}
	String readWord(){try{in.nextToken();return in.sval;}catch(IOException e){throw new RuntimeException(e);}}
	int readInt(){return(int)readDouble();}
	long readLong(){return(long)readDouble();}
	public static void main(String[] args){Solution solution = new Solution();solution.solve();solution.out.flush();}
	//endregion

	void solve() {
		
	}

}
