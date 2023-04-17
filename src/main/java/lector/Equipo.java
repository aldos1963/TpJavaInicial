package lector;

public class Equipo 
{	//Atributos de la clase.
	public int id;
	public String nombre;
	public String descripcion;
	//Constructor con el mismo nombre de la clase.
	public Equipo(int nuevoId, String nuevoNombre, String nuevaDescripcion)
	{
		id = nuevoId;
		nombre = nuevoNombre;
		descripcion = nuevaDescripcion;
		//Prints
		System.out.println("Equipo Creado: ");
		System.out.println("	Id del Equipo: " + getId());
		System.out.println("	Nombre: " + getNombre());
		System.out.println("	Descripcion: " + getDescripcion());
		System.out.println(" ");
	} 
	//Metodo para conseguir el id del equipo.
	public int getId()
	{
		return id;
	}
	//Metodo para asignar el id del equipo.
	public void setId(int id)
	{
		this.id = id;
	}
	//Metodo para conseguir el nombre del equipo.
	public String getNombre()
	{
		return nombre;
	}
	//Metodo para asignar el nombre del equipo.
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	//Metodo para conseguir la descripcion del equipo.
	public String getDescripcion()
	{
		return descripcion;
	}
	//Metodo para asignar la descripcion del equipo.
	public void setDescripcion(String descripcion)
	{
		this.descripcion = descripcion;
	}
}