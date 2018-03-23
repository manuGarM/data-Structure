
public class Alumno {
	private int identificacion;
	private String nombre;
	private double nota1;
	private double nota2;
	private double nota3;
	private double promedio;
	public Alumno(int identificacion, String nombre, double nota1, double nota2, double nota3) {
		super();
		this.identificacion = identificacion;
		this.nombre = nombre;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;
		
	}
	public int getIdentificacion() {
		return identificacion;
	}
	public void setIdentificacion(int identificacion) {
		this.identificacion = identificacion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append(getNombre());
		sb.append("\n  ID   ");
		sb.append(getIdentificacion());
		sb.append("\n  NOTA1  ");
		sb.append(getNota1());
		sb.append("\n  NOTA2  ");
		sb.append(getNota2());
		sb.append("\n  NOTA3  ");
		sb.append(getNota3());
		return sb.toString();
	}

}
