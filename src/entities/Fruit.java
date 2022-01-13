package entities;

public class Fruit {
	protected int id;
	/*Protected means that you can access this
	 * anywhere in the same package
	 */
	
	@Override
	//overridden from the Object class
	public String toString() {
		return "Fruit [id=" + id + "]";
	}
}
