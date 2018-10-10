public class Dog {
	
	private int age;
	private String name;
	private int humanyears;
	public Dog(int age, String name){
		this.age=age;
		this.name=name;
		humanyears=age*7;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHumanyears() {
		return humanyears;
	}
	public void setHumanyears(int humanyears) {
		this.humanyears = humanyears;
	}

	public String toString(){
		String z = "Name: "+getName()+ " Age: "+getAge()+" In human years: "+getHumanyears();
				return z;
	}
}
