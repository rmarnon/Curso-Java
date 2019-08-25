package entities;

public class Political implements Comparable<Political> {

	private String name;
	private Integer quantity;
	
	public Political() {
	}
	
	public Political(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int totVotes(int votes) {
		return quantity += votes;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Political other = (Political) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Political other) {
		return name.toUpperCase().compareTo(other.getName().toUpperCase());
	}	
	
	public String toString() {
		return name + ", " + quantity;
	}
	
}
