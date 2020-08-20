public class  BMICalculator {
    public static void main(String[] args) { 
        float weight = Float.parseFloat(args[0]);
        float height = Float.parseFloat(args[1]);
        float heightm = height/100; 
        float heightm2 = heightm*heightm;
        float  BMI = weight/heightm2;

        System.out.println("Your weight: " + weight + " kg");
        System.out.println("Your height: " + height + " cm");
        System.out.println("Your BMI: " + BMI);

        if (BMI < 18.5 ) {
            System.out.println("You are in the Underweight range.");
        }
        if (BMI >= 18.5  && BMI <= 24.9) {
            System.out.println("You are in the Normal range.");
        }
        if (BMI >= 25  && BMI <= 29.9) {
            System.out.println("You are in the Overweight range.");
        }
        if (BMI >= 30) {
            System.out.println("You are in the Obese range.");
        }
       
    }   

    
}