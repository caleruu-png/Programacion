package examen2ev.biblioteca.fuentes;


public abstract class MaterialBibliografico implements Prestable{
    protected String titulo;
    protected String autor;
    protected int anoPublicacion;
    protected boolean prestado;
    
    public MaterialBibliografico(String titulo, String autor, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacion = anoPublicacion;
        this.prestado = false;
    }
    
    public MaterialBibliografico(String titulo, int anoPublicacion) {
        this.titulo = titulo;
        this.autor = "-";
        this.anoPublicacion = anoPublicacion;
        this.prestado = false;
	}

	public boolean prestar() {
		boolean puedePrestarse=!estaPrestado();
        if (puedePrestarse) {
            this.prestado = true;
        }
        return puedePrestarse;
    }
    
    public boolean devolver() {
    	boolean puedeDevolverse=estaPrestado();
    
        if (puedeDevolverse) {
            this.prestado = false;
        } 
        return puedeDevolverse;
    }
    
    public boolean estaPrestado() {
        return this.prestado;
    }
    
    public String toString() {
       return ("\n\n* Título: " + this.titulo+"\n"
       		+ "Autor: " + this.autor+"\n"
       		+ "Año de publicación: " + this.anoPublicacion
       		+" \nprestado: "+prestado
       		);
    }
	
}
