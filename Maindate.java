package tp8;

public class Maindate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nbEntiers,jour;
		nbEntiers= Integer.parseInt(args[0]);
		try {
			nbEntiers= Integer.parseInt(args[0]);
			if(nbEntiers<1 ||  nbEntiers>12) {
				throw new MoisException("mois invalide");
			}
			
		}
		catch(MoisException m) {
			System.out.println(m.getMsg());
		}
		jour=Integer.parseInt(args[1]);
		try {
			jour= Integer.parseInt(args[1]);
			if(jour<1 ||  jour>31) {
				throw new JourException("jour invalide");
			}
			
		}
		catch(JourException j) {
			System.out.println(j.getMsg());
		

	}

	}
	}
