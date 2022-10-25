package kodlama.io.rentAcar.entities.concretes;

public class Brands {
	private String  name;
	private int id;
	public Brands() {
		super();
	}
	public Brands(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	

}
