import java.io.*;
public class TwoRact {
    public static void main(String[] args){
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));	
		try{
			double pp1[]= new double[4];
			double pp2[]= new double[4];
			System.out.print("masukan Koordinat x Persegi panjang 1: ");
			pp1[0] = Double.parseDouble(input.readLine());
			System.out.print("masukan Koordinat y Persegi panjang 1: ");
			pp1[1] = Double.parseDouble(input.readLine());
			System.out.print("masukan Panjang Persegi panjang 1: ");
			pp1[2] = Double.parseDouble(input.readLine());
			System.out.print("masukan Tinggi x Persegi panjang 1: ");
			pp1[3] = Double.parseDouble(input.readLine());
			System.out.println("===============================================");
			System.out.print("masukan Koordinat x Persegi panjang 2: ");
			pp2[0] = Double.parseDouble(input.readLine());
			System.out.print("masukan Koordinat y Persegi panjang 2: ");
			pp2[1] = Double.parseDouble(input.readLine());
			System.out.print("masukan Panjang Persegi panjang 2: ");
			pp2[2] = Double.parseDouble(input.readLine());
			System.out.print("masukan Tinggi Persegi panjang 2: ");
			pp2[3] = Double.parseDouble(input.readLine());

			String message= checking(pp1,pp2);
			System.out.println(message);		
		}catch(IOException ex){
			System.out.println(ex.toString());
		}
    }
	private static String checking(double[] pp1, double[] pp2){
		String message="";
		// Determine whether the second rectangle is inside the first
		if	((Math.pow(Math.pow(pp2[1] - pp1[1], 2), .05) + pp2[3] / 2 <= pp1[3] / 2) && 
			(Math.pow(Math.pow(pp2[0] - pp1[0], 2), .05) + pp2[2] / 2 <= pp1[2] / 2) &&
			(pp1[3] / 2 + pp2[3] / 2 <= pp1[3]) &&
			(pp1[2] / 2 + pp2[2] / 2 <= pp1[2]))
			{message="pp2 didalam pp1";}
		else if ((pp1[0] + pp1[2] / 2 > pp2[0] - pp2[2]) ||
					(pp1[1] + pp1[3] / 2 > pp2[1] - pp2[3]))
			{message="r2 Memotong r1";}
		else
			{message="r2 tidak memotong r1";}
		return message;
	}
}