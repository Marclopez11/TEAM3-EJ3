package ej3;

//@Author Eloy Martorell
//@Author Marc Lopez
//19/04/2022

public class Ej3App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Creamos el libro 1
		Libro libro = new Libro("978-84-18089-11-4", "Guerra de liberación", "Franco Bahamonde, Francisco", 160);
		System.out.println("Libro 1");
		System.out.println(libro);

		
		//Creamos el libro 2
		Libro libro2 = new Libro("978-84-08-24702-9", "Enciclopedia nazi", "Eslava Galán, Juan", 120);
		System.out.println("Libro 2");
		System.out.println(libro2);
		
		
		//comparamos las páginas
		compararPaginas(libro,libro2);

	}
	
	
	//Comparamos recogiendo el valor de las paginas de cada libro
	public static void compararPaginas(Libro x, Libro y) {
		
		if(x.getNumeroPaginas() > y.getNumeroPaginas()) {
			System.out.println(x.getTitulo()+" tiene "+x.getNumeroPaginas()+" páginas. Tiene mas páginas que "+y.getTitulo());
		}else {
			System.out.println(y.getTitulo()+" tiene "+y.getNumeroPaginas()+" páginas. Tiene mas páginas que "+x.getTitulo());

		}
		
	}

}
