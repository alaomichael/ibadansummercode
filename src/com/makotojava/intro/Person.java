package com.makotojava.intro;
import java.util.logging.Logger;
public class Person {
	// Using class variable
	public static final String GENDER_MALE = "MALE";
	public static final String GENDER_FEMALE = "FEMALE";
	
	
	
	
// Implementing constructor for Person class with logger
	Logger l = Logger.getLogger(Person.class.getName());
	
	private String name;
	private int age;
	   private int height;
	   private int  weight;
	   private String eyeColor;
	   private String gender;
	   
	   public Person(String name, int age, int height, int weight, String eyeColor, String gender) {
		   this.name = name; 
		   this.age = age;
		    this.height = height;
		    this.weight = weight;
		    this.eyeColor = eyeColor;
		    this.gender = gender;
		    }
	

		public Person() {
		// TODO Auto-generated constructor stub
	}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
	   
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getEyeColor() {
		return eyeColor;
	}
	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	

/*
	// Implementing getName() using concat()

	Logger l = Logger.getLogger(Person.class.getName());
		
		private String name;
		// private String firstName;
		// private String lastName;
		private int age;
		   private int height;
		   private int  weight;
		   private String eyeColor;
		   private String gender;
		   
		   public Person(String name, int age, int height, int weight, String eyeColor, String gender) {
			   // this.firstName = firstName;
			   // this.lastName = lastName;
			   this.name = name; 
			   this.age = age;
			    this.height = height;
			    this.weight = weight;
			    this.eyeColor = eyeColor;
			    this.gender = gender;
			    }
		
		/*	public String getFirstName() {
				return firstName;
			}

			public void setFirstName(String firstName) {
				this.firstName = firstName;
			}

			public String getLastName() {
				return lastName;
			}

			public void setLastName(String lastName) {
				this.lastName = lastName;
			}
		   
		public String getFullName() {
			return getFirstName().concat(" ").concat(getLastName());
		}
		
		   
	 public void setName(String name) {
			this.name = name;
		}

			public String getName() {
				return name;
			}

			public void setName(String name) {
				this.name = name;
			}
		   
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getEyeColor() {
			return eyeColor;
		}
		public void setEyeColor(String eyeColor) {
			this.eyeColor = eyeColor;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
	
*/
	// Implementing getName() using + operator
/*	Logger l = Logger.getLogger(Person.class.getName());

	 private String firstName;
	 private String lastName;
	private int age;
	   private int height;
	   private int  weight;
	   private String eyeColor;
	   private String gender;
	   
	   public Person(String firstName, String lastName, int age, int height, int weight, String eyeColor, String gender) {
		   this.firstName = firstName;
	       this.lastName = lastName;
		   this.age = age;
		    this.height = height;
		    this.weight = weight;
		    this.eyeColor = eyeColor;
		    this.gender = gender;
		    }
	
	

	// This is a "derived" method. That is, there is no 1:1 mapping between it and an attribute	
	 public String getFullName() {
			return getFirstName() + " " + getLastName();
		}
	 public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public int getHeight() {
			return height;
		}
		public void setHeight(int height) {
			this.height = height;
		}
		public int getWeight() {
			return weight;
		}
		public void setWeight(int weight) {
			this.weight = weight;
		}
		public String getEyeColor() {
			return eyeColor;
		}
		public void setEyeColor(String eyeColor) {
			this.eyeColor = eyeColor;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}   
	*/
/*	   			
	// using toString()
	public String toString() {
String ret = "Name: " + getName() + "," +
	"Height: " + getHeight() + "," +
	"Weight: " + getWeight() + "," +
	"Eye Color: " + getEyeColor() +  "," +
	"Gender: " + getGender();
		return ret;
	}
	*/
		// using toString() with getFullName()
/*		public String toStringFullName() {
	String ret = "Full name: " + getFullName() + "," +
		"Height: " + getHeight() + "," +
		"Weight: " + getWeight() + "," +
		"Eye Color: " + getEyeColor() +  "," +
		"Gender: " + getGender();
			return ret;
		}
		*/
	
	public void printAudit(StringBuilder buffer) {
		buffer.append("Name=");
		buffer.append(getName());
		buffer.append(",");
		buffer.append("Age=");
		buffer.append(getAge());
		buffer.append(",");
		buffer.append("Height=");
		buffer.append(getHeight());
		buffer.append(",");
		buffer.append("Weight=");
		buffer.append(getWeight());
		buffer.append(",");
		buffer.append("EyeColor=");
		buffer.append(getEyeColor());
		buffer.append(",");
		buffer.append("Gender=");
		buffer.append(getGender());
	
	}
	
	public void printAudit(Logger l) {
		StringBuilder sb = new StringBuilder();
		printAudit(sb);
		l.info(sb.toString());
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((eyeColor == null) ? 0 : eyeColor.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + height;
		result = prime * result + ((l == null) ? 0 : l.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + weight;
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
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (eyeColor == null) {
			if (other.eyeColor != null)
				return false;
		} else if (!eyeColor.equals(other.eyeColor))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (height != other.height)
			return false;
		if (l == null) {
			if (other.l != null)
				return false;
		} else if (!l.equals(other.l))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Person [l=" + l + ", name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight
				+ ", eyeColor=" + eyeColor + ", gender=" + gender + ", getName()=" + getName() + ", getAge()="
				+ getAge() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight() + ", getEyeColor()="
				+ getEyeColor() + ", getGender()=" + getGender() + ", hashCode()=" + hashCode() + ", getClass()="
				+ getClass() + ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", GENDER_MALE);
	}
}

