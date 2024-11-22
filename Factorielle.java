package tp8;

public class Factorielle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, nbEntiers=0, factorielle=1;
		int ancien;
		nbEntiers= Integer.parseInt(args[0]); 
		try {
			nbEntiers= Integer.parseInt(args[0]);
			
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Donnez en paramètre la base de la factorielle");
			
		}
		try {
			nbEntiers= Integer.parseInt(args[0]);
			
		}
		catch(NumberFormatException e2) {
			System.out.println("La base de la factorielle doit être ENTIERE");
		}
		try {
			nbEntiers= Integer.parseInt(args[0]);
			if(nbEntiers<0) {
				throw new NegatifNumberException ("la factorielle d'un nombre négatif n'est pas définie");
			}
		}
		catch(NegatifNumberException e3) {
			System.out.println(e3.getMessage());
		}
		for (i=2;i<= nbEntiers;i++){
			ancien=factorielle;
			factorielle *= i;
		}
			System.out.println(" Voila la factorielle des "+ nbEntiers +" premiers entiers : "+ factorielle );

		

	}


}
