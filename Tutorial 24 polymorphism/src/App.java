
public class App {
	public static void main(String[] args) {
		Plant plant = new Plant();
		Tree tree = new Tree()	;
		
		//This makes the 2nd reference to the same object plant1 refers to (There is only 1 object and it had memory allocated to it by "new Plant()")
		Plant plant1 = plant;
		//Due to polymorphius you can always use 'tree' being a sub-class where there is 'plant' being its parent class.
		Plant plant2 = tree;
		
		Tree plant3	= tree;
		
		//What matters is the type of the actual object the variables plant1 and plant2 references are pointing at, rather than the type of variables themselves. 
		plant1.grow(); /*outputs plant string*/
		plant2.grow(); /*outputs tree string*/
		plant3.grow(); /*outputs tree string*/
		
		//When you're calling a method it's the type of variable that matters, rather than the type of the object it's referencing to. 
		tree.shedLeaves();
		//plant1.shedLeaves();
		//plant2.shedLeaves();
		
		doGrow(tree);
		doGrow(plant1);
	}
	
	public static void doGrow(Plant plant) {
		plant.grow();
	}
	public static void doGrow(Tree tree) {
		tree.shedLeaves();
	}
}
