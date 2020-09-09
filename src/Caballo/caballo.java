package Caballo;

import javax.swing.JOptionPane;

public class caballo {
	
	

	public caballo() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int y = 0;
		int x = 0;
		String movimiento = "";
		int nMov = 0;
		 y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor en y"));
		 x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor en x"));	
		 
		
		 if((x+2<9) && (y+1<9)) {
			 movimiento = movimiento + "("+(x+2)+","+(y+1)+")"+"\n";
			 nMov=nMov+1;
		 }
		 if((x+1<9) && (y+2<9)) {
			 movimiento = movimiento +"("+(x+1)+","+(y+2)+")"+"\n";
			 nMov=nMov+1;
		 }
		 if((x-2>0) && (y-1>0)) {
			 movimiento = movimiento +"("+(x-2)+","+(y-1)+")"+"\n";
			 nMov=nMov+1;
		 }
		 if((x-1>0) && (y-2>0)) {
			 movimiento = movimiento +"("+(x-1)+","+(y-2)+")"+"\n";
			 nMov=nMov+1;
		 }
		 
		 if((x+2<9) && (y-1>0)) {
			 movimiento = movimiento +"("+(x+2)+","+(y-1)+")"+"\n";
			 nMov=nMov+1;
		 }
		 if((x+1<9) && (y-2>0)) {
			 movimiento = movimiento +"("+(x-1)+","+(y-2)+")"+"\n";
			 nMov=nMov+1;
		 }
		 
		 if((x-2>0) && (y+1<9)) {
			 movimiento = movimiento +"("+(x-2)+","+(y+1)+")"+"\n";
			 nMov=nMov+1;
		 }
		 if((x-1>0) && (y+2<9)) {
			 movimiento = movimiento +"("+(x-1)+","+(y+2)+")"+"\n";
			 nMov=nMov+1;
		 }
		System.out.println(movimiento+"\n"
				+"Numero de movimentos: "+nMov);
	}

}
