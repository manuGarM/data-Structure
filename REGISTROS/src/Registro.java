import javax.swing.JOptionPane;


public class Registro {
	
	Alumno[] alumnos = new Alumno[10];
	
	public void inicializar() {
		alumnos[0]= new Alumno (9867565  ,"jorge perez", 2.5 , 4.4 , 1.0);
		alumnos[1]= new Alumno (9846457  ,"andrea mora", 3.5 , 4.4 , 3.0);
		alumnos[2]= new Alumno (5645544  ,"daniel rojas", 2.5 , 1.4 , 5.0);
		alumnos[3]= new Alumno (8455666  ,"sara garcia ", 1.5 , 4.4 , 3.0);
		alumnos[4]= new Alumno (1324344  ,"esteban casas", 4.5 , 2.4 , 2.0);
		alumnos[5]= new Alumno (2456644  ,"nancy roldan", 2.5 , 4.4 , 4.0);
		alumnos[6]= new Alumno (7545355  ,"isaac ariza", 2.5 , 4.4 , 1.0);
		alumnos[7]= new Alumno (9245666  ,"andres monsalve", 2.9 , 3.4 , 5.0);
		alumnos[8]= new Alumno (5433465  ,"jorge gonzalez", 2.3 , 4.4 , 2.0);
		alumnos[9]= new Alumno (9453554  ,"liliana beltran", 2.5 , 4.9 , 1.0);
	}
	
	public void desplegar()
	{
		JOptionPane.showMessageDialog(null, alumnos[0].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[1].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[2].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[3].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[4].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[5].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[6].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[7].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[8].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, alumnos[9].toString(),"REGISTRO", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public void  promedio()
	{
		
	}
	
	
	public static void main (String [] args)
	{
		Registro r1= new Registro();
		r1.inicializar();
		r1.desplegar();
	}

}
