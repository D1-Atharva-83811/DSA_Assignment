import java.util.Arrays;

class employee {
	int id;
	String name;
	int salary;

	public employee(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
	

}

public class Assignment2_Q3 {
	
	
	public static void empSort(employee[] emps , int size) {
		
		for(int i=1 ; i<size ; i++)
		{
			employee temp = emps[i];
			int j = i-1;
			
			while(j>=0 && emps[j].salary>temp.salary)
			{
				emps[j+1] = emps[j];
				j--;
			}
			emps[j+1] = temp;
		}
		
	}

	public static void main(String[] args) {

		employee[] emps = { new employee(1, "Nisank", 50000), new employee(2, "Yogesh", 7000), new employee(3, "swapnil", 55000), new employee(4, "karan", 70000) };
		
		System.out.println("Array before sort: " + Arrays.toString(emps));
		empSort(emps, emps.length);
		System.out.println("Array After sort: " + Arrays.toString(emps));

	}

}
