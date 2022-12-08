public class Main {
    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);

        System.out.println(stack.isEmpty());

        stack.push(new Employee("Reksa","Ariansyah", 1));
        stack.push(new Employee("Edo","Kondologit",2));
        stack.push(new Employee("Hakim","Ziyech",3));
        stack.push(new Employee("Bono","Galagher",4));
        stack.push(new Employee("Hakim","Ziyech",3));
        stack.push(new Employee("Bono","Galagher",4));
        stack.push(new Employee("Reksa","Ariansyah", 1));
        stack.push(new Employee("Edo","Kondologit",2));


        //System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        //stack.printStack();
    }
}