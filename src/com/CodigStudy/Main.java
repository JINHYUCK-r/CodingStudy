package com.CodigStudy;
import java.io.*;
import java.util.StringTokenizer;


//BufferedReader 사용 
/*
public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //반복할 횟수 입력 
        int n = Integer.parseInt(br.readLine().trim());
       
        for (int i=0; i < n; i++) {
        	//더할 숫자 값 받기 
            String text = br.readLine();
            //띄어쓰기를 기준으로 분할 
            String[] word = text.split(" ");
            int a = Integer.parseInt(word[0]);
            int b = Integer.parseInt(word[1]);
            bw.write("case #"+(i+1)+": "+ (a+b) + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}
*/
/*
public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //반복할 횟수 입력 
        int n = Integer.parseInt(br.readLine());
       
        for (int i=n; i > 0; i--) {
   
            bw.write((i) + "\n");
        }
        
        bw.flush();
        bw.close();
		
	}
}
*/


 //BufferedReader 와  StringTokenizer 사용 
public class Main {
	public static void main(String args[]) throws IOException {
 
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int A;
		int B;
        //readLine은 한줄 전체를 읽어오기때문에 StringTokenize를 이용하여 분할시켜주어야한다.
		StringTokenizer st;
		for (int i = 1; i <= T; i++) {
			st = new StringTokenizer(br.readLine()," ");
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
		}
		br.close();
	}
 
}