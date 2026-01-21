package herencias;

public class Principal {

	public static void main(String[] args) {
		Hora h = new Hora(11, 56);
		System.out.println(h);
		h.inc();
		System.out.println(h);
		h.inc();
		System.out.println(h);
		h.inc();
		System.out.println(h);
		h.inc();
		System.out.println(h);
		h.inc();
		System.out.println(h);
		h.inc();
		System.out.println(h);
		h.inc();
		System.out.println(h);
		h.inc();
		
		Hora12 h2 = new Hora12(11, 56, "am");
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		h2.inc();
		System.out.println(h2);
		h2.inc();
		
		HoraExacta h3=new HoraExacta(23, 59, 56);
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		System.out.println(h3);
		h3.inc();
		
		HoraExacta h4=new HoraExacta(22,33,5);
		HoraExacta h5=new HoraExacta(22,33,1);
		System.out.println(h4.equals(h5));
		h2.inc();
		System.out.println(h4.equals(h5));
		h2.inc();
		System.out.println(h4.equals(h5));
		h2.inc();
		System.out.println(h4.equals(h5));
		h2.inc();
		System.out.println(h4.equals(h5));
		h2.inc();
		
	}

}
